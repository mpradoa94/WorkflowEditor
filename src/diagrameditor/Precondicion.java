/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

/**
 *
 * @author MPA
 */
public class Precondicion {
    
    private String funcion;
    private String nombre;
    private String params;
    private String descripcion;
    
    public Precondicion(String funcion, String descripcion) {
        this.funcion = funcion;
        obtenerElementosFunc();
        this.descripcion = descripcion;
    }
    
    public Precondicion(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
    }   
    
    @Override
    public String toString() {
        return getNombre();
    }
    
    private void obtenerElementosFunc(){
        nombre = funcion;
        if (nombre.startsWith("@@"))
            nombre = nombre.substring(2);
        int posDerParen = funcion.indexOf('(');
        int posIzqParen = funcion.indexOf(')');
        params = funcion.substring(posDerParen, posIzqParen);
    }
    
    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
