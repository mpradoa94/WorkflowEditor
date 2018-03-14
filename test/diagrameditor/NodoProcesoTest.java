/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import diagrameditor.exceptions.ExcepcionNodo;
import diagrameditor.workfloweditor.Nodo;
import diagrameditor.workfloweditor.NodoRol;
import diagrameditor.workfloweditor.TipoNodo;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MPA
 */
public class NodoProcesoTest {

    public NodoProcesoTest() {
    }

    @Test
    public void testSetGetEtiqueta() {
        System.out.println("setEtiqueta");
        String value = "Proceso";
        Nodo instancia = new Nodo();
        instancia.setEtiqueta(value);
        assertEquals(value, instancia.getEtiqueta());
    }

    @Test
    public void testSetGetNombre() {
        System.out.println("setNombre");
        String nombre = "Nombre";
        Nodo instancia = new Nodo();
        instancia.setNombre(nombre);
        assertEquals(nombre, instancia.getNombre());
    }

    @Test
    public void testSetGetNumNodo() {
        System.out.println("setNumNodo");
        int numNodo = 0;
        Nodo instancia = new Nodo();
        instancia.setNumNodo(numNodo);
        assertEquals(numNodo, instancia.getNumNodo());
    }

    @Test
    public void testSetGetTipo() {
        System.out.println("setTipo");
        TipoNodo tipo = TipoNodo.Proceso;
        Nodo instancia = new Nodo();
        instancia.setTipoNodo(tipo);
        assertEquals(tipo, instancia.getTipoNodo());
    }

    @Test
    public void testSetGetRol() {
        System.out.println("setRol");
        NodoRol rol = null;
        Nodo instancia = new Nodo();
        instancia.addRol(rol);
        assertEquals(rol, instancia.getRol());
    }

    @Test
    public void testSetGetTiempoNodo() {
        System.out.println("setTiempoNodo");
        int tiempoNodo = 0;
        Nodo instancia = new Nodo();
        instancia.setTiempoNodo(tiempoNodo);
        assertEquals(tiempoNodo, instancia.getTiempoNodo());
    }

    @Test
    public void testSetGetTiempoNodoMax() {
        System.out.println("setTiempoNodoMax");
        int tiempoNodoMax = 0;
        Nodo instancia = new Nodo();
        instancia.setTiempoNodoMax(tiempoNodoMax);
        assertEquals(tiempoNodoMax, instancia.getTiempoNodoMax());
    }

    @Test
    public void testGenerateXML() {
        try {
            System.out.println("generateXMLstringInicio");
            
            Nodo instancia = new Nodo();
            instancia.setNombre("Proceso");
            instancia.setNumNodo(0);
            instancia.setTipoNodo(TipoNodo.Proceso);
            instancia.setTiempoNodo(0);
            instancia.setTiempoNodoMax(2);
            
            String expResult = "<nodos "
                    + "numNodo=\"0\" "
                    + "nombreNodo=\"Proceso\" "
                    + "tipoNodo=\"Proceso\" "
                    + "tiempoNodo=\"0\" "
                    + "tiempoNodoMax=\"2\" >";
            
            String result = instancia.generarXML();
            assertEquals(expResult, result);
        } catch (ExcepcionNodo ex) {
            Logger.getLogger(NodoProcesoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
