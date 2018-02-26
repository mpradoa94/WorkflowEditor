package diagrameditor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.BadLocationException;

public class AutoCompletar {

    private PanelSugerencias sugerencias;
    private JTextArea textarea;
    private List diccionario;

    public AutoCompletar(JTextArea textarea, List dicc) {
        this.textarea = textarea;
        this.diccionario = dicc;
    }

    public void init() {
        addKeyListener();
        Collections.sort(diccionario);
    }

    private void addKeyListener() {
        textarea.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                    if (sugerencias != null) {
                        if (sugerencias.insertarSeleccion()) {
                            e.consume();
                            final int posicion = textarea.getCaretPosition();
                            SwingUtilities.invokeLater(() -> {
                                try {
                                    textarea.getDocument().remove(posicion - 1, 1);
                                } catch (BadLocationException e1) {
                                    e1.printStackTrace();
                                }
                            });
                        }
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DOWN && sugerencias != null) {
                    sugerencias.moverAbajo();
                } else if (e.getKeyCode() == KeyEvent.VK_UP && sugerencias != null) {
                    sugerencias.moverArriba();
                } else if (Character.isLetterOrDigit(e.getKeyChar()) || e.getKeyChar() == '@') {
                    mostrarSugerenciaLater();
                } else if (Character.isWhitespace(e.getKeyChar())) {
                    ocultarSugerencia();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }
        });

    }

    protected void mostrarSugerenciaLater() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mostrarSugerencia();
            }

        });
    }

    protected void mostrarSugerencia() {
        ocultarSugerencia();
        
        final String subStr;
        final int caretPos = textarea.getCaretPosition();
        String texto = textarea.getText();      
        Point posicion = getPosicion(caretPos);
        int inicio = Math.max(0, caretPos - 1);
        
        while (inicio > 0) {
            if (!Character.isWhitespace(texto.charAt(inicio))) {
                inicio--;
            } else {
                inicio++;
                break;
            }
        }
        if (inicio > caretPos) {
            return;
        }
        
        subStr = texto.substring(inicio, caretPos);
        if (subStr.length() < 1) {
            return;
        }
        sugerencias = new PanelSugerencias(textarea, caretPos, subStr, posicion);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                textarea.requestFocusInWindow();
            }
        });
    }

    private void ocultarSugerencia() {
        if (sugerencias != null) {
            sugerencias.ocultar();
        }
    }
    
    private Point getPosicion(int caretPos){
        try {
            return textarea.modelToView(caretPos).getLocation();
        } catch (BadLocationException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public class PanelSugerencias {

        private JList list;
        private JPopupMenu popupMenu;
        private String subStr;
        private final int insertionPosition;

        public PanelSugerencias(JTextArea textarea, int position, String subStr, Point location) {
            this.insertionPosition = position;
            this.subStr = subStr;
            popupMenu = new JPopupMenu();
            popupMenu.removeAll();
            popupMenu.setOpaque(false);
            popupMenu.setBorder(null);
            popupMenu.add(list = CrearListaSugerencias(subStr), BorderLayout.CENTER);
            popupMenu.show(textarea, location.x, textarea.getBaseline(0, 0) + location.y);
        }

        public void ocultar() {
            popupMenu.setVisible(false);
            if (sugerencias == this) {
                sugerencias = null;
            }
        }

        private JList CrearListaSugerencias(final String subStr) {
            List<String> sugerencias = new ArrayList();
            for (Object elemento : diccionario) {
                String str = elemento.toString();
                if (str.startsWith(subStr)) {           
                    sugerencias.add(str);
                }
            }

            JList list = new JList(sugerencias.toArray());
            list.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            list.setSelectedIndex(0);
            list.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) {
                        insertarSeleccion();
                    }
                }
            });
            return list;
        }

        public boolean insertarSeleccion() {
            if (list.getSelectedValue() != null) {
                try {
                    final String seleccionado = ((String) list.getSelectedValue()).substring(subStr.length());
                    textarea.getDocument().insertString(insertionPosition, seleccionado, null);
                    return true;
                } catch (BadLocationException e1) {
                    e1.printStackTrace();
                }
                ocultarSugerencia();
            }
            return false;
        }

        public void moverArriba() {
            int index = Math.min(list.getSelectedIndex() - 1, 0);
            seleccionIndex(index);
        }

        public void moverAbajo() {
            int index = Math.min(list.getSelectedIndex() + 1, list.getModel().getSize() - 1);
            seleccionIndex(index);
        }

        private void seleccionIndex(int index) {
            final int position = textarea.getCaretPosition();
            list.setSelectedIndex(index);
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    textarea.setCaretPosition(position);
                };
            });
        }
    }
}
