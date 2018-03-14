/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor.workfloweditor;

import java.util.List;
import diagrameditor.exceptions.ExcepcionNodo;
import java.util.ArrayList;

/**
 *
 * @author MPA
 */
public class Nodo implements NodoBase{
    
    private String etiqueta;
    private Integer numNodo;
    private String nombre;
    private String tipoProceso;
    private Integer tiempoNodo;
    private Integer tiempoNodoMax;
    private TipoNodo tipoNodo;
    
    private List<NodoSiguiente> nodoSiguiente;
    private List<PropiedadesNodo> propiedades;
    private List<NodoRol> roles;
    
    
    public Nodo(){
        
    }
    
    public Nodo(String etiqueta, TipoNodo tipoNodo){
        this.etiqueta = etiqueta;
        this.nombre = etiqueta;
        this.tipoNodo = tipoNodo;
    }
    
    public Nodo(int numNodo, String nombreNodo, TipoNodo tipoNodo){
        this.numNodo = numNodo;
        this.nombre = nombreNodo;
        this.tipoNodo = tipoNodo;
    }
    
    @Override
    public String toString(){
        return nombre;
    }

    public int getNumNodo() {
        return numNodo;
    }

    public void setNumNodo(int numNodo) {
        this.numNodo = new Integer(numNodo);
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

    public String getTipoProceso() {
        return tipoProceso;
    }

    public void setTipoProceso(String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }

    public int getTiempoNodo() {
        return tiempoNodo;
    }

    public void setTiempoNodo(int tiempoNodo) {
        this.tiempoNodo = tiempoNodo;
    }

    public int getTiempoNodoMax() {
        return tiempoNodoMax;
    }

    public void setTiempoNodoMax(int tiempoNodoMax) {
        this.tiempoNodoMax = tiempoNodoMax;
    }

    public TipoNodo getTipoNodo() {
        return tipoNodo;
    }

    public void setTipoNodo(TipoNodo tipoNodo) {
        this.tipoNodo = tipoNodo;
    }

    public List getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void addNodoSiguiente(NodoSiguiente nodoSiguiente) {
        this.nodoSiguiente.add(nodoSiguiente);
    }

    public List getPropiedades() {
        return propiedades;
    }

    public void addPropiedad(PropiedadesNodo propiedad) {
        this.propiedades.add(propiedad);
    }

    public List<NodoRol> getRol() {
        return roles;
    }

    public void addRol(NodoRol rol){
        if(roles == null)
            roles = new ArrayList();
        if (!roles.contains(rol))
            this.roles.add(rol);
    }
    
    @Override
    public String generarXML() throws ExcepcionNodo{
        if (estaCompleto()) {
            String XMLstring = "";
            String tagTipo = getTagTipo();
            XMLstring += "<" + tagTipo + " ";
            XMLstring += "numNodo=\"" + getNumNodo() + "\" ";
            XMLstring += "nombreNodo=\"" + getNombre() + "\" ";
            XMLstring += "tipoNodo=\"" + getTipoNodo() + "\" ";
            if (tiempoNodo != null){
                XMLstring += "tiempoNodo=\"" + getTiempoNodo() + "\" ";
            }
            if (tiempoNodoMax != null){
                XMLstring += "tiempoNodoMax=\"" + getTiempoNodoMax() + "\" ";
            }
            XMLstring += ">\n";
            if (getNodoSiguiente() != null) {
                for (NodoSiguiente sig:nodoSiguiente){
                    XMLstring += sig.generarXML()+ "\n";
                }
            }
            if (getPropiedades() != null) {
                for (PropiedadesNodo propiedad: propiedades){
                    XMLstring += propiedad.generarXML();
                }
            }
            XMLstring += "<rol>"; 
            for (NodoRol rol:roles){
                XMLstring += rol.generarXML();
            }
            XMLstring += "</rol>";
            XMLstring += "</" + tagTipo + ">\n";

            return XMLstring;
        }
        else {
            throw new ExcepcionNodo("Nodo: falta informacion en campos obligatorios");
        }
    }
    
    private boolean estaCompleto() {
        return numNodo != null && getNombre() != null && getTipoNodo() != null && getRol() != null;
    }
    
    private String getTagTipo() throws ExcepcionNodo {
        if (getTipoNodo() == TipoNodo.Inicio){
            return "inicio";
        }
        else if (getTipoNodo() == TipoNodo.Proceso){
            return "nodos";
        }
        else if (getTipoNodo() == TipoNodo.Fin){
            return "fin";
        }
        else {
            throw new ExcepcionNodo("Tipo de Nodo no soportado");
        }
    }
}
