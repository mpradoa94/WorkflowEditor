/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor.cuestionario;

/**
 *
 * @author MPA
 */
public class Precondicion {

    private String funcion;
    private String nombre;
    private String descripcion;

    public Precondicion(String funcion, String descripcion) {
        this.funcion = funcion;
        this.descripcion = descripcion;
        obtenerNombreFunc();
    }

    public Precondicion(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
    }

    @Override
    public String toString() {
        return getFuncion();
    }

    private void obtenerNombre() {
        nombre = funcion.replace("@@", "");
    }

    private void obtenerNombreFunc() {
        int indexIzq = funcion.indexOf("(");
        if (indexIzq >= 0) {
            nombre = funcion.substring(0, indexIzq);
            nombre = nombre.replace("@@", "");
        }
        else
            nombre = funcion.replace("@@", "");
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
