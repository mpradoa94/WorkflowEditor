/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author MPA
 */
public class JPanelPropiedadesNodo extends JPanel {

    private Nodo nodo;
    private GridBagConstraints gridBagConstraints;

    public JPanelPropiedadesNodo(Nodo nodo) {
        this.nodo = nodo;
        initComponents();
    }

    private void initComponents() {

        JLabel titulo1 = new JLabel("Propiedades");
        JLabel titulo2 = new JLabel(nodo.getEtiqueta());

        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();

        titulo1.setFont(new java.awt.Font("Tahoma", 1, 14));
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 24, 0, 91);
        add(titulo1, gridBagConstraints);

        titulo2.setFont(new java.awt.Font("Tahoma", 1, 12));
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(titulo2, gridBagConstraints);

        agregarPropiedadesNodo();
    }

    private void agregarPropiedadesNodo() {
        int posY = 2;
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
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(JPanelPropiedadesNodo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IllegalAccessException ex) {
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
            if (valor!=null)
                campo.setValue(valor);
            
            campo.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    try {
                        propiedad.setInt(nodo, (int) campo.getValue());
                    } catch (IllegalArgumentException ex) {
                        Logger.getLogger(JPanelPropiedadesNodo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(JPanelPropiedadesNodo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            add(campo, gridBagConstraints);
        } else if (tipo.isAssignableFrom(String.class)){
            JTextField campo = new JTextField(10);
            if(valor != null)
                campo.setText(valor.toString());
            if (!tipo.isAssignableFrom(String.class)) {
                campo.setEditable(false);
            }

            campo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    try {
                        propiedad.set(nodo, campo.getText());
                    } catch (IllegalArgumentException ex) {
                        Logger.getLogger(JPanelPropiedadesNodo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(JPanelPropiedadesNodo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });

            add(campo, gridBagConstraints);
            
        } else {
            switch(propiedad.getName()){
                case "tipo":
                case "rol":
                    JTextField campo = new JTextField(10);
                    if(valor != null)
                        campo.setText(valor.toString());
                    campo.setEditable(false);
                    add(campo, gridBagConstraints);
                    break;
                case "SelectedModel":
                    break;    
            }
        }

    }

}
