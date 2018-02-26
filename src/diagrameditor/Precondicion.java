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
    
    private String nombre;
    private String descripcion;
    
    public Precondicion(String nombre, String descripcion) {
        this.nombre = nombre;
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
