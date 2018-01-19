
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para formatos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="formatos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_FORMATO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_MODELO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_PROCESO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_VERSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RESULTADO_XML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID_USER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_OPR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anexos" type="{http://Webmet.core/}anexosCuestionario" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="respuestas" type="{http://Webmet.core/}respuesta" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modelo" type="{http://Webmet.core/}modelo" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://Webmet.core/}operator" minOccurs="0"/>
 *         &lt;element name="operatorC" type="{http://Webmet.core/}operator" minOccurs="0"/>
 *         &lt;element name="FILE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COPIAS_TOTALES" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="F_INGRESO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formE" type="{http://Webmet.core/}formatoEstado" minOccurs="0"/>
 *         &lt;element name="OP_SENSIBLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formatos", propOrder = {
    "idformato",
    "idmodelo",
    "idproceso",
    "idversion",
    "resultadoxml",
    "idct",
    "iduser",
    "tyopr",
    "anexos",
    "respuestas",
    "modelo",
    "operator",
    "operatorC",
    "filename",
    "copiastotales",
    "fingreso",
    "formE",
    "opsensible",
    "nmEstado"
})
public class Formatos {

    @XmlElement(name = "ID_FORMATO")
    protected int idformato;
    @XmlElement(name = "ID_MODELO")
    protected int idmodelo;
    @XmlElement(name = "ID_PROCESO")
    protected int idproceso;
    @XmlElement(name = "ID_VERSION")
    protected int idversion;
    @XmlElement(name = "RESULTADO_XML")
    protected String resultadoxml;
    @XmlElement(name = "ID_CT")
    protected int idct;
    @XmlElement(name = "ID_USER")
    protected int iduser;
    @XmlElement(name = "TY_OPR")
    protected String tyopr;
    @XmlElement(nillable = true)
    protected List<AnexosCuestionario> anexos;
    @XmlElement(nillable = true)
    protected List<Respuesta> respuestas;
    protected Modelo modelo;
    protected Operator operator;
    protected Operator operatorC;
    @XmlElement(name = "FILE_NAME")
    protected String filename;
    @XmlElement(name = "COPIAS_TOTALES")
    protected int copiastotales;
    @XmlElement(name = "F_INGRESO")
    protected String fingreso;
    protected FormatoEstado formE;
    @XmlElement(name = "OP_SENSIBLE")
    protected String opsensible;
    protected String nmEstado;

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

    /**
     * Obtiene el valor de la propiedad idversion.
     * 
     */
    public int getIDVERSION() {
        return idversion;
    }

    /**
     * Define el valor de la propiedad idversion.
     * 
     */
    public void setIDVERSION(int value) {
        this.idversion = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoxml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESULTADOXML() {
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
    public void setRESULTADOXML(String value) {
        this.resultadoxml = value;
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
     * Obtiene el valor de la propiedad tyopr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYOPR() {
        return tyopr;
    }

    /**
     * Define el valor de la propiedad tyopr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYOPR(String value) {
        this.tyopr = value;
    }

    /**
     * Gets the value of the anexos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anexos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnexos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnexosCuestionario }
     * 
     * 
     */
    public List<AnexosCuestionario> getAnexos() {
        if (anexos == null) {
            anexos = new ArrayList<AnexosCuestionario>();
        }
        return this.anexos;
    }

    /**
     * Gets the value of the respuestas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respuestas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespuestas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Respuesta }
     * 
     * 
     */
    public List<Respuesta> getRespuestas() {
        if (respuestas == null) {
            respuestas = new ArrayList<Respuesta>();
        }
        return this.respuestas;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link Modelo }
     *     
     */
    public Modelo getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link Modelo }
     *     
     */
    public void setModelo(Modelo value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad operator.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Define el valor de la propiedad operator.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorC.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperatorC() {
        return operatorC;
    }

    /**
     * Define el valor de la propiedad operatorC.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperatorC(Operator value) {
        this.operatorC = value;
    }

    /**
     * Obtiene el valor de la propiedad filename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILENAME() {
        return filename;
    }

    /**
     * Define el valor de la propiedad filename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILENAME(String value) {
        this.filename = value;
    }

    /**
     * Obtiene el valor de la propiedad copiastotales.
     * 
     */
    public int getCOPIASTOTALES() {
        return copiastotales;
    }

    /**
     * Define el valor de la propiedad copiastotales.
     * 
     */
    public void setCOPIASTOTALES(int value) {
        this.copiastotales = value;
    }

    /**
     * Obtiene el valor de la propiedad fingreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINGRESO() {
        return fingreso;
    }

    /**
     * Define el valor de la propiedad fingreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINGRESO(String value) {
        this.fingreso = value;
    }

    /**
     * Obtiene el valor de la propiedad formE.
     * 
     * @return
     *     possible object is
     *     {@link FormatoEstado }
     *     
     */
    public FormatoEstado getFormE() {
        return formE;
    }

    /**
     * Define el valor de la propiedad formE.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatoEstado }
     *     
     */
    public void setFormE(FormatoEstado value) {
        this.formE = value;
    }

    /**
     * Obtiene el valor de la propiedad opsensible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPSENSIBLE() {
        return opsensible;
    }

    /**
     * Define el valor de la propiedad opsensible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPSENSIBLE(String value) {
        this.opsensible = value;
    }

    /**
     * Obtiene el valor de la propiedad nmEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmEstado() {
        return nmEstado;
    }

    /**
     * Define el valor de la propiedad nmEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmEstado(String value) {
        this.nmEstado = value;
    }

}
