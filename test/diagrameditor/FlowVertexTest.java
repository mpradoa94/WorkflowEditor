/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import javax.swing.JPanel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MPA
 */
public class FlowVertexTest {
    
    public FlowVertexTest() {
    }

    @Test
    public void testSetLabel() {
        System.out.println("setLabel");
        String value = "New Label";
        FlowVertex instance = new FlowVertex("");
        instance.setLabel(value);
        assertEquals(instance.label, value);
    }

    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        FlowVertex instance = new FlowVertex("");
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPropertiesPanel() {
        System.out.println("getPropertiesPanel");
        FlowVertex instance = new FlowVertex("");
        JPanel expResult = null;
        JPanel result = instance.getPropertiesPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdFlow() {
        System.out.println("getIdFlow");
        FlowVertex instance = new FlowVertex("");
        int expResult = 0;
        int result = instance.getIdFlow();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIdFlow() {
        System.out.println("setIdFlow");
        int idFlow = 1;
        FlowVertex instance = new FlowVertex("");
        instance.setIdFlow(idFlow);
        assertEquals(instance.getIdFlow(), idFlow);
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        FlowVertex instance = new FlowVertex("");
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "New Name";
        FlowVertex instance = new FlowVertex("");
        instance.setName(name);
        assertEquals(instance.getName(), name);
    }

    @Test
    public void testGetIdVersion() {
        System.out.println("getIdVersion");
        FlowVertex instance = new FlowVertex();
        int expResult = 0;
        int result = instance.getIdVersion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIdVersion() {
        System.out.println("setIdVersion");
        int idVersion = 1;
        FlowVertex instance = new FlowVertex();
        instance.setIdVersion(idVersion);
        assertEquals(instance.getIdVersion(), idVersion);
    }
    
}
