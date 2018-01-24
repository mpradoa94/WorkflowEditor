/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import core.webmet.GetModelo;
import core.webmet.GetPreguntasResponse;
import core.webmet.Instancia;
import core.webmet.Modelo;
import core.webmet.OpcionDTO;
import core.webmet.OpcionesDTO;
import core.webmet.PreguntaDTO;
import static diagrameditor.DiagramEditor.idSelectedModel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
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
    private List<Pregunta> questions;
    private NodeType type;
    private RoleVertex role;

    public ConditionVertex(String label, String name, int num, NodeType type) {
        this.label = label;
        this.num = num;
        this.name = name;
        this.type = type;
        this.questions = new ArrayList();
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
        
        setPreguntas();
        if (questions!=null){
            JComboBox questionsList = new JComboBox(new DefaultComboBoxModel(questions.toArray()));
            questionsList.addItemListener(new ItemListener(){

                @Override
                public void itemStateChanged(ItemEvent e) {                  
                    Pregunta pregunta =(Pregunta) e.getItem();
                    setQuestionOptions(pregunta.getPreguntaDTO(), panel);
                    panel.revalidate();
                    panel.repaint();
                }

            });
            panel.add(new JLabel("Preguntas"));
            panel.add(questionsList);
        }
    }
    
    public void setQuestionOptions(PreguntaDTO pregunta, JPanel panel){
        if (pregunta.getPreguntaAbierta() != null){
            JTextField fieldAnswer = new JTextField(10);
            panel.add(new JLabel("Respuestas"));
            panel.add(fieldAnswer);
            
        }
        else if (pregunta.getPreguntaCerrada() != null){
            OpcionesDTO opc = pregunta.getPreguntaCerrada().getOpciones();
            DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
            for (OpcionDTO opcion:opc.getOpcion()){
                comboModel.addElement(opcion.getDescripcion());
            }
            JComboBox optionsList = new JComboBox(comboModel);
            optionsList.addItemListener(new ItemListener(){

                @Override
                public void itemStateChanged(ItemEvent e) {                  
                    System.out.println(e.getItem());
                }

            });
            panel.add(new JLabel("Respuestas"));
            panel.add(optionsList);
        }
        
        
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
    
    public void setPreguntas(){
        try{
            GetModelo req = new GetModelo();
            req.setIDInstancia(DiagramEditor.getInstance().getIDINSTANCIA());
            req.setTYMODELO("F");
            req.setOper("SNG");
            req.setIDMODELO(DiagramEditor.idSelectedModel);
            List <PreguntaDTO> preguntasDTO = DiagramEditor.getPort().getPregunasW(req).getPreguntas(); 
            
            for(PreguntaDTO pregunta:preguntasDTO){
                System.out.println("Pregunta: "+ pregunta);
                questions.add(new Pregunta(pregunta));
            } 
        } catch (Exception ex){
            questions = null;
        }
        
    }
}
