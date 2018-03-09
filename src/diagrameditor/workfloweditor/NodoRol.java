/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor.workfloweditor;

import diagrameditor.exceptions.ExcepcionNodo;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author MPA
 */
public class NodoRol implements NodoBase {

    private String etiqueta;
    private String cveRol;
    private String nmRol;
    
    
    //Constructor vacio para guardar/cargar estas propiedades en graph
    public NodoRol() {
    }

    public NodoRol(String etiqueta) {
        this.etiqueta = etiqueta;
        this.nmRol = "";
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
    public void setNombre(String nmRol) {
        this.nmRol = nmRol;
    }

    @Override
    public String getNombre() {
        return nmRol;
    }
    
    public void setCveRol(String cveRol) {
        this.cveRol = cveRol;
    }
    
    public String getCveRol() {
        return cveRol;
    }
    
    public String generarXML() throws ExcepcionNodo{
        if(estaCompleto()) {
            String XMLstring = "<cveRol> "+getCveRol() + "</cveRol>";
            XMLstring += "<nmRol>"+ getNombre() + "</nmRol>";
            return XMLstring;
        }
        else{
            throw new ExcepcionNodo("falta informacion en campos obligatorios");
        }
    }
    
    private boolean estaCompleto(){
        return getCveRol() != null && getNombre() != null;
    }
    
}
