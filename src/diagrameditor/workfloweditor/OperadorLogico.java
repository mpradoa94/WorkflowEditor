/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor.workfloweditor;

/**
 *
 * @author MPA
 */
public enum OperadorLogico {
    equal ("equal"),
    mayoroigual ("mayor o igual"),
    menoroigual ("menor o igual"),
    distinto ("distinto"),
    mayor ("mayor"),
    menor ("menor");
    

    private final String nombre;       

    private OperadorLogico(String s) {
        nombre = s;
    }

    public boolean equalsNombre(String otroNombre) {
        return nombre.equals(otroNombre);
    }

    public String toString() {
       return this.nombre;
    }
}
