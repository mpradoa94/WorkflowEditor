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
public class FlowVertex extends CustomVertex {

    private int idFlow;
    private String nameFlow;
    private int idVersion;

    public FlowVertex(String label, int idF, String nameF, int idV) {
        setLabel(label);
        setIdFlow(idF);
        setNameFlow(nameF);
        setIdVersion(idV);
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

    public int getIdFlow() {
        return idFlow;
    }

    public void setIdFlow(int idFlow) {
        this.idFlow = idFlow;
    }

    public String getNameFlow() {
        return nameFlow;
    }

    public void setNameFlow(String nameFlow) {
        this.nameFlow = nameFlow;
    }

    public int getIdVersion() {
        return idVersion;
    }

    public void setIdVersion(int idVersion) {
        this.idVersion = idVersion;
    }

    @Override
    public JPanel getPropertiesPanel() {
        JPanel propertiesPanel = new JPanel();
        propertiesPanel.setPreferredSize(new Dimension(150, 150));
        propertiesPanel.add(new JLabel("<html>Flow vertex<br>Properties</html>"));
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
