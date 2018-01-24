/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import core.webmet.PreguntaDTO;

/**
 *
 * @author MPA
 */
public class Pregunta extends PreguntaDTO{
    
    private PreguntaDTO preguntaDTO;
    
    public Pregunta(PreguntaDTO preguntaDTO){
        this.preguntaDTO = preguntaDTO;
    }
    
    public String toString(){
        return preguntaDTO.getDescripcion();
    }
    
    public PreguntaDTO getPreguntaDTO(){
        return preguntaDTO;
    }
}
