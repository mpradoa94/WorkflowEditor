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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author MPA
 */
public class ConditionVertex extends CustomVertex {

    private int num;
    private String name;
    private NodeType type;
    private RoleVertex role;

    public ConditionVertex(String label, String name, int num, NodeType type) {
        this.label = label;
        this.num = num;
        this.name = name;
        this.type = type;
    }

    public ConditionVertex(String label, String name, NodeType type) {
        this(label, name, 0, type);
    }
    
    //Empty constructor needed for saving/loading this obj properties in graph
    public ConditionVertex(){
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
        propertiesPanel.add(new JLabel("<html><h3>Node vertex</h3></html>"));
        propertiesPanel.add(new JLabel("<html><h4>Properties</h4></html>"));
        createTextFields(propertiesPanel);
        propertiesPanel.validate();
        return propertiesPanel;
    }

    private void createTextFields(JPanel panel) {
        JTextField fieldName = new JTextField(10);
        fieldName.setText(this.getName());
        JSpinner fieldId = new JSpinner();
        fieldId.setValue(this.getNum());
        JTextField fieldType = new JTextField(10);
        fieldType.setText(this.getType().toString());
        fieldType.setEditable(false);
        JTextField fieldRole = new JTextField(10);
        fieldRole.setEditable(false);

        if (getRole() != null) {
            fieldRole.setText(getRole().getName());
        }

        fieldName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                ConditionVertex.this.setName(fieldName.getText());
                System.out.println("Name: " + ConditionVertex.this.getName());
            }
        });

        fieldId.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ConditionVertex.this.setNum((int) (Integer) fieldId.getValue());
                System.out.println("Id: " + ConditionVertex.this.getNum());
            }
        });

        panel.add(new JLabel("Name"));
        panel.add(fieldName);
        panel.add(new JLabel("Node num"));
        panel.add(fieldId);
        panel.add(new JLabel("Type"));
        panel.add(fieldType);
        panel.add(new JLabel("Role"));
        panel.add(fieldRole);
    }

    public RoleVertex getRole() {
        return role;
    }

    public void setRole(RoleVertex role) {
        this.role = role;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodeType getType() {
        return type;
    }

    public void setType(NodeType type) {
        this.type = type;
    }

}
