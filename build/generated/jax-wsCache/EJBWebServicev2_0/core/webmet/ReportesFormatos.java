
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reportesFormatos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reportesFormatos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idreporteformato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idformato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idmodelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultadoxml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportesFormatos", propOrder = {
    "idreporteformato",
    "idformato",
    "idmodelo",
    "resultadoxml"
})
public class ReportesFormatos {

    protected int idreporteformato;
    protected int idformato;
    protected int idmodelo;
    protected String resultadoxml;

    /**
     * Obtiene el valor de la propiedad idreporteformato.
     * 
     */
    public int getIdreporteformato() {
        return idreporteformato;
    }

    /**
     * Define el valor de la propiedad idreporteformato.
     * 
     */
    public void setIdreporteformato(int value) {
        this.idreporteformato = value;
    }

    /**
     * Obtiene el valor de la propiedad idformato.
     * 
     */
    public int getIdformato() {
        return idformato;
    }

    /**
     * Define el valor de la propiedad idformato.
     * 
     */
    public void setIdformato(int value) {
        this.idformato = value;
    }

    /**
     * Obtiene el valor de la propiedad idmodelo.
     * 
     */
    public int getIdmodelo() {
        return idmodelo;
    }

    /**
     * Define el valor de la propiedad idmodelo.
     * 
     */
    public void setIdmodelo(int value) {
        this.idmodelo = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoxml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoxml() {
        return resultadoxml;
    }

    /**
     * Define el valor de la propiedad resultadoxml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoxml(String value) {
        this.resultadoxml = value;
    }

}
