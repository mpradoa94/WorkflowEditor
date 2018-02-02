/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

//import core.encuesta.dtos.CuestionarioDTO;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.w3c.dom.Document;


public class ParseMarshall{
    private InputStream inXML;
    
    private boolean LeeValidaXML(){
        try{
            //inXML=getClass().getResourceAsStream("/core/encuesta/xmlvd/XMLPoder2a.xml");
            //inXML=getClass().getResourceAsStream("/core/encuesta/xmlvd/XMLPermisoSalir.xml");
            //inXML=getClass().getResourceAsStream("/core/encuesta/xmlvd/XMLExpedienteUnico.xml");
            //inXML=getClass().getResourceAsStream("/core/encuesta/xmlvd/XMLEscrituras.xml");
            //inXML=getClass().getResourceAsStream("/core/encuesta/xmlvd/XMLActaDestacada.xml");
            //inXML=getClass().getResourceAsStream("/core/encuesta/xmlvd/XMLActaDestacadaDependientes.xml");
            //inXML=getClass().getResourceAsStream("/core/encuesta/xmlvd/XMLActaDestacadaUnionLibre.xml");
            //inXML=getClass().getResourceAsStream("/core/encuesta/xmlvd/XMLTestamento.xml");
            inXML=getClass().getResourceAsStream("/core/encuesta/xmlvd/XMLConstitutiva.xml");
            InputStream inXSD=getClass().getResourceAsStream("/core/encuesta/xmlvd/Encuestas2.xsd");
            Source schemaSource=new StreamSource(inXSD);
            DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            DocumentBuilder parser=dbf.newDocumentBuilder();
            Document doc=parser.parse(inXML);
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(schemaSource);
            Validator validator = schema.newValidator();
            validator.validate(new DOMSource(doc));
            return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    
    public boolean ValidaStringXML(String XMLEntrada){
        try{
            InputStream inXSD=getClass().getResourceAsStream("/resources/Flujos.xsd");
            Source schemaSource=new StreamSource(inXSD);
            DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            DocumentBuilder parser=dbf.newDocumentBuilder();
            InputStream is = new ByteArrayInputStream(XMLEntrada.getBytes(StandardCharsets.UTF_8));
            Document doc;
            doc = parser.parse(is);
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(schemaSource);
            Validator validator = schema.newValidator();
            validator.validate(new DOMSource(doc));
            return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
}