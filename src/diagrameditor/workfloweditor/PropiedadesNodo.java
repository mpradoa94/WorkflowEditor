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
public class PropiedadesNodo {
    private String nmVariableInterna;
    private String tipo;
    private String variableCuestionario;
    private String cuerpoCorreo;
    private String asuntoCorreo;
    
    public PropiedadesNodo(){
        
    }
    
    public PropiedadesNodo(String variableCuestionario){
        this.variableCuestionario = variableCuestionario;
    }

    public String getNmVariableInterna() {
        return nmVariableInterna;
    }

    public void setNmVariableInterna(String nmVariableInterna) {
        this.nmVariableInterna = nmVariableInterna;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVariableCuestionario() {
        return variableCuestionario;
    }

    public void setVariableCuestionario(String variableCuestionario) {
        this.variableCuestionario = variableCuestionario;
    }

    public String getCuerpoCorreo() {
        return cuerpoCorreo;
    }

    public void setCuerpoCorreo(String cuerpoCorreo) {
        this.cuerpoCorreo = cuerpoCorreo;
    }

    public String getAsuntoCorreo() {
        return asuntoCorreo;
    }

    public void setAsuntoCorreo(String asuntoCorreo) {
        this.asuntoCorreo = asuntoCorreo;
    }
    
    public String generarXML() throws ExcepcionNodo {
        if (estaCompleto()) {
            String XMLstring = "<propiedadesNodo>";
            if (getNmVariableInterna() != null){
                XMLstring += "<nmVariableInterna>" 
                          + getNmVariableInterna()
                          + "</nmVariableInterna>";
            }
            XMLstring += "<tipo>"
                      + getTipo()
                      + "</tipo>";

            XMLstring += "<variableCuestionario>"
                      + getVariableCuestionario()
                      + "</variableCuestionario>";

            if (getCuerpoCorreo() != null){
                XMLstring += "<cuerpoCorreo>" 
                          + getCuerpoCorreo()
                          + "</cuerpoCorreo>";
            }
            if (getAsuntoCorreo() != null){
                XMLstring += "<asuntoCorreo>" 
                          + getAsuntoCorreo()
                          + "</asuntoCorreo>";
            }
            return XMLstring;
        }
        else {
            throw new ExcepcionNodo("falta informacion en campos obligatorios");
        }
    }
    
    private boolean estaCompleto(){
        return getTipo() != null && getVariableCuestionario() != null;
    }
}
