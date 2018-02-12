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
import core.webmet.OpcionDTO;
import core.webmet.PreguntaCerradaDTO;
import core.webmet.PreguntaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MPA
 */
public class OpcionCondicionales extends OpcionDTO {

    private final OpcionDTO opcionDTO;

    public OpcionCondicionales(OpcionDTO opcionDTO) {
        this.opcionDTO = opcionDTO;
    }

    @Override
    public String toString() {
        return opcionDTO.getDescripcion();
    }

    public OpcionDTO getOpcionDTO() {
        return opcionDTO;
    }

    public static List<OpcionCondicionales> getOpciones(PreguntaCerradaDTO pregunta) {
        List<OpcionCondicionales> opciones = new ArrayList();
        List<OpcionDTO> opcionesDTO = pregunta.getOpciones().getOpcion();
        opcionesDTO.stream().forEach((opcion) -> {
            opciones.add(new OpcionCondicionales(opcion));
        });

        return opciones;
    }
}
