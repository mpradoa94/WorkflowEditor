/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrameditor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MPA
 */
public class ParseMarshallTest {

    public ParseMarshallTest() {
    }

    private String leerArchivoComoString(String filePath) throws IOException {
        StringBuilder fileData = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new FileReader(filePath))) {
            char[] buf = new char[1024];
            int numRead;
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
            }
        }
        return fileData.toString();
    }

    @Test
    public void testValidaStringXMLCorrecto() {
        System.out.println("ValidaStringXML");
        ParseMarshall instance = new ParseMarshall();
        String XMLEntrada;
        try {
            XMLEntrada = leerArchivoComoString("test/resources/correcto.xml");
            boolean expResult = true;
            boolean result = instance.ValidaStringXML(XMLEntrada);
            assertEquals(expResult, result);
        } catch (IOException ex) {
            Logger.getLogger(ParseMarshallTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Something went wrong.");
        }  
    }
    
    @Test
    public void testValidaStringXMLIncorrecto() {
        System.out.println("ValidaStringXML");
        ParseMarshall instance = new ParseMarshall();
        String XMLEntrada;
        try {
            XMLEntrada = leerArchivoComoString("test/resources/incorrecto.xml");
            boolean expResult = false;
            boolean result = instance.ValidaStringXML(XMLEntrada);
            assertEquals(expResult, result);
        } catch (IOException ex) {
            Logger.getLogger(ParseMarshallTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Something went wrong.");
        }  
    }

}
