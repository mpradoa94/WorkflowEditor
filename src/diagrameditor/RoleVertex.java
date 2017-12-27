/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author MPA
 */
public class RoleVertex extends CustomVertex {

    private String key;
    private String name;

    public RoleVertex(String label, String key, String name) {
        this.label = label;
        this.key = key;
        this.name = name;
    }
    
    //Empty constructor needed for saving/loading this obj properties in graph
    public RoleVertex(){
    }

    @Override
    public void setLabel(String value) {
        label = value;
    }

    @Override
    public String getLabel() {
        return label;
    }
    
    public String getName(){
        return name;
    }

    @Override
    public JPanel getPropertiesPanel() {
        JPanel propertiesPanel = new JPanel(new GridLayout(0, 1));
        propertiesPanel.add(new JLabel("<html><h3>Role vertex</h3></html>"));
        propertiesPanel.add(new JLabel("<html><h4>Properties</h4></html>"));
        createTextFields(propertiesPanel);
        propertiesPanel.validate();
        return propertiesPanel;
    }

    private void createTextFields(JPanel panel) {
        JTextField fieldName = new JTextField(10);
        fieldName.setText(this.getName());
        JTextField fieldKey = new JTextField(10);
        fieldKey.setText(this.getKey());

        fieldName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("The entered text is: " + fieldName.getText());
                RoleVertex.this.setName(fieldName.getText());
                System.out.println("Name: " + RoleVertex.this.getName());
            }
        });

        fieldKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                RoleVertex.this.setKey(fieldKey.getText());
                System.out.println("Name: " + RoleVertex.this.getKey());
            }
        });

        panel.add(new JLabel("Name"));
        panel.add(fieldName);
        panel.add(new JLabel("Key"));
        panel.add(fieldKey);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }
}
