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
public class NodoProceso implements Nodo {

    private String etiqueta;
    private String nombre;
    private int numNodo;
    private TipoNodo tipo;
    private NodoRol rol;
    private int tiempoNodo;
    private int tiempoNodoMax;

    //Constructor vacio para guardar/cargar estas propiedades en graph
    public NodoProceso() {
    }

    public NodoProceso(String etiqueta, TipoNodo tipo) {
        this.etiqueta = etiqueta;
        this.tipo = tipo;
        this.numNodo = 0;
        this.nombre = "";
        this.tiempoNodo = 0;
        this.tiempoNodoMax = 0;
        this.rol = null;
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

    public void setNumNodo(int numNodo) {
        this.numNodo = numNodo;
    }

    public int getNumNodo() {
        return numNodo;
    }

    public void setTipo(TipoNodo tipo) {
        this.tipo = tipo;
    }

    public TipoNodo getTipo() {
        return tipo;
    }

    public void setRol(NodoRol rol) {
        this.rol = rol;
    }

    public NodoRol getRol() {
        return rol;
    }

    public void setTiempoNodo(int tiempoNodo) {
        this.tiempoNodo = tiempoNodo;
    }

    public int getTiempoNodo() {
        return tiempoNodo;
    }

    public void setTiempoNodoMax(int tiempoNodoMax) {
        this.tiempoNodoMax = tiempoNodoMax;
    }

    public int getTiempoNodoMax() {
        return tiempoNodoMax;
    }
    
    @Override
    public String generarXMLstringInicio(){
        String XMLstring = "";
        if (getTipo() == TipoNodo.Inicio){
            XMLstring += "<inicio ";
        }
        else if (getTipo() == TipoNodo.Proceso){
            XMLstring += "<nodos ";
        }
        else if (getTipo() == TipoNodo.Fin){
            XMLstring += "<fin ";
        }

        XMLstring += "numNodo=\"" + getNumNodo() + "\" ";
        XMLstring += "nombreNodo=\"" + getNombre() + "\" ";
        XMLstring += "tipoNodo=\"" + getTipo() + "\" ";
        if (getTipo() != TipoNodo.Fin){
            XMLstring += "tiempoNodo=\"" + getTiempoNodo() + "\" ";
            XMLstring += "tiempoNodoMax=\"" + getTiempoNodoMax() + "\" ";
        }
        XMLstring += ">";
        return XMLstring;
    }
    
    private String generateXMLrol(){
        String XMLstring = "";
        if (getRol() != null){
            XMLstring += getRol().generarXMLstringInicio();
            XMLstring += getRol().generarXMLstringFin();
        }
        return XMLstring;
    } 
    
    @Override
    public String generarXMLstringFin(){
        String XMLstring = generateXMLrol();
        if (getTipo() == TipoNodo.Inicio){
            XMLstring += "</inicio>";
        }
        else if (getTipo() == TipoNodo.Proceso){
            XMLstring += "</nodos>";
        }
        else if (getTipo() == TipoNodo.Fin){
            XMLstring += "</fin>";
        }
        return XMLstring;
    }

}
