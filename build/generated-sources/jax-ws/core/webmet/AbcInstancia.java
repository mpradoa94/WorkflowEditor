
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcInstancia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcInstancia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instancia" type="{http://Webmet.core/}instancia"/>
 *         &lt;element name="DB_SCRIPT" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcInstancia", propOrder = {
    "operacion",
    "instancia",
    "dbscript"
})
public class AbcInstancia {

    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(required = true)
    protected Instancia instancia;
    @XmlElement(name = "DB_SCRIPT", required = true)
    protected byte[] dbscript;

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad instancia.
     * 
     * @return
     *     possible object is
     *     {@link Instancia }
     *     
     */
    public Instancia getInstancia() {
        return instancia;
    }

    /**
     * Define el valor de la propiedad instancia.
     * 
     * @param value
     *     allowed object is
     *     {@link Instancia }
     *     
     */
    public void setInstancia(Instancia value) {
        this.instancia = value;
    }

    /**
     * Obtiene el valor de la propiedad dbscript.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDBSCRIPT() {
        return dbscript;
    }

    /**
     * Define el valor de la propiedad dbscript.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDBSCRIPT(byte[] value) {
        this.dbscript = value;
    }

}
