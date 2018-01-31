/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.beans.value.ObservableValue;
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
public class NodoFlujo implements Nodo {

    private String etiqueta;
    private String nombre;
    private int idFlujo;
    private int idVersion;

    //Constructor vacio para guardar/cargar estas propiedades en graph
    public NodoFlujo() {
    }

    public NodoFlujo(String etiqueta) {
        this.etiqueta = etiqueta;
        this.idFlujo = 0;
        this.nombre = "";
        this.idVersion = 0;
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

    public void setIdFlujo(int idFlujo) {
        this.idFlujo = idFlujo;
    }

    public int getIdFlujo() {
        return idFlujo;
    }

    public void setIdVersion(int idVersion) {
        this.idVersion = idVersion;
    }

    public int getIdVersion() {
        return idVersion;
    }
    
    @Override
    public String generateXMLstringInicio(){
        String XMLstring = "<flujo ";
        XMLstring += "idFlujo=\"" + getIdFlujo() + "\" ";
        XMLstring += "idVersion=\"" + getIdVersion() + "\" ";
        XMLstring += "nmFlujo=\"" + getNombre() + "\" ";
        XMLstring += ">";
        return XMLstring;
    }
    
    @Override
    public String generateXMLstringFin(){
        String XMLstring = "</flujo>";
        return XMLstring;
    }

}
