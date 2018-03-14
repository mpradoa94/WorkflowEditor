/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import diagrameditor.exceptions.ExcepcionNodo;
import diagrameditor.workfloweditor.Comparativo;
import diagrameditor.workfloweditor.Comparativo2;
import diagrameditor.workfloweditor.Nodo;
import diagrameditor.workfloweditor.NodoBase;
import diagrameditor.workfloweditor.NodoCondicion;
import diagrameditor.workfloweditor.NodoFlujo;
import diagrameditor.workfloweditor.NodoRol;
import diagrameditor.workfloweditor.NodoSiguiente;
import diagrameditor.workfloweditor.TipoNodo;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MPA
 */
public class CellNodo {

    private final mxCell mxcell;
    private final Object valor;
    private final mxICell padre;
    private MiGraphComponent component;
    private final Object dropTarget;
    private final List<String> errors;

    public CellNodo(mxCell mxcell, Object dropTarget) {
        this.mxcell = mxcell;
        this.dropTarget = dropTarget;
        valor = mxcell.getValue();
        padre = mxcell.getParent();
        errors = new ArrayList();
    }

    //TODO: refactor
    public boolean dropValido() {
        if (valor instanceof NodoFlujo)
            return true;
        
        if (mxcell.isEdge()) {
            setRelaciones("Union", null, null);
        }

        if (dropTarget != null) {
            mxCell dropCell = (mxCell) dropTarget;
            Object drop = dropCell.getValue();
            if (valor instanceof NodoRol) {
                if (drop instanceof NodoFlujo) {
                    return true;
                } else {
                    errors.add("Agrega el rol dentro de un flujo");
                    return false;
                }
            } else if (valor instanceof Nodo || valor instanceof NodoCondicion) {
                if (drop instanceof NodoRol) {
                    if (valor instanceof Nodo)
                        setRelaciones("Nodo", dropCell, drop);
                    return true;
                } else {
                    errors.add("Agrega un rol primero");
                    return false;
                }
            } else if (valor instanceof NodoCondicion ||
                       valor instanceof Comparativo ||
                       valor instanceof Comparativo2) {
                if (drop instanceof NodoCondicion) {
                    setRelaciones(valor.getClass().toString(), dropCell, drop);
                    return true;
                }
                else {
                    errors.add("Agrega una condicion");
                    return false;
                }
            }
            else {
                errors.add("Agrega dentro de un flujo");
                return false;
            }
        }
        return false;       
    }

    private void setRelaciones(String tipo, mxCell cellPadre, Object padre) {
        switch (tipo) {
            case "Nodo":
                NodoFlujo flujo = (NodoFlujo) cellPadre.getParent().getValue();
                setValoresNodo((Nodo) valor, (NodoRol) padre, flujo);
                break;
            case "NodoCondicion":
                setCondicionApadre((NodoCondicion) valor, (NodoCondicion) padre);
                break;
            case "Comparativo":
                setComparativoApadre((Comparativo) valor, (NodoCondicion) padre);
                break;
            case "Comparativo2":
                setComparativo2Apadre((Comparativo2) valor, (NodoCondicion) padre);
                break;
            case "Union":
                setUniones();
                break;
        }
           
    }

    public List<String> getErrors() {
        return errors;
    }
    
    private void setValoresNodo(Nodo nodo, NodoRol rol, NodoFlujo flujo) {
        nodo.addRol(rol);
        if (nodo.getTipoNodo() == TipoNodo.Inicio) {
            flujo.setInicio(nodo);
        } else if (nodo.getTipoNodo() == TipoNodo.Proceso) {
            flujo.addNodo(nodo);
        } else if (nodo.getTipoNodo() == TipoNodo.Fin) {
            flujo.setFin(nodo);
        }
    }

    private void setCondicionApadre(NodoCondicion condicion, NodoCondicion condicionPadre) {
        try {
            condicionPadre.setCondicion(condicion);
        } catch (ExcepcionNodo ex) {
            errors.add(ex.getMessage());
        }
    }

    private void setComparativoApadre(Comparativo comparativo, NodoCondicion condicionPadre) {
        try {
            condicionPadre.setComparativo(comparativo);
        } catch (ExcepcionNodo ex) {
            errors.add(ex.getMessage());
        }
    }
    
    private void setComparativo2Apadre(Comparativo2 comparativo2, NodoCondicion condicionPadre) {
        condicionPadre.setComparativo2(comparativo2);
    }

    public void setUniones() {
        Object nodoOrigen = mxcell.getSource().getValue();
        Object nodoSiguiente = mxcell.getTarget().getValue();
        
        if (nodoOrigen instanceof Nodo){
            Nodo nodo = (Nodo) nodoOrigen;
            if (nodoSiguiente instanceof NodoCondicion) {
                NodoCondicion condicion = (NodoCondicion) nodoSiguiente;
                NodoSiguiente sig = new NodoSiguiente(nodo.getNumNodo(), condicion);
                nodo.addNodoSiguiente(sig);
            }
            else if (nodoSiguiente instanceof Nodo){
                NodoSiguiente sig = new NodoSiguiente(((Nodo)nodoSiguiente).getNumNodo());
                nodo.addNodoSiguiente(sig);
            }
        }
    }
}
