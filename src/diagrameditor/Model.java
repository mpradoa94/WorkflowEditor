/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import core.webmet.Modelo;

/**
 *
 * @author MPA
 */
public class Model extends Modelo{
    private Modelo modelo;
    
    public Model(Modelo modelo){
        this.modelo = modelo;
    }
    
     public String toString(){
        return modelo.getNombreCuestionario();
    }
    
     public Modelo getModelo(){
         return modelo;
     }
}
