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
public class ConditionVertexTest {
    
    public ConditionVertexTest() {
    }

    @Test
    public void testSetLabel() {
        System.out.println("setLabel");
        String value = "New Label";
        ConditionVertex instance = new ConditionVertex("", "", NodeType.IF);
        instance.setLabel(value);
        assertEquals(instance.label, value);
    }

    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        ConditionVertex instance = new ConditionVertex("", "", NodeType.IF);
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPropertiesPanel() {
        System.out.println("getPropertiesPanel");
        ConditionVertex instance = new ConditionVertex("", "", NodeType.IF);
        JPanel expResult = null;
        JPanel result = instance.getPropertiesPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRole() {
        System.out.println("getRole");
        ConditionVertex instance = new ConditionVertex("", "", NodeType.IF);
        RoleVertex expResult = null;
        RoleVertex result = instance.getRole();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetRole() {
        System.out.println("setRole");
        RoleVertex role = new RoleVertex();
        ConditionVertex instance = new ConditionVertex("", "", NodeType.IF);
        instance.setRole(role);
        assertEquals(instance.getRole(), role);
    }

    @Test
    public void testGetNum() {
        System.out.println("getNum");
        ConditionVertex instance = new ConditionVertex("", "", NodeType.IF);
        int expResult = 0;
        int result = instance.getNum();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNum() {
        System.out.println("setNum");
        int num = 1;
        ConditionVertex instance = new ConditionVertex("", "", NodeType.IF);
        instance.setNum(num);
        assertEquals(instance.getNum(), num);
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        ConditionVertex instance = new ConditionVertex("", "", NodeType.IF);
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "New Name";
        ConditionVertex instance = new ConditionVertex("", "", NodeType.IF);
        instance.setName(name);
        assertEquals(instance.getName(), name);
    }

    @Test
    public void testGetType() {
        System.out.println("getType");
        ConditionVertex instance = new ConditionVertex("", "", NodeType.IF);
        NodeType expResult = NodeType.IF;
        NodeType result = instance.getType();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetType() {
        System.out.println("setType");
        NodeType type = null;
        ConditionVertex instance = new ConditionVertex("", "", NodeType.IF);
        instance.setType(type);
        assertEquals(instance.getType(), type);
    }
    
}
