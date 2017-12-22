/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.beans.value.ObservableValue;
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
public class FlowVertex extends CustomVertex {

    private int id;
    private String name;
    private int idVersion;
    private static JPanel propertiesPanel;

    public FlowVertex(String label, int id, String name, int idVersion) {
        this.label = label;
        this.id = id;
        this.name = name;
        this.idVersion = idVersion;
        setPropertiesPanel();
    }

    public FlowVertex(String label) {
        this(label, 0, "", 0);
    }

    @Override
    public void setLabel(String value) {
        label = value;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public JPanel getPropertiesPanel() {     
        return propertiesPanel;
    }
    
    private void setPropertiesPanel() {
        propertiesPanel = new JPanel(new GridLayout(0, 1));
        propertiesPanel.add(new JLabel("<html><h3>Flow vertex</h3></html>"));
        propertiesPanel.add(new JLabel("<html><h4>Properties</h4></html>"));
        createTextFields(propertiesPanel);
        propertiesPanel.validate();
    }

    private void createTextFields(JPanel panel) {
        JTextField fieldName = new JTextField(10);
        fieldName.setText(this.name);
        JSpinner fieldId = new JSpinner();
        fieldId.setValue(this.id);
        JSpinner fieldVersion = new JSpinner();
        fieldId.setValue(this.idVersion);

        fieldName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                FlowVertex.this.name = fieldName.getText();
                System.out.println("Name: " + FlowVertex.this.name);
            }
        });

        fieldId.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                FlowVertex.this.id = (int) fieldId.getValue();
                System.out.println("Id: " + FlowVertex.this.id);
            }
        });

        fieldVersion.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("The entered text is: " + fieldVersion.getValue().toString());
                FlowVertex.this.id = (int) fieldVersion.getValue();
            }
        });

        panel.add(new JLabel("Name"));
        panel.add(fieldName);
        panel.add(new JLabel("Id"));
        panel.add(fieldId);
        panel.add(new JLabel("Version"));
        panel.add(fieldVersion);
    }

}
