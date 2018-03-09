/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import diagrameditor.workfloweditor.NodoFlujo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MPA
 */
public class NodoFlujoTest {
    
    public NodoFlujoTest() {
    }

    @Test
    public void testSetEtiqueta() {
        System.out.println("setEtiqueta");
        String value = "flujo";
        NodoFlujo instancia = new NodoFlujo();
        instancia.setEtiqueta(value);
        assertEquals(value, instancia.getEtiqueta());
    }

    @Test
    public void testGetEtiqueta() {
        System.out.println("getEtiqueta");
        NodoFlujo instancia = new NodoFlujo();
        instancia.setEtiqueta("");
        String expResult = "";
        String result = instancia.getEtiqueta();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "nodo flujo";
        NodoFlujo instancia = new NodoFlujo();
        instancia.setNombre(nombre);
        assertEquals(nombre, instancia.getNombre());
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        NodoFlujo instancia = new NodoFlujo();
        instancia.setNombre("");
        String expResult = "";
        String result = instancia.getNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIdFlujo() {
        System.out.println("setIdFlujo");
        int idFlujo = 0;
        NodoFlujo instancia = new NodoFlujo();
        instancia.setIdFlujo(idFlujo);
        assertEquals(idFlujo, instancia.getIdFlujo());
    }

    @Test
    public void testGetIdFlujo() {
        System.out.println("getIdFlujo");
        NodoFlujo instancia = new NodoFlujo();
        instancia.setIdFlujo(0);
        int expResult = 0;
        int result = instancia.getIdFlujo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIdVersion() {
        System.out.println("setIdVersion");
        int idVersion = 0;
        NodoFlujo instancia = new NodoFlujo();
        instancia.setIdVersion(idVersion);
        assertEquals(idVersion, instancia.getIdVersion());
    }

    @Test
    public void testGetIdVersion() {
        System.out.println("getIdVersion");
        NodoFlujo instancia = new NodoFlujo();
        instancia.setIdVersion(0);
        int expResult = 0;
        int result = instancia.getIdVersion();
        assertEquals(expResult, result);
    }

    @Test
    public void testGenerateXMLstringInicio() {
        System.out.println("generateXMLstringInicio");
        
        NodoFlujo instancia = new NodoFlujo();
        instancia.setNombre("test");
        instancia.setIdFlujo(0);
        instancia.setIdVersion(0);
        
        String expResult = "<flujo "
                + "idFlujo=\"0\" "
                + "idVersion=\"0\" "
                + "nmFlujo=\"test\">";
        
        String result = instancia.generarXMLstringInicio();
        assertEquals(expResult, result);
    }

    @Test
    public void testGenerateXMLstringFin() {
        System.out.println("generateXMLstringFin");
        NodoFlujo instancia = new NodoFlujo();
        String expResult = "</flujo>";
        String result = instancia.generarXMLstringFin();
        assertEquals(expResult, result);
    }
    
}
