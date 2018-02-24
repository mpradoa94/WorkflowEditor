/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import core.webmet.EJBWebServicev20;

/**
 *
 * @author MPA
 */
public class Encabezado {
    
    private String nombrePropietario;
    private String nombreReporte;
    private String lugar;
    private String prefix;
    private String xml;
    
    public Encabezado(){
        setNombrePropietario();
        setLugar();
        setXml();
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    private void setNombrePropietario() {
        nombrePropietario = DiagramEditor.getRespuestaLogIn().getDUEÑOFNPRS();
    }

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    public String getLugar() {
        return lugar;
    }

    private void setLugar() {
        lugar = DiagramEditor.getRespuestaLogIn().getDireccion().getESTADO();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getXml() {
        return xml;
    }
    
    public void setXml(){
        String xml = "<encabezado>";
        xml += "<nombrePropietario>" + getNombrePropietario() + "</nombrePropietario>\n";
        xml += "<nombreReporte>" + getNombreReporte() + "</nombreReporte>\n";
        xml += "<lugar>" + getLugar() + "</lugar>\n";
        xml += "<prefix>" + getPrefix() + "</prefix>";
    }
    
}
