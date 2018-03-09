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
class Comparativo2 {
    
    private Operador operador;
    private NodoCondicion condicion;
    private Comparativo comparativo;
    
    public enum Operador {
        AND, OR;
    }
    
    public Comparativo2(){
        
    }
    
    public Comparativo2(Operador operador, NodoCondicion condicion){
        this.operador = operador;
        this.condicion = condicion;
    }
    
    public Comparativo2(Operador operador, Comparativo comparativo){
        this.operador = operador;
        this.comparativo = comparativo;
    }
    
    public String generarXML() throws ExcepcionNodo{
        if (estaCompleto()){
            String XMLstring = "<comparative2>";
            XMLstring += "<opLogico>"+operador+"</opLogico>";
            if (condicion != null)
                XMLstring += condicion.generarXML();
            else
                XMLstring += comparativo.generarXML();
            XMLstring += "</comparative2>";
            return XMLstring;
        }
        else {
            throw new ExcepcionNodo("falta informacion en campos obligatorios");
        }
    }
    
    private boolean estaCompleto(){
        return operador != null && (condicion != null || comparativo != null);
    }
}
