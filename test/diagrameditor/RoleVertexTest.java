/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import java.awt.GridLayout;
import javax.swing.JPanel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MPA
 */
public class RoleVertexTest {
    
    public RoleVertexTest() {
    }
    

    @Test
    public void testSetLabel() {
        System.out.println("setLabel");
        String value = "New Label";
        RoleVertex instance = new RoleVertex("", "", "");
        instance.setLabel(value);
        assertEquals(instance.label, value);
    }

    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        RoleVertex instance = new RoleVertex("", "", "");
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        RoleVertex instance = new RoleVertex("", "", "");
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPropertiesPanel() {
        System.out.println("getPropertiesPanel");
        RoleVertex instance = new RoleVertex("", "", "");
        JPanel expResult = new JPanel(new GridLayout(0, 1));
        JPanel result = instance.getPropertiesPanel();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetKey() {
        System.out.println("getKey");
        RoleVertex instance = new RoleVertex("", "", "");
        String expResult = "";
        String result = instance.getKey();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetKey() {
        System.out.println("setKey");
        String key = "New Key";
        RoleVertex instance = new RoleVertex("", "", "");
        instance.setKey(key);
        assertEquals(instance.getKey(), key);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "New name";
        RoleVertex instance = new RoleVertex("", "", "");
        instance.setName(name);
        assertEquals(instance.getName(), name);
    }
    
}
