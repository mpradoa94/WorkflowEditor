
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para accesoSemana complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="accesoSemana">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ACCESO_SEMANA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_SEMANA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FECHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ZONA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PERSONA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ENTRADAS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SALIDAS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="INTENT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accesoSemana", propOrder = {
    "idaccesosemana",
    "idsemana",
    "fecha",
    "idzona",
    "idpersona",
    "entradas",
    "salidas",
    "intent"
})
public class AccesoSemana {

    @XmlElement(name = "ID_ACCESO_SEMANA")
    protected int idaccesosemana;
    @XmlElement(name = "ID_SEMANA")
    protected int idsemana;
    @XmlElement(name = "FECHA")
    protected String fecha;
    @XmlElement(name = "ID_ZONA")
    protected int idzona;
    @XmlElement(name = "ID_PERSONA")
    protected int idpersona;
    @XmlElement(name = "ENTRADAS")
    protected int entradas;
    @XmlElement(name = "SALIDAS")
    protected int salidas;
    @XmlElement(name = "INTENT")
    protected int intent;

    /**
     * Obtiene el valor de la propiedad idaccesosemana.
     * 
     */
    public int getIDACCESOSEMANA() {
        return idaccesosemana;
    }

    /**
     * Define el valor de la propiedad idaccesosemana.
     * 
     */
    public void setIDACCESOSEMANA(int value) {
        this.idaccesosemana = value;
    }

    /**
     * Obtiene el valor de la propiedad idsemana.
     * 
     */
    public int getIDSEMANA() {
        return idsemana;
    }

    /**
     * Define el valor de la propiedad idsemana.
     * 
     */
    public void setIDSEMANA(int value) {
        this.idsemana = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHA() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHA(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idzona.
     * 
     */
    public int getIDZONA() {
        return idzona;
    }

    /**
     * Define el valor de la propiedad idzona.
     * 
     */
    public void setIDZONA(int value) {
        this.idzona = value;
    }

    /**
     * Obtiene el valor de la propiedad idpersona.
     * 
     */
    public int getIDPERSONA() {
        return idpersona;
    }

    /**
     * Define el valor de la propiedad idpersona.
     * 
     */
    public void setIDPERSONA(int value) {
        this.idpersona = value;
    }

    /**
     * Obtiene el valor de la propiedad entradas.
     * 
     */
    public int getENTRADAS() {
        return entradas;
    }

    /**
     * Define el valor de la propiedad entradas.
     * 
     */
    public void setENTRADAS(int value) {
        this.entradas = value;
    }

    /**
     * Obtiene el valor de la propiedad salidas.
     * 
     */
    public int getSALIDAS() {
        return salidas;
    }

    /**
     * Define el valor de la propiedad salidas.
     * 
     */
    public void setSALIDAS(int value) {
        this.salidas = value;
    }

    /**
     * Obtiene el valor de la propiedad intent.
     * 
     */
    public int getINTENT() {
        return intent;
    }

    /**
     * Define el valor de la propiedad intent.
     * 
     */
    public void setINTENT(int value) {
        this.intent = value;
    }

}
