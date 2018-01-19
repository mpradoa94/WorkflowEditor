
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getFormatoSelected complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getFormatoSelected">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_FORMATO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_MODELO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PROCESO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFormatoSelected", propOrder = {
    "idInstancia",
    "idopr",
    "idformato",
    "idmodelo",
    "idproceso"
})
public class GetFormatoSelected {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "ID_OPR")
    protected int idopr;
    @XmlElement(name = "ID_FORMATO")
    protected int idformato;
    @XmlElement(name = "ID_MODELO")
    protected int idmodelo;
    @XmlElement(name = "ID_PROCESO")
    protected int idproceso;

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
     * Obtiene el valor de la propiedad idopr.
     * 
     */
    public int getIDOPR() {
        return idopr;
    }

    /**
     * Define el valor de la propiedad idopr.
     * 
     */
    public void setIDOPR(int value) {
        this.idopr = value;
    }

    /**
     * Obtiene el valor de la propiedad idformato.
     * 
     */
    public int getIDFORMATO() {
        return idformato;
    }

    /**
     * Define el valor de la propiedad idformato.
     * 
     */
    public void setIDFORMATO(int value) {
        this.idformato = value;
    }

    /**
     * Obtiene el valor de la propiedad idmodelo.
     * 
     */
    public int getIDMODELO() {
        return idmodelo;
    }

    /**
     * Define el valor de la propiedad idmodelo.
     * 
     */
    public void setIDMODELO(int value) {
        this.idmodelo = value;
    }

    /**
     * Obtiene el valor de la propiedad idproceso.
     * 
     */
    public int getIDPROCESO() {
        return idproceso;
    }

    /**
     * Define el valor de la propiedad idproceso.
     * 
     */
    public void setIDPROCESO(int value) {
        this.idproceso = value;
    }

}
