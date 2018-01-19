
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para logInResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="logInResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultadoMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_Opr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_Rol" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nm_Oper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ts_Tm_Str" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dc_dy_Bsn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ai_Trn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_RPSTY_TND" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="permisos" type="{http://Webmet.core/}permiso" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mensajes" type="{http://Webmet.core/}mensajes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nm_Str_Rt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="url_server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="database_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_Lgn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nm_Lgn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_CTAC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fVence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTANCIA" type="{http://Webmet.core/}instancia" minOccurs="0"/>
 *         &lt;element name="tiendas" type="{http://Webmet.core/}tiend" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="permNot" type="{http://Webmet.core/}procesos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="defaultTax" type="{http://Webmet.core/}taxableGroup" minOccurs="0"/>
 *         &lt;element name="id_country" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_ext" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ty_ro_prty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://Webmet.core/}partyAddress" minOccurs="0"/>
 *         &lt;element name="DUEÑO_PRTY_PRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUEÑO_FN_PRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUEÑO_LN_PRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUEÑO_NM_PRS_SFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FL_EXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logInResponse", propOrder = {
    "oper",
    "resultado",
    "resultadoMsg",
    "idOpr",
    "idRol",
    "nmOper",
    "tsTmStr",
    "dcDyBsn",
    "aiTrn",
    "idrpstytnd",
    "permisos",
    "mensajes",
    "nmStrRt",
    "idInstancia",
    "urlServer",
    "databaseName",
    "idLgn",
    "nmLgn",
    "idct",
    "idctac",
    "fVence",
    "instancia",
    "tiendas",
    "permNot",
    "defaultTax",
    "idCountry",
    "idExt",
    "tyRoPrty",
    "direccion",
    "due\u00f1oprtyprs",
    "due\u00f1ofnprs",
    "due\u00f1olnprs",
    "due\u00f1onmprssfx",
    "flext"
})
public class LogInResponse {

    protected String oper;
    protected int resultado;
    protected String resultadoMsg;
    @XmlElement(name = "id_Opr")
    protected int idOpr;
    @XmlElement(name = "id_Rol")
    protected int idRol;
    @XmlElement(name = "nm_Oper")
    protected String nmOper;
    @XmlElement(name = "ts_Tm_Str")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tsTmStr;
    @XmlElement(name = "dc_dy_Bsn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dcDyBsn;
    @XmlElement(name = "ai_Trn")
    protected int aiTrn;
    @XmlElement(name = "ID_RPSTY_TND")
    protected int idrpstytnd;
    @XmlElement(nillable = true)
    protected List<Permiso> permisos;
    @XmlElement(nillable = true)
    protected List<Mensajes> mensajes;
    @XmlElement(name = "nm_Str_Rt")
    protected String nmStrRt;
    @XmlElement(name = "id_instancia")
    protected int idInstancia;
    @XmlElement(name = "url_server")
    protected String urlServer;
    @XmlElement(name = "database_name")
    protected String databaseName;
    @XmlElement(name = "id_Lgn")
    protected int idLgn;
    @XmlElement(name = "nm_Lgn")
    protected String nmLgn;
    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "ID_CTAC")
    protected int idctac;
    protected String fVence;
    @XmlElement(name = "INSTANCIA")
    protected Instancia instancia;
    @XmlElement(nillable = true)
    protected List<Tiend> tiendas;
    @XmlElement(nillable = true)
    protected List<Procesos> permNot;
    protected TaxableGroup defaultTax;
    @XmlElement(name = "id_country")
    protected int idCountry;
    @XmlElement(name = "id_ext")
    protected int idExt;
    @XmlElement(name = "ty_ro_prty")
    protected String tyRoPrty;
    protected PartyAddress direccion;
    @XmlElement(name = "DUE\u00d1O_PRTY_PRS")
    protected String dueñoprtyprs;
    @XmlElement(name = "DUE\u00d1O_FN_PRS")
    protected String dueñofnprs;
    @XmlElement(name = "DUE\u00d1O_LN_PRS")
    protected String dueñolnprs;
    @XmlElement(name = "DUE\u00d1O_NM_PRS_SFX")
    protected String dueñonmprssfx;
    @XmlElement(name = "FL_EXT")
    protected String flext;

    /**
     * Obtiene el valor de la propiedad oper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOper() {
        return oper;
    }

    /**
     * Define el valor de la propiedad oper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOper(String value) {
        this.oper = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     */
    public void setResultado(int value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoMsg() {
        return resultadoMsg;
    }

    /**
     * Define el valor de la propiedad resultadoMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoMsg(String value) {
        this.resultadoMsg = value;
    }

    /**
     * Obtiene el valor de la propiedad idOpr.
     * 
     */
    public int getIdOpr() {
        return idOpr;
    }

    /**
     * Define el valor de la propiedad idOpr.
     * 
     */
    public void setIdOpr(int value) {
        this.idOpr = value;
    }

    /**
     * Obtiene el valor de la propiedad idRol.
     * 
     */
    public int getIdRol() {
        return idRol;
    }

    /**
     * Define el valor de la propiedad idRol.
     * 
     */
    public void setIdRol(int value) {
        this.idRol = value;
    }

    /**
     * Obtiene el valor de la propiedad nmOper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmOper() {
        return nmOper;
    }

    /**
     * Define el valor de la propiedad nmOper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmOper(String value) {
        this.nmOper = value;
    }

    /**
     * Obtiene el valor de la propiedad tsTmStr.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTsTmStr() {
        return tsTmStr;
    }

    /**
     * Define el valor de la propiedad tsTmStr.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTsTmStr(XMLGregorianCalendar value) {
        this.tsTmStr = value;
    }

    /**
     * Obtiene el valor de la propiedad dcDyBsn.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDcDyBsn() {
        return dcDyBsn;
    }

    /**
     * Define el valor de la propiedad dcDyBsn.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDcDyBsn(XMLGregorianCalendar value) {
        this.dcDyBsn = value;
    }

    /**
     * Obtiene el valor de la propiedad aiTrn.
     * 
     */
    public int getAiTrn() {
        return aiTrn;
    }

    /**
     * Define el valor de la propiedad aiTrn.
     * 
     */
    public void setAiTrn(int value) {
        this.aiTrn = value;
    }

    /**
     * Obtiene el valor de la propiedad idrpstytnd.
     * 
     */
    public int getIDRPSTYTND() {
        return idrpstytnd;
    }

    /**
     * Define el valor de la propiedad idrpstytnd.
     * 
     */
    public void setIDRPSTYTND(int value) {
        this.idrpstytnd = value;
    }

    /**
     * Gets the value of the permisos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permisos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermisos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Permiso }
     * 
     * 
     */
    public List<Permiso> getPermisos() {
        if (permisos == null) {
            permisos = new ArrayList<Permiso>();
        }
        return this.permisos;
    }

    /**
     * Gets the value of the mensajes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mensajes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMensajes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mensajes }
     * 
     * 
     */
    public List<Mensajes> getMensajes() {
        if (mensajes == null) {
            mensajes = new ArrayList<Mensajes>();
        }
        return this.mensajes;
    }

    /**
     * Obtiene el valor de la propiedad nmStrRt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmStrRt() {
        return nmStrRt;
    }

    /**
     * Define el valor de la propiedad nmStrRt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmStrRt(String value) {
        this.nmStrRt = value;
    }

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     */
    public int getIdInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     */
    public void setIdInstancia(int value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad urlServer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlServer() {
        return urlServer;
    }

    /**
     * Define el valor de la propiedad urlServer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlServer(String value) {
        this.urlServer = value;
    }

    /**
     * Obtiene el valor de la propiedad databaseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Define el valor de la propiedad databaseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseName(String value) {
        this.databaseName = value;
    }

    /**
     * Obtiene el valor de la propiedad idLgn.
     * 
     */
    public int getIdLgn() {
        return idLgn;
    }

    /**
     * Define el valor de la propiedad idLgn.
     * 
     */
    public void setIdLgn(int value) {
        this.idLgn = value;
    }

    /**
     * Obtiene el valor de la propiedad nmLgn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmLgn() {
        return nmLgn;
    }

    /**
     * Define el valor de la propiedad nmLgn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmLgn(String value) {
        this.nmLgn = value;
    }

    /**
     * Obtiene el valor de la propiedad idct.
     * 
     */
    public int getIDCT() {
        return idct;
    }

    /**
     * Define el valor de la propiedad idct.
     * 
     */
    public void setIDCT(int value) {
        this.idct = value;
    }

    /**
     * Obtiene el valor de la propiedad idctac.
     * 
     */
    public int getIDCTAC() {
        return idctac;
    }

    /**
     * Define el valor de la propiedad idctac.
     * 
     */
    public void setIDCTAC(int value) {
        this.idctac = value;
    }

    /**
     * Obtiene el valor de la propiedad fVence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFVence() {
        return fVence;
    }

    /**
     * Define el valor de la propiedad fVence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFVence(String value) {
        this.fVence = value;
    }

    /**
     * Obtiene el valor de la propiedad instancia.
     * 
     * @return
     *     possible object is
     *     {@link Instancia }
     *     
     */
    public Instancia getINSTANCIA() {
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
    public void setINSTANCIA(Instancia value) {
        this.instancia = value;
    }

    /**
     * Gets the value of the tiendas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiendas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiendas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tiend }
     * 
     * 
     */
    public List<Tiend> getTiendas() {
        if (tiendas == null) {
            tiendas = new ArrayList<Tiend>();
        }
        return this.tiendas;
    }

    /**
     * Gets the value of the permNot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permNot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermNot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Procesos }
     * 
     * 
     */
    public List<Procesos> getPermNot() {
        if (permNot == null) {
            permNot = new ArrayList<Procesos>();
        }
        return this.permNot;
    }

    /**
     * Obtiene el valor de la propiedad defaultTax.
     * 
     * @return
     *     possible object is
     *     {@link TaxableGroup }
     *     
     */
    public TaxableGroup getDefaultTax() {
        return defaultTax;
    }

    /**
     * Define el valor de la propiedad defaultTax.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableGroup }
     *     
     */
    public void setDefaultTax(TaxableGroup value) {
        this.defaultTax = value;
    }

    /**
     * Obtiene el valor de la propiedad idCountry.
     * 
     */
    public int getIdCountry() {
        return idCountry;
    }

    /**
     * Define el valor de la propiedad idCountry.
     * 
     */
    public void setIdCountry(int value) {
        this.idCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad idExt.
     * 
     */
    public int getIdExt() {
        return idExt;
    }

    /**
     * Define el valor de la propiedad idExt.
     * 
     */
    public void setIdExt(int value) {
        this.idExt = value;
    }

    /**
     * Obtiene el valor de la propiedad tyRoPrty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyRoPrty() {
        return tyRoPrty;
    }

    /**
     * Define el valor de la propiedad tyRoPrty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyRoPrty(String value) {
        this.tyRoPrty = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link PartyAddress }
     *     
     */
    public PartyAddress getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAddress }
     *     
     */
    public void setDireccion(PartyAddress value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad dueñoprtyprs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUEÑOPRTYPRS() {
        return dueñoprtyprs;
    }

    /**
     * Define el valor de la propiedad dueñoprtyprs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUEÑOPRTYPRS(String value) {
        this.dueñoprtyprs = value;
    }

    /**
     * Obtiene el valor de la propiedad dueñofnprs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUEÑOFNPRS() {
        return dueñofnprs;
    }

    /**
     * Define el valor de la propiedad dueñofnprs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUEÑOFNPRS(String value) {
        this.dueñofnprs = value;
    }

    /**
     * Obtiene el valor de la propiedad dueñolnprs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUEÑOLNPRS() {
        return dueñolnprs;
    }

    /**
     * Define el valor de la propiedad dueñolnprs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUEÑOLNPRS(String value) {
        this.dueñolnprs = value;
    }

    /**
     * Obtiene el valor de la propiedad dueñonmprssfx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUEÑONMPRSSFX() {
        return dueñonmprssfx;
    }

    /**
     * Define el valor de la propiedad dueñonmprssfx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUEÑONMPRSSFX(String value) {
        this.dueñonmprssfx = value;
    }

    /**
     * Obtiene el valor de la propiedad flext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLEXT() {
        return flext;
    }

    /**
     * Define el valor de la propiedad flext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLEXT(String value) {
        this.flext = value;
    }

}
