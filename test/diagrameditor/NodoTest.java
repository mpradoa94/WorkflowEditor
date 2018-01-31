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
public class NodoTest {
    
    public NodoTest() {
    }

    @Test
    public void testSetEtiqueta() {
        System.out.println("setEtiqueta");
        String valor = "";
        Nodo instance = new NodoImpl();
        instance.setEtiqueta(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEtiqueta() {
        System.out.println("getEtiqueta");
        Nodo instance = new NodoImpl();
        String expResult = "";
        String result = instance.getEtiqueta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Nodo instance = new NodoImpl();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Nodo instance = new NodoImpl();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGenerateXMLstringInicio() {
        System.out.println("generateXMLstringInicio");
        Nodo instance = new NodoImpl();
        String expResult = "";
        String result = instance.generateXMLstringInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGenerateXMLstringFin() {
        System.out.println("generateXMLstringFin");
        Nodo instance = new NodoImpl();
        String expResult = "";
        String result = instance.generateXMLstringFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class NodoImpl implements Nodo {

        public void setEtiqueta(String valor) {
        }

        public String getEtiqueta() {
            return "";
        }

        public void setNombre(String nombre) {
        }

        public String getNombre() {
            return "";
        }

        public String generateXMLstringInicio() {
            return "";
        }

        public String generateXMLstringFin() {
            return "";
        }
    }
    
}
