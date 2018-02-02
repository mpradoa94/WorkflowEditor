/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

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
        NodoProceso instancia = new NodoProceso();
        instancia.setEtiqueta(value);
        assertEquals(value, instancia.getEtiqueta());
    }

    @Test
    public void testSetGetNombre() {
        System.out.println("setNombre");
        String nombre = "Nombre";
        NodoProceso instancia = new NodoProceso();
        instancia.setNombre(nombre);
        assertEquals(nombre, instancia.getNombre());
    }

    @Test
    public void testSetGetNumNodo() {
        System.out.println("setNumNodo");
        int numNodo = 0;
        NodoProceso instancia = new NodoProceso();
        instancia.setNumNodo(numNodo);
        assertEquals(numNodo, instancia.getNumNodo());
    }

    @Test
    public void testSetGetTipo() {
        System.out.println("setTipo");
        TipoNodo tipo = TipoNodo.Proceso;
        NodoProceso instancia = new NodoProceso();
        instancia.setTipo(tipo);
        assertEquals(tipo, instancia.getTipo());
    }

    @Test
    public void testSetGetRol() {
        System.out.println("setRol");
        NodoRol rol = null;
        NodoProceso instancia = new NodoProceso();
        instancia.setRol(rol);
        assertEquals(rol, instancia.getRol());
    }

    @Test
    public void testSetGetTiempoNodo() {
        System.out.println("setTiempoNodo");
        int tiempoNodo = 0;
        NodoProceso instancia = new NodoProceso();
        instancia.setTiempoNodo(tiempoNodo);
        assertEquals(tiempoNodo, instancia.getTiempoNodo());
    }

    @Test
    public void testSetGetTiempoNodoMax() {
        System.out.println("setTiempoNodoMax");
        int tiempoNodoMax = 0;
        NodoProceso instancia = new NodoProceso();
        instancia.setTiempoNodoMax(tiempoNodoMax);
        assertEquals(tiempoNodoMax, instancia.getTiempoNodoMax());
    }

    @Test
    public void testGenerateXMLstringInicio() {
        System.out.println("generateXMLstringInicio");

        NodoProceso instancia = new NodoProceso();
        instancia.setNombre("Proceso");
        instancia.setNumNodo(0);
        instancia.setTipo(TipoNodo.Proceso);
        instancia.setTiempoNodo(0);
        instancia.setTiempoNodoMax(2);

        String expResult = "<nodos "
                + "numNodo=\"0\" "
                + "nombreNodo=\"Proceso\" "
                + "tipoNodo=\"Proceso\" "
                + "tiempoNodo=\"0\" "
                + "tiempoNodoMax=\"2\" >";

        String result = instancia.generarXMLstringInicio();
        assertEquals(expResult, result);
    }

    @Test
    public void testGenerateXMLstringFin() {
        System.out.println("generateXMLstringFin");

        NodoProceso instancia = new NodoProceso();
        instancia.setRol(new NodoRol());
        instancia.setTipo(TipoNodo.Proceso);

        String expResult = "<rol>"
                + "<cveRol>null</cveRol>"
                + "<nmRol>null</nmRol>"
                + "</rol>"
                + "</nodos>";

        String result = instancia.generarXMLstringFin();
        assertEquals(expResult, result);
    }

}
