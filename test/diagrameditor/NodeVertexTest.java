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
public class NodeVertexTest {
    
    public NodeVertexTest() {
    }

    @Test
    public void testSetLabel() {
        System.out.println("setLabel");
        String value = "";
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        instance.setLabel(value);
        assertEquals(instance.label, value);
    }

    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPropertiesPanel() {
        System.out.println("getPropertiesPanel");
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        JPanel expResult = null;
        JPanel result = instance.getPropertiesPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRole() {
        System.out.println("getRole");
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        RoleVertex expResult = null;
        RoleVertex result = instance.getRole();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetRole() {
        System.out.println("setRole");
        RoleVertex role = new RoleVertex("", "", "");
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        instance.setRole(role);
        assertEquals(instance.getRole(), role);
    }

    @Test
    public void testGetNum() {
        System.out.println("getNum");
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        int expResult = 0;
        int result = instance.getNum();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNum() {
        System.out.println("setNum");
        int num = 1;
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        instance.setNum(num);
        assertEquals(instance.getNum(), num);
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "New name";
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        instance.setName(name);
        assertEquals(instance.getName(), name);
    }

    @Test
    public void testGetTimeNode() {
        System.out.println("getTimeNode");
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        int expResult = 0;
        int result = instance.getTimeNode();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTimeNode() {
        System.out.println("setTimeNode");
        int timeNode = 2;
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        instance.setTimeNode(timeNode);
        assertEquals(instance.getTimeNode(), timeNode);
    }

    @Test
    public void testGetTimeNodeMax() {
        System.out.println("getTimeNodeMax");
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        int expResult = 0;
        int result = instance.getTimeNodeMax();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTimeNodeMax() {
        System.out.println("setTimeNodeMax");
        int timeNodeMax = 3;
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        instance.setTimeNodeMax(timeNodeMax);
        assertEquals(instance.getTimeNodeMax(), timeNodeMax);
    }

    @Test
    public void testGetType() {
        System.out.println("getType");
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        NodeType expResult = NodeType.TESTNODE;
        NodeType result = instance.getType();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetType() {
        System.out.println("setType");
        NodeType type = NodeType.END;
        NodeVertex instance = new NodeVertex("", "", NodeType.TESTNODE);
        instance.setType(type);
        assertEquals(instance.getType(), type);
    }
    
}
