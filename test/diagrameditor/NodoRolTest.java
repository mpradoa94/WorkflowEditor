/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import diagrameditor.exceptions.ExcepcionNodo;
import diagrameditor.workfloweditor.NodoRol;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        try {
            System.out.println("generarXMLstringInicio");
            NodoRol instancia = new NodoRol();
            instancia.setCveRol("CVE");
            instancia.setNombre("Rol");
            
            String expResult = "<rol>"
                    + "<cveRol>CVE</cveRol>"
                    + "<nmRol>Rol</nmRol>";
            
            String result = instancia.generarXML();
            assertEquals(expResult, result);
        } catch (ExcepcionNodo ex) {
            Logger.getLogger(NodoRolTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
