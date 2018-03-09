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
    private Nodo nodoSiguiente;
    
    public NodoSiguiente(){
        
    }
    
    public NodoSiguiente(Nodo nodoSiguiente){
        this.nodoSiguiente = nodoSiguiente;
    }

    public NodoCondicion getCondicion() {
        return condicion;
    }

    public void setCondicion(NodoCondicion condicion) {
        this.condicion = condicion;
    }

    public int getNumNodoSiguiente() {
        return nodoSiguiente.getNumNodo();
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
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
