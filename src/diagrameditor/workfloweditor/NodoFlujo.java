/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor.workfloweditor;

import java.util.ArrayList;
import java.util.List;
import diagrameditor.exceptions.ExcepcionNodo;

/**
 *
 * @author MPA
 */
public class NodoFlujo implements NodoBase {
    
    private int idFlujo;
    private String etiqueta;
    private String nombre;
    private int idVersion;
    
    private NodoBase inicio;
    private List<NodoBase> nodos;
    private NodoBase fin;
    
    
    public NodoFlujo(){   
    }
    
    public NodoFlujo(String etiqueta){
        this.etiqueta = etiqueta;
        this.nombre = etiqueta;
    }
    
    public NodoFlujo(int idFlujo, int idVersion, String nmFlujo){
        this.idFlujo = idFlujo;
        this.nombre = nmFlujo;
        this.idVersion = idVersion;
        this.nodos = new ArrayList();
    }

    public int getIdFlujo() {
        return idFlujo;
    }

    public void setIdFlujo(int idFlujo) {
        this.idFlujo = idFlujo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nmFlujo) {
        this.nombre = nmFlujo;
    }
    
    
    @Override
    public String getEtiqueta() {
        return etiqueta;
    }

    @Override
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getIdVersion() {
        return idVersion;
    }

    public void setIdVersion(int idVersion) {
        this.idVersion = idVersion;
    }

    public NodoBase getInicio() {
        return inicio;
    }

    public void setInicio(NodoBase inicio) {
        this.inicio = inicio;
    }

    public List<NodoBase> getNodos() {
        return nodos;
    }
    
    public void addNodo(NodoBase nodo){
        this.nodos.add(nodo);
    }

    public NodoBase getFin() {
        return fin;
    }

    public void setFin(NodoBase fin) {
        this.fin = fin;
    }
    
    public String generarXML() throws ExcepcionNodo{
        String XMLstring = "<flujo ";
        XMLstring += "idFlujo=\"" + getIdFlujo() + "\" ";
        XMLstring += "idVersion=\"" + getIdVersion() + "\" ";
        XMLstring += "nmFlujo=\"" + getNombre() + "\"";
        XMLstring += ">\n";
        
        XMLstring += inicio.generarXML();
        for (NodoBase nodo:nodos){
            XMLstring += nodo.generarXML();
        }
        XMLstring += fin.generarXML();
        
        XMLstring += "</flujo>";
        return XMLstring;
    }

}
