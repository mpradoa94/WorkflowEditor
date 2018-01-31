/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import core.webmet.GetModelo;
import core.webmet.OpcionDTO;
import core.webmet.PreguntaDTO;
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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author MPA
 */
public class NodoCondicion implements Nodo {

    private String etiqueta;
    private String nombre;
    private int num;
    private TipoNodo tipo;
    private NodoRol rol;
    public static Cuestionario selectedModel;
    private PreguntaDTO selectedQuestion;
    private OpcionDTO selectedOption;
    

    //Constructor vacio para guardar/cargar estas propiedades en graph
    public NodoCondicion() {
    }

    public NodoCondicion(String etiqueta, TipoNodo tipo) {
        this.etiqueta = etiqueta;
        this.tipo = tipo;
        this.nombre = "";
        this.num = 0;       
        this.selectedOption = null;
        this.selectedQuestion = null;
    }

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
        fieldName.setText(this.getNombre());
        JSpinner fieldId = new JSpinner();
        fieldId.setValue(this.getNum());
        JTextField fieldType = new JTextField(10);
        fieldType.setText(this.getTipo().toString());
        fieldType.setEditable(false);
        JTextField fieldRole = new JTextField(10);
        fieldRole.setEditable(false);

        if (getRol() != null) {
            fieldRole.setText(getRol().getNombre());
        }

        fieldName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                NodoCondicion.this.setNombre(fieldName.getText());
                System.out.println("Name: " + NodoCondicion.this.getNombre());
            }
        });

        fieldId.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                NodoCondicion.this.setNum((int) (Integer) fieldId.getValue());
                System.out.println("Id: " + NodoCondicion.this.getNum());
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

        List<Pregunta> questions = setPreguntas();

        JComboBox questionsList = new JComboBox(new DefaultComboBoxModel(questions.toArray()));
        questionsList.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                setSelectedQuestion(((Pregunta) e.getItem()).getPreguntaDTO());
                setQuestionOptions(getSelectedQuestion(), panel);
                panel.revalidate();
            }

        });
        panel.add(new JLabel("Preguntas"));
        panel.add(questionsList);
    }

    public void setQuestionOptions(PreguntaDTO pregunta, JPanel panel) {
        if (pregunta.getPreguntaAbierta() != null) {
            JTextField fieldAnswer = new JTextField(10);
            fieldAnswer.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    pregunta.getPreguntaAbierta().setRespuesta(fieldAnswer.getText());
                }
            });
            panel.add(new JLabel("Respuestas"));
            panel.add(fieldAnswer);

        } else if (pregunta.getPreguntaCerrada() != null) {
            List<OpcionDTO> options = pregunta.getPreguntaCerrada().getOpciones().getOpcion();
            DefaultComboBoxModel comboModel = new DefaultComboBoxModel(options.toArray());
            JComboBox optionsList = new JComboBox(comboModel);
            optionsList.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {
                    OpcionDTO opc = (OpcionDTO) e.getItem();
                    setSelectedOption(opc);
                    //pregunta.getPreguntaCerrada().
                }

            });
            panel.add(new JLabel("Respuestas"));
            panel.add(optionsList);
        }

    }
    
        public List<Pregunta> setPreguntas() {
        List<Pregunta> questions = new ArrayList();
        try {
            GetModelo req = new GetModelo();
            req.setIDInstancia(DiagramEditor.getInstancia().getIDINSTANCIA());
            req.setTYMODELO("F");
            req.setOper("SNG");
            req.setIDMODELO(selectedModel.getIdModelo());
            List<PreguntaDTO> preguntasDTO = DiagramEditor.getPort().getPregunasW(req).getPreguntas();

            for (PreguntaDTO pregunta : preguntasDTO) {
                System.out.println("Pregunta: " + pregunta);
                questions.add(new Pregunta(pregunta));
            }
        } catch (Exception ex) {
            questions = null;
        }

        return questions;
    }
    
    @Override
    public void setEtiqueta(String value) {
        etiqueta = value;
    }

    @Override
    public String getEtiqueta() {
        return etiqueta;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }
    
    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    } 
    
    public void setRol(NodoRol rol) {
        this.rol = rol;
    }
    
    public NodoRol getRol() {
        return rol;
    }  
    
    public void setTipo(TipoNodo tipo) {
        this.tipo = tipo;
    }
    
    public TipoNodo getTipo() {
        return tipo;
    }

    public void setSelectedQuestion(PreguntaDTO selectedQuestion) {
        this.selectedQuestion = selectedQuestion;
    } 

    public PreguntaDTO getSelectedQuestion() {
        return selectedQuestion;
    }

   public void setSelectedOption(OpcionDTO selectedOption) {
        this.selectedOption = selectedOption;
    }

    public OpcionDTO getSelectedOption() {
        return selectedOption;
    }
    
    @Override
    public String generateXMLstringInicio(){
        return "<condicion>";
    }
    
    @Override
    public String generateXMLstringFin(){
        return "</condicion>";
    }

}
