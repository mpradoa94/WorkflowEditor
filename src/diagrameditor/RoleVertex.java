/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import java.awt.Dimension;
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
public class RoleVertex extends CustomVertex{
    
    private String key;
    private String name;
    
    public RoleVertex(String label, String key, String name) {
        this.label = label;
        this.key = key;
        this.name = name;
    }

    @Override
    public void setLabel(String value) {
        label = value;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public JPanel getPropertiesPanel() {
        JPanel propertiesPanel = new JPanel();
        propertiesPanel.setPreferredSize(new Dimension(150, 150));
        propertiesPanel.add(new JLabel("Role vertex"));
        propertiesPanel.add(new JLabel("Properties"));
        createTextFields(propertiesPanel);

        return propertiesPanel;
    }

    private void createTextFields(JPanel panel) {
        JTextField textFieldName = new JTextField(10);
        JTextField textFieldId = new JTextField(10);
        JTextField textFieldVersion = new JTextField(10);
        NumberFormatter formatter = new NumberFormatter(); //create the formatter
        formatter.setAllowsInvalid(false); //must specify that invalid chars are not allowed

        JFormattedTextField field = new JFormattedTextField(formatter);

        textFieldName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("The entered text is: " + textFieldName.getText());
            }
        });

        textFieldId.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("The entered text is: " + textFieldId.getText());
            }
        });

        textFieldVersion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("The entered text is: " + textFieldVersion.getText());
            }
        });

        panel.add(textFieldName);
    }

    
}
