
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getImpuestosNotariaAll complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getImpuestosNotariaAll">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_Sis" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_Seq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getImpuestosNotariaAll", propOrder = {
    "idInstancia",
    "idSis",
    "idSeq"
})
public class GetImpuestosNotariaAll {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "ID_Sis")
    protected int idSis;
    @XmlElement(name = "ID_Seq")
    protected int idSeq;

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIDInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIDInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad idSis.
     * 
     */
    public int getIDSis() {
        return idSis;
    }

    /**
     * Define el valor de la propiedad idSis.
     * 
     */
    public void setIDSis(int value) {
        this.idSis = value;
    }

    /**
     * Obtiene el valor de la propiedad idSeq.
     * 
     */
    public int getIDSeq() {
        return idSeq;
    }

    /**
     * Define el valor de la propiedad idSeq.
     * 
     */
    public void setIDSeq(int value) {
        this.idSeq = value;
    }

}
