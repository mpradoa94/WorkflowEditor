/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import core.webmet.OpcionDTO;
import core.webmet.PreguntaDTO;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.Field;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author MPA
 */
public class JPanelPropiedadesNodo extends JPanel {

    //TODO: refactor
    private final Nodo nodo;
    private GridBagConstraints gridBagConstraints;

    public JPanelPropiedadesNodo(Nodo nodo) {
        this.nodo = nodo;
        initComponents();
    }

    private void initComponents() {
        this.setBorder(BorderFactory.createEmptyBorder(5, 5, 20, 5));

        JLabel titulo1 = new JLabel("Propiedades");
        JLabel titulo2 = new JLabel(nodo.getEtiqueta());
        int posY = 0;

        setLayout(new GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();

        titulo1.setFont(new java.awt.Font("Tahoma", 1, 14));
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = posY;
        posY += 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 24, 0, 91);
        add(titulo1, gridBagConstraints);

        titulo2.setFont(new java.awt.Font("Tahoma", 1, 12));
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = posY;
        posY += 1;
        add(titulo2, gridBagConstraints);

        agregarPropiedadesNodo(posY);

        this.setPreferredSize(this.getPreferredSize());
    }

    private void agregarPropiedadesNodo(int posY) {
        for (Field propiedad : nodo.getClass().getDeclaredFields()) {
            if (!"etiqueta".equals(propiedad.getName())) {
                propiedad.setAccessible(true);
                crearComponente(propiedad, posY);
                posY++;
            }
        }
    }

    private void crearComponente(Field propiedad, int posY) {
        agregarEtiquetaNombre(propiedad.getName(), posY);
        agregarCampo(propiedad, posY);

    }

