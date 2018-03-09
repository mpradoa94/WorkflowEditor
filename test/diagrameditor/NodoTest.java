/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import diagrameditor.workfloweditor.NodoBase;
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
        NodoBase instancia = new NodoImpl();
        instancia.setEtiqueta(valor);
        assertEquals(valor, instancia.getEtiqueta());
    }

    @Test
    public void testGetEtiqueta() {
        System.out.println("getEtiqueta");
        NodoBase instancia = new NodoImpl();
        String espResult = "";
        String result = instancia.getEtiqueta();
        assertEquals(espResult, result);
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        NodoBase instancia = new NodoImpl();
        instancia.setNombre(nombre);
        assertEquals(nombre, instancia.getNombre());
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        NodoBase instancia = new NodoImpl();
        String espResult = "";
        String result = instancia.getNombre();
        assertEquals(espResult, result);
    }

    @Test
    public void testGenerarXMLstringInicio() {
        System.out.println("generateXMLstringInicio");
        NodoBase instancia = new NodoImpl();
        String espResult = "";
        String result = instancia.generarXMLstringInicio();
        assertEquals(espResult, result);
    }

    @Test
    public void testGenerarXMLstringFin() {
        System.out.println("generateXMLstringFin");
        NodoBase instancia = new NodoImpl();
        String espResult = "";
        String result = instancia.generarXMLstringFin();
        assertEquals(espResult, result);
    }

    public class NodoImpl implements NodoBase {

        @Override
        public void setEtiqueta(String valor) {
        }

        public String getEtiqueta() {
            return "";
        }

        @Override
        public void setNombre(String nombre) {
        }

        @Override
        public String getNombre() {
            return "";
        }

        @Override
        public String generarXMLstringInicio() {
            return "";
        }

        @Override
        public String generarXMLstringFin() {
            return "";
        }
    }
    
}
