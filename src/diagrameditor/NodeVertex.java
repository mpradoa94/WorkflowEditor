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
public class NodeVertex extends CustomVertex {

    private String label;
    private int id;
    private String name;
    private int timeNode;
    private int timeNodeMax;
    private NodeType type;
    private RoleVertex role;
    private JPanel propertiesPanel;

    public NodeVertex(String label, String name, int id, NodeType type, int timeNode, int timeNodeMax) {
        this.label = label;
        this.id = id;
        this.name = name;
        this.type = type;
        this.timeNode = timeNode;
        this.timeNodeMax = timeNodeMax;
    }

    public NodeVertex(String label, String name, NodeType type) {
        this(label, name, 0, type, 0, 0);
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
        setPropertiesPanel();
        return propertiesPanel;
    }
    
    private void setPropertiesPanel() {
        propertiesPanel = new JPanel(new GridLayout(0, 1));
        propertiesPanel.add(new JLabel("<html><h3>Node vertex</h3></html>"));
        propertiesPanel.add(new JLabel("<html><h4>Properties</h4></html>"));
        createTextFields(propertiesPanel);
        propertiesPanel.validate();
    }

    private void createTextFields(JPanel panel) {
        JTextField fieldName = new JTextField(10);
        fieldName.setText(this.name);
        JSpinner fieldId = new JSpinner();
        fieldId.setValue(this.id);
        JSpinner fieldTime = new JSpinner();
        fieldTime.setValue(this.timeNode);
        JSpinner fieldTimeMax = new JSpinner();
        fieldTimeMax.setValue(this.timeNodeMax);
        JTextField fieldType = new JTextField(10);
        fieldType.setText(this.type.toString());
        fieldType.setEditable(false);
        JTextField fieldRole = new JTextField(10);
        fieldRole.setEditable(false);

        if (role != null) {
            fieldRole.setText(role.getName());
        }

        fieldName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                NodeVertex.this.name = fieldName.getText();
                System.out.println("Name: " + NodeVertex.this.name);
            }
        });

        fieldId.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                NodeVertex.this.id = (Integer) fieldId.getValue();
                System.out.println("Id: " + NodeVertex.this.id);
            }
        });

        fieldTime.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                NodeVertex.this.timeNode = (Integer) fieldTime.getValue();
                System.out.println("Time node: " + NodeVertex.this.timeNode);
            }
        });

        fieldTimeMax.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                NodeVertex.this.timeNodeMax = (Integer) fieldTime.getValue();
                System.out.println("Time max: " + NodeVertex.this.timeNodeMax);
            }
        });

        propertiesPanel.add(new JLabel("Name"));
        propertiesPanel.add(fieldName);
        propertiesPanel.add(new JLabel("Node num"));
        propertiesPanel.add(fieldId);
        panel.add(new JLabel("Type"));
        panel.add(fieldType);
        panel.add(new JLabel("Time"));
        panel.add(fieldTime);
        panel.add(new JLabel("Time Max"));
        panel.add(fieldTimeMax);
        panel.add(new JLabel("Role"));
        panel.add(fieldRole);
    }

    public RoleVertex getRole() {
        return role;
    }

    public void setRole(RoleVertex role) {
        this.role = role;
    }

}
