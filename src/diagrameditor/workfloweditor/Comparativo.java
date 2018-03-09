/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor.workfloweditor;

import core.webmet.OpcionDTO;
import core.webmet.PreguntaDTO;
import diagrameditor.Cuestionario;
import java.util.ArrayList;
import java.util.List;
import diagrameditor.exceptions.ExcepcionNodo;

/**
 *
 * @author MPA
 */
public class Comparativo {
    private static Cuestionario cuestionarioSeleccionado;
    private PreguntaDTO preguntaSeleccionada;
    private OpcionDTO opcionSeleccionada;
    private String variable1;
    private OperadorLogico opLogico;
    private OpcionComparativo opcionComparativo;
    
    public Comparativo(){
        
    }

    public String getVariable1() {
        return variable1;
    }

    public void setVariable1(String variable1) {
        this.variable1 = variable1;
    }

    public OperadorLogico getOpLogico() {
        return opLogico;
    }

    public void setOpLogico(OperadorLogico opLogico) {
        this.opLogico = opLogico;
    }

    public OpcionComparativo getOpcionComparativo() {
        return opcionComparativo;
    }
    
    public void setPreguntaSeleccionada(PreguntaDTO preguntaSeleccionada) {
        this.preguntaSeleccionada = preguntaSeleccionada;
    } 

    public PreguntaDTO getPreguntaSeleccionada() {
        return preguntaSeleccionada;
    }
    
    public void setcuestionarioSeleccionado(Cuestionario cuestionario) {
        this.cuestionarioSeleccionado = cuestionario;
    } 

    public Cuestionario getcuestionarioSeleccionado() {
        return cuestionarioSeleccionado;
    }

   public void setOpcionSeleccionada(OpcionDTO opcionSeleccionada) {
        this.opcionSeleccionada = opcionSeleccionada;
    }

    public OpcionDTO getOpcionSeleccionada() {
        return opcionSeleccionada;
    }
    
    public String generarXML() throws ExcepcionNodo{
        if (estaCompleto()){
            String XMLstring = "<comparative>";
            XMLstring += "<variable1>" + getVariable1() + "</variable1>";
            XMLstring += "<oplogico>" + getOpLogico() + "</oplogico>";
            XMLstring += "<" + getOpcionComparativo().nombre + ">";
            XMLstring += "</" + getOpcionComparativo().nombre + ">";
            XMLstring += "</comparative>";
            return XMLstring;
        }
        else {
            throw new ExcepcionNodo("falta informacion en campos obligatorios");
        }
    }
    
    private boolean estaCompleto(){
        return getVariable1() != null && getOpLogico() != null && getOpcionComparativo() != null;
    }

    public void setOpcionComparativo(OpcionComparativo opcionComparativo) throws ExcepcionNodo {
        OpcionesComparativo opciones = new OpcionesComparativo();
        if (opciones.opciones.contains(opcionComparativo)) {
            this.opcionComparativo = opcionComparativo;
        }
        else {
            throw new ExcepcionNodo("opcionComparativo no está en las opciones");
        }
        
    }

    private static class OpcionesComparativo {
        protected List<OpcionComparativo> opciones;
        
        public OpcionesComparativo(){
            init();
        }
        
        private void init(){
            OpcionComparativo valuestring = new OpcionComparativo("valuestring", TipoDato.string);
            OpcionComparativo valueinteger = new OpcionComparativo("valueinteger", TipoDato.integer);
            OpcionComparativo valuedate = new OpcionComparativo("valuedate", TipoDato.date);
            OpcionComparativo valuedecimal = new OpcionComparativo("valuedecimal", TipoDato.decimal);
            OpcionComparativo variable2 = new OpcionComparativo("variable2", TipoDato.string);
            
            opciones.add(valuestring);
            opciones.add(valueinteger);
            opciones.add(valuedate);
            opciones.add(valuedecimal);
            opciones.add(variable2);
        }
        
        public void addOpcion(OpcionComparativo opcion){
            opciones.add(opcion);
        }
    }

    private static class OpcionComparativo {
        protected String nombre;
        protected TipoDato tipo;
        protected String valor;
        
        public OpcionComparativo() {
        }
        
        public OpcionComparativo(String nombre, TipoDato tipo){
            this.nombre = nombre;
            this.tipo = tipo;
        }
    }

}
