
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuariosEI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuariosEI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TY_OPER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_USER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_OPR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_OPR_EXT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fv" type="{http://Webmet.core/}flujoVersion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nomUsu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuariosEI", propOrder = {
    "tyoper",
    "iduser",
    "idopr",
    "idoprext",
    "fv",
    "nomUsu"
})
public class UsuariosEI {

    @XmlElement(name = "TY_OPER")
    protected String tyoper;
    @XmlElement(name = "ID_USER")
    protected int iduser;
    @XmlElement(name = "ID_OPR")
    protected int idopr;
    @XmlElement(name = "ID_OPR_EXT")
    protected int idoprext;
    @XmlElement(nillable = true)
    protected List<FlujoVersion> fv;
    protected String nomUsu;

    /**
     * Obtiene el valor de la propiedad tyoper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYOPER() {
        return tyoper;
    }

    /**
     * Define el valor de la propiedad tyoper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYOPER(String value) {
        this.tyoper = value;
    }

    /**
     * Obtiene el valor de la propiedad iduser.
     * 
     */
    public int getIDUSER() {
        return iduser;
    }

    /**
     * Define el valor de la propiedad iduser.
     * 
     */
    public void setIDUSER(int value) {
        this.iduser = value;
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
     * Obtiene el valor de la propiedad idoprext.
     * 
     */
    public int getIDOPREXT() {
        return idoprext;
    }

    /**
     * Define el valor de la propiedad idoprext.
     * 
     */
    public void setIDOPREXT(int value) {
        this.idoprext = value;
    }

    /**
     * Gets the value of the fv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlujoVersion }
     * 
     * 
     */
    public List<FlujoVersion> getFv() {
        if (fv == null) {
            fv = new ArrayList<FlujoVersion>();
        }
        return this.fv;
    }

    /**
     * Obtiene el valor de la propiedad nomUsu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomUsu() {
        return nomUsu;
    }

    /**
     * Define el valor de la propiedad nomUsu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomUsu(String value) {
        this.nomUsu = value;
    }

}
