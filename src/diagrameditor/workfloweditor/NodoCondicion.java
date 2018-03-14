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
public class NodoCondicion implements NodoBase{
    private String etiqueta;
    private String nombre;
    private NodoCondicion condicion;
    private Comparativo comparativo;
    private Comparativo2 comparativo2;
    
    public NodoCondicion(){
        
    }
    
    public NodoCondicion(String etiqueta){
        this.etiqueta = etiqueta;
    }
    
    public NodoCondicion(NodoCondicion condicion){
        this.condicion = condicion;
    }
    
    public NodoCondicion(Comparativo comparativo){
        this.comparativo = comparativo;
    }
    
    @Override
    public String toString(){
        return nombre;
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
    public void setNombre(String nombreNodo) {
        this.nombre = nombreNodo;
    }

    public NodoCondicion getCondicion() {
        return condicion;
    }
    
    public void setCondicion(NodoCondicion condicion) throws ExcepcionNodo {
        if (comparativo == null)
            this.condicion = condicion;
        else throw new ExcepcionNodo("");
    }

    public Comparativo getComparativo() {
        return comparativo;
    }
    
    public void setComparativo(Comparativo comparativo) throws ExcepcionNodo {
        if (condicion == null)
            this.comparativo = comparativo;
        else throw new ExcepcionNodo("");
    }

    public Comparativo2 getComparativo2() {
        return comparativo2;
    }

    public void setComparativo2(Comparativo2 comparativo2) {
        this.comparativo2 = comparativo2;
    }
    
    @Override
    public String generarXML() throws ExcepcionNodo{
        String XMLstring = "<condicion>";
        if (getCondicion() != null){
            XMLstring += getCondicion().generarXML();
        }
        else if (getComparativo() != null){
            XMLstring += getComparativo().generarXML();
        }
        else {
            throw new ExcepcionNodo("Condicion: falta informacion en campos obligatorios");
        }
        
        if (getComparativo2() != null) {
            XMLstring += getComparativo2().generarXML();
        }
        return XMLstring;
    }
}
