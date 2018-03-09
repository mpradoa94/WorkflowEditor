/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import diagrameditor.workfloweditor.NodoRol;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MPA
 */
public class NodoRolTest {

    public NodoRolTest() {
    }

    @Test
    public void testSetGetEtiqueta() {
        System.out.println("setEtiqueta");
        String value = "Rol";
        NodoRol instancia = new NodoRol();
        instancia.setEtiqueta(value);
        assertEquals(value, instancia.getEtiqueta());
    }

    @Test
    public void testSetGetNombre() {
        System.out.println("setNombre");
        String nmRol = "Nombre";
        NodoRol instancia = new NodoRol();
        instancia.setNombre(nmRol);
        assertEquals(nmRol, instancia.getNombre());
    }

    @Test
    public void testSetCveRol() {
        System.out.println("setCveRol");
        String cveRol = "CVE";
        NodoRol instancia = new NodoRol();
        instancia.setCveRol(cveRol);
        assertEquals(cveRol, instancia.getCveRol());
    }

    @Test
    public void testGenerarXMLstringInicio() {
        System.out.println("generarXMLstringInicio");
        NodoRol instancia = new NodoRol();
        instancia.setCveRol("CVE");
        instancia.setNombre("Rol");
        
        String expResult = "<rol>"
                + "<cveRol>CVE</cveRol>"
                + "<nmRol>Rol</nmRol>";
        
        String result = instancia.generarXMLstringInicio();
        assertEquals(expResult, result);
    }

    @Test
    public void testGenerarXMLstringFin() {
        System.out.println("generarXMLstringFin");
        NodoRol instancia = new NodoRol();
        
        String expResult = "</rol>";
        
        String result = instancia.generarXMLstringFin();
        assertEquals(expResult, result);
    }

}