    private Object obtenerValor(Field propiedad) {
        try {
            return propiedad.get(nodo);
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(JPanelPropiedadesNodo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private void agregarEtiquetaNombre(String nombre, int posY) {
        JLabel nombrePropiedad = new JLabel(nombre);
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = posY;
        add(nombrePropiedad, gridBagConstraints);
    }

    private void agregarCampo(Field propiedad, int posY) {
        Class<?> tipo = propiedad.getType();
        Object valor = obtenerValor(propiedad);

        gridBagConstraints.weightx = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = posY;

        if (tipo.isAssignableFrom(Integer.TYPE)) {
            JSpinner campo = new JSpinner();
            if (valor != null) {
                campo.setValue(valor);
            }

            campo.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    try {
                        propiedad.setInt(nodo, (int) campo.getValue());
                    } catch (IllegalArgumentException | IllegalAccessException ex) {
                        Logger.getLogger(JPanelPropiedadesNodo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            add(campo, gridBagConstraints);
        } else if (tipo.isAssignableFrom(String.class)) {
            JTextField campo = null;
            if (valor != null) {
                campo = crearCampoTexto(propiedad, valor.toString(), true);
            } else {
                campo = crearCampoTexto(propiedad, "", true);
            }

            add(campo, gridBagConstraints);

        } else {
            switch (propiedad.getName()) {
                case "tipo":
                    if (valor != null) {
                        add(crearCampoTexto(propiedad, valor.toString(), false),
                                gridBagConstraints);
                    } else {
                        add(crearCampoTexto(propiedad, "", false),
                                gridBagConstraints);
                    }
                    break;
                case "rol":
                    if (valor != null) {
                        add(crearCampoTexto(propiedad, ((Nodo) valor).getNombre(), false),
                                gridBagConstraints);
                    } else {
                        add(crearCampoTexto(propiedad, "", false),
                                gridBagConstraints);
                    }
                    break;
                case "cuestionarioSeleccionado":
                    add(crearCampoCuestionario(posY), gridBagConstraints);
                    break;
                case "preguntaSeleccionada":
                    add(crearCampoTexto(propiedad, "", false),
                            gridBagConstraints);
                    break;
                case "opcionSeleccionada":
                    add(crearCampoTexto(propiedad, "", false),
                            gridBagConstraints);
                    break;
            }
        }

    }

    private JTextField crearCampoTexto(Field propiedad, String texto, Boolean editable) {
        JTextField campo = new JTextField(10);
        campo.setText(texto);
        campo.setEditable(editable);

        campo.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                setPropiedad();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setPropiedad();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setPropiedad();
            }

            public void setPropiedad() {
                try {
                    propiedad.set(nodo, campo.getText());
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(JPanelPropiedadesNodo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        return campo;
    }

    private JComboBox crearCampoCuestionario(int posY) {
        List<Cuestionario> modelos = Cuestionario.getOpcionesCuestionario();
        JComboBox combo = new JComboBox();

        if (modelos.isEmpty()) {
            combo.addItem("Sin cuestionarios disponibles");
            combo.setEnabled(false);
        } else {
            combo = new JComboBox(new DefaultComboBoxModel(modelos.toArray()));

            if (nodo instanceof NodoCondicion) {
                NodoCondicion nodoCond = (NodoCondicion) nodo;
                combo.setSelectedItem(nodoCond.getcuestionarioSeleccionado());

                combo.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JComboBox comboBox = (JComboBox) e.getSource();
                        Cuestionario item = (Cuestionario) comboBox.getSelectedItem();
                        nodoCond.setcuestionarioSeleccionado(item);
                        agregarCampoPregunta(posY + 1);

                    }

                });
            }
        }

        return combo;
    }

    private void agregarCampoPregunta(int posY) {
        limpiarCampo(posY);
        if (nodo instanceof NodoCondicion) {
            NodoCondicion nodoCond = (NodoCondicion) nodo;
            Cuestionario cuestionario = nodoCond.getcuestionarioSeleccionado();
            if (cuestionario != null) {
                int idModelo = cuestionario.getModelo().getIdModelo();
                List<Pregunta> preguntas = Pregunta.getPreguntas(idModelo);
                JComboBox combo = new JComboBox(new DefaultComboBoxModel(preguntas.toArray()));
                combo.setSelectedItem(nodoCond.getPreguntaSeleccionada());
                combo.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        nodoCond.setPreguntaSeleccionada(((Pregunta) e.getItem()).getPreguntaDTO());
                        agregarCampoOpcion(nodoCond.getPreguntaSeleccionada(), posY + 1);
                    }

                });

                gridBagConstraints.gridy = posY;
                add(combo, gridBagConstraints);
                revalidate();
                repaint();
            }
        }

    }

    private void agregarCampoOpcion(PreguntaDTO pregunta, int posY) {
        limpiarCampo(posY);
        if (pregunta.getPreguntaAbierta() != null) {
            JTextField respuesta = new JTextField(10);
            respuesta.getDocument().addDocumentListener(new DocumentListener() {

                @Override
                public void insertUpdate(DocumentEvent e) {
                    getPregunta();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    getPregunta();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    getPregunta();
                }

                private void getPregunta() {
                    pregunta.getPreguntaAbierta().setRespuesta(respuesta.getText());
                }
            });
            gridBagConstraints.gridy = posY;
            add(respuesta, gridBagConstraints);
            revalidate();
            repaint();

        } else if (pregunta.getPreguntaCerrada() != null) {
            List<OpcionCondicionales> opciones = OpcionCondicionales.getOpciones(pregunta.getPreguntaCerrada());
            DefaultComboBoxModel comboModel = new DefaultComboBoxModel(opciones.toArray());
            JComboBox combo = new JComboBox(comboModel);
            NodoCondicion nodoCond = (NodoCondicion) nodo;
            
            combo.setSelectedItem(nodoCond.getOpcionSeleccionada());
            
            combo.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    OpcionDTO opc = (OpcionDTO) e.getItem();
                    
                    nodoCond.setOpcionSeleccionada(opc);
                }
            });

            gridBagConstraints.gridy = posY;
            add(combo, gridBagConstraints);
            revalidate();
            repaint();
        }
    }

    private void limpiarCampo(int posY) {
        GridBagLayout layout = (GridBagLayout) getLayout();

        for (Component component : getComponents()) {
            component.getName();
            GridBagConstraints gbc = layout.getConstraints(component);
            if (gbc.gridy == posY && gbc.gridx == 2) {
                System.out.println(component);
                this.remove(component);
                revalidate();
                repaint();
                break;
            }
        }
    }

}
