/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import core.webmet.GetModelo;
import core.webmet.GetModeloResponse;
import core.webmet.Instancia;
import core.webmet.Modelo;
import core.webmet.PreguntaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MPA
 */
public class Pregunta extends PreguntaDTO {

    private PreguntaDTO preguntaDTO;

    public Pregunta(PreguntaDTO preguntaDTO) {
        this.preguntaDTO = preguntaDTO;
    }

    public String toString() {
        return preguntaDTO.getDescripcion();
    }

    public PreguntaDTO getPreguntaDTO() {
        return preguntaDTO;
    }

    public static List<Pregunta> getPreguntas(int idModelo) {
        List<Pregunta> preguntas = new ArrayList();
        Instancia instancia = DiagramEditor.getInstancia();
        if (instancia != null) {
            GetModelo req = new GetModelo();
            req.setIDInstancia(DiagramEditor.getInstancia().getIDINSTANCIA());
            req.setTYMODELO("F");
            req.setOper("SNG");
            req.setIDMODELO(idModelo);
            List<PreguntaDTO> preguntasDTO = DiagramEditor.getPort().getPregunasW(req).getPreguntas();
            for (PreguntaDTO pregunta : preguntasDTO) {
                System.out.println("Pregunta: " + pregunta);
                preguntas.add(new Pregunta(pregunta));
            }
        }

        return preguntas;
    }
}
