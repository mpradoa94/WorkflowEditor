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
    private static JPanel propertiesPanel;
    
    public NodeVertex(String label, String name, NodeType type, int timeNode, int timeNodeMax) {
        this.label = label;
        this.name = name;
        this.type = type;
        this.timeNode = timeNode;
        this.timeNodeMax = timeNodeMax;
        setPropertiesPanel();
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
        JSpinner fieldId = new JSpinner();
        JSpinner fieldTime = new JSpinner();
        JSpinner fieldTimeMax = new JSpinner();
        JTextField fieldRole = new JTextField(10);
        fieldRole.enableInputMethods(false);
        
        List<String> typeStrings = new ArrayList<>();
        for (NodeType type : NodeType.values()){
            typeStrings.add(type.name());
        }
        SpinnerListModel typeModel = new SpinnerListModel(typeStrings);     
        JSpinner fieldType = new JSpinner(typeModel);
        
        if (role != null)
        {
            String t = role.getLabel();
            fieldRole.setText(role.getLabel());
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
                NodeVertex.this.id = (int) fieldId.getValue();
                System.out.println("Id: " + NodeVertex.this.id);
            }
        });
        
        fieldTime.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                NodeVertex.this.timeNode = (int) fieldTime.getValue();
                System.out.println("Time node: " + NodeVertex.this.timeNode);
            }
        });
        
        fieldTimeMax.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                NodeVertex.this.timeNodeMax = (int) fieldTime.getValue();
                System.out.println("Time max: " + NodeVertex.this.timeNodeMax);
            }
        });
        
        fieldType.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                NodeVertex.this.type = (NodeType) fieldType.getValue();
                System.out.println("Type: " + NodeVertex.this.type);
            }
        });

        panel.add(new JLabel("Name"));
        panel.add(fieldName);
        panel.add(new JLabel("Id"));
        panel.add(fieldId);
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
