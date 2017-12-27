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

    private int idFlow;
    private String name;
    private int idVersion;

    public FlowVertex(String label, int id, String name, int idVersion) {
        this.label = label;
        this.idFlow = id;
        this.name = name;
        this.idVersion = idVersion;
    }

    public FlowVertex(String label) {
        this(label, 0, "", 0);
    }
    
    //Empty constructor needed for saving/loading this obj properties in graph
    public FlowVertex(){
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
        JPanel propertiesPanel = new JPanel(new GridLayout(0, 1));
        propertiesPanel.add(new JLabel("<html><h3>Flow vertex</h3></html>"));
        propertiesPanel.add(new JLabel("<html><h4>Properties</h4></html>"));
        createTextFields(propertiesPanel);
        propertiesPanel.validate();
        return propertiesPanel;
    }

    private void createTextFields(JPanel panel) {
        JTextField fieldName = new JTextField(10);
        fieldName.setText(this.getName());
        JSpinner fieldId = new JSpinner();
        fieldId.setValue(this.getIdFlow());
        JSpinner fieldVersion = new JSpinner();
        fieldVersion.setValue(this.getIdVersion());

        fieldName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                FlowVertex.this.setName(fieldName.getText());
                System.out.println("Name: " + FlowVertex.this.getName());
            }
        });

        fieldId.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                FlowVertex.this.setIdFlow((int) (Integer) fieldId.getValue());
                System.out.println("Id: " + FlowVertex.this.getIdFlow());
            }
        });

        fieldVersion.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("The entered text is: " + fieldVersion.getValue().toString());
                FlowVertex.this.setIdVersion((int) (Integer) fieldVersion.getValue());
            }
        });

        panel.add(new JLabel("Name"));
        panel.add(fieldName);
        panel.add(new JLabel("Id"));
        panel.add(fieldId);
        panel.add(new JLabel("Version"));
        panel.add(fieldVersion);
    }

    public int getIdFlow() {
        return idFlow;
    }

    public void setIdFlow(int idFlow) {
        this.idFlow = idFlow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdVersion() {
        return idVersion;
    }

    public void setIdVersion(int idVersion) {
        this.idVersion = idVersion;
    }

}
