/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor.workfloweditor;

import diagrameditor.exceptions.ExcepcionNodo;

/**
 *
 * @author MPA
 */
public class NodoSiguiente implements NodoBase{
    private String etiqueta;
    private String nombre;
    private NodoCondicion condicion;
    private int numNodoSiguiente;
    
    public NodoSiguiente(){
        
    }
    
    public NodoSiguiente(int numNodoSiguiente){
        this.numNodoSiguiente = numNodoSiguiente;
    }
    
    public NodoSiguiente(int numNodoSiguiente, NodoCondicion condicion){
        this.numNodoSiguiente = numNodoSiguiente;
        this.condicion = condicion;
    }
    
    @Override
    public String toString(){
        return ""+numNodoSiguiente;
    }

    public NodoCondicion getCondicion() {
        return condicion;
    }

    public void setCondicion(NodoCondicion condicion) {
        this.condicion = condicion;
    }

    public int getNumNodoSiguiente() {
        return numNodoSiguiente;
    }
    
    @Override
    public String getEtiqueta() {
        return etiqueta;
    }

    @Override
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String generarXML() throws ExcepcionNodo{
        String XMLstring = "<siguiente>";
        if (condicion != null)
            XMLstring += condicion.generarXML();
        XMLstring += "<numNodoSiguiente>"+getNumNodoSiguiente()+"</numNodoSiguiente>";
        XMLstring += "</siguiente>";
        return XMLstring;
    }
}
