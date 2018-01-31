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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MPA
 */
public class Cuestionario extends Modelo{
    private Modelo modelo;
    
    public Cuestionario(Modelo modelo){
        this.modelo = modelo;
    }
    
    public static List<Cuestionario> getOpcionesCuestionario(){
        List<Cuestionario> cuestionarios = new ArrayList();
        Instancia instancia = DiagramEditor.getInstancia();
        if(instancia != null){
            GetModeloResponse res;
            GetModelo req = new GetModelo();
            System.out.println(DiagramEditor.getInstancia());
            req.setIDInstancia(DiagramEditor.getInstancia().getIDINSTANCIA());
            req.setTYMODELO("F");
            req.setOper("TYP");
            req.setIDMODELO(0);
            res = DiagramEditor.getPort().getModeloW(req);
            for (Modelo modelo:res.getModelos()){
                cuestionarios.add(new Cuestionario(modelo));
            }
        }
        
        return cuestionarios;
    }
    
     public String toString(){
        return modelo.getNombreCuestionario();
    }
    
     public Modelo getModelo(){
         return modelo;
     }
}
