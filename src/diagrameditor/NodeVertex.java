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
public class NodeVertex extends CustomVertex {
    
    
    private String label;
    private int id;
    private String name;
    private int timeNode;
    private int timeNodeMax;
    private NodeType type;
    private RoleVertex role;
    
    public NodeVertex(String label, String name, NodeType type, int timeNode, int timeNodeMax) {
        this.label = label;
        this.name = name;
        this.type = type;
        this.timeNode = timeNode;
        this.timeNodeMax = timeNodeMax;
    }
    
    public NodeVertex(String label, String name, NodeType type) {
        this(label, name, type, 0, 0);
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
        JPanel propertiesPanel = new JPanel();
        propertiesPanel.setPreferredSize(new Dimension(150, 150));
        propertiesPanel.add(new JLabel("Node vertex"));
        propertiesPanel.add(new JLabel("Properties"));
        createTextFields(propertiesPanel);

        return propertiesPanel;
    }
    
    private void createTextFields(JPanel panel) {
        JTextField textFieldName = new JTextField(10);
        
        if (role != null)
        {
            String t = role.getLabel();
            textFieldName.setText(role.getLabel());
        }
        
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

    public RoleVertex getRole() {
        return role;
    }

    public void setRole(RoleVertex role) {
        this.role = role;
    }
    
}
