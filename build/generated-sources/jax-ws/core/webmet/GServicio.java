
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para gServicio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="gServicio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_ITM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TY_ITM_GYM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TIEMPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIN_PERSONAS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MAX_PERSONAS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TODO_INCLUIDO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ZONA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIMITACION_DIAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIAS_TOTALES" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DIAS_PERMITIDOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIMITACION_HORARIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HORAS_TOTALES" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HORAS_X_DIA_MAX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HORA_INI1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HORA_FIN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HORA_INI2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HORA_FIN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERSONAS_ADICIONALES" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zona" type="{http://Webmet.core/}zona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gServicio", propOrder = {
    "iditm",
    "tyitmgym",
    "tiempo",
    "minpersonas",
    "maxpersonas",
    "todoincluido",
    "idzona",
    "estatus",
    "limitaciondias",
    "diastotales",
    "diaspermitidos",
    "limitacionhorario",
    "horastotales",
    "horasxdiamax",
    "horaini1",
    "horafin1",
    "horaini2",
    "horafin2",
    "personasadicionales",
    "zona"
})
public class GServicio {

    @XmlElement(name = "ID_ITM")
    protected int iditm;
    @XmlElement(name = "TY_ITM_GYM")
    protected String tyitmgym;
    @XmlElement(name = "TIEMPO")
    protected String tiempo;
    @XmlElement(name = "MIN_PERSONAS")
    protected int minpersonas;
    @XmlElement(name = "MAX_PERSONAS")
    protected int maxpersonas;
    @XmlElement(name = "TODO_INCLUIDO")
    protected String todoincluido;
    @XmlElement(name = "ID_ZONA")
    protected int idzona;
    @XmlElement(name = "ESTATUS")
    protected String estatus;
    @XmlElement(name = "LIMITACION_DIAS")
    protected String limitaciondias;
    @XmlElement(name = "DIAS_TOTALES")
    protected int diastotales;
    @XmlElement(name = "DIAS_PERMITIDOS")
    protected String diaspermitidos;
    @XmlElement(name = "LIMITACION_HORARIO")
    protected String limitacionhorario;
    @XmlElement(name = "HORAS_TOTALES")
    protected int horastotales;
    @XmlElement(name = "HORAS_X_DIA_MAX")
    protected int horasxdiamax;
    @XmlElement(name = "HORA_INI1")
    protected String horaini1;
    @XmlElement(name = "HORA_FIN1")
    protected String horafin1;
    @XmlElement(name = "HORA_INI2")
    protected String horaini2;
    @XmlElement(name = "HORA_FIN2")
    protected String horafin2;
    @XmlElement(name = "PERSONAS_ADICIONALES")
    protected int personasadicionales;
    protected Zona zona;

    /**
     * Obtiene el valor de la propiedad iditm.
     * 
     */
    public int getIDITM() {
        return iditm;
    }

    /**
     * Define el valor de la propiedad iditm.
     * 
     */
    public void setIDITM(int value) {
        this.iditm = value;
    }

    /**
     * Obtiene el valor de la propiedad tyitmgym.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYITMGYM() {
        return tyitmgym;
    }

    /**
     * Define el valor de la propiedad tyitmgym.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYITMGYM(String value) {
        this.tyitmgym = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIEMPO() {
        return tiempo;
    }

    /**
     * Define el valor de la propiedad tiempo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIEMPO(String value) {
        this.tiempo = value;
    }

    /**
     * Obtiene el valor de la propiedad minpersonas.
     * 
     */
    public int getMINPERSONAS() {
        return minpersonas;
    }

    /**
     * Define el valor de la propiedad minpersonas.
     * 
     */
    public void setMINPERSONAS(int value) {
        this.minpersonas = value;
    }

    /**
     * Obtiene el valor de la propiedad maxpersonas.
     * 
     */
    public int getMAXPERSONAS() {
        return maxpersonas;
    }

    /**
     * Define el valor de la propiedad maxpersonas.
     * 
     */
    public void setMAXPERSONAS(int value) {
        this.maxpersonas = value;
    }

    /**
     * Obtiene el valor de la propiedad todoincluido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTODOINCLUIDO() {
        return todoincluido;
    }

    /**
     * Define el valor de la propiedad todoincluido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTODOINCLUIDO(String value) {
        this.todoincluido = value;
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
     * Obtiene el valor de la propiedad estatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTATUS() {
        return estatus;
    }

    /**
     * Define el valor de la propiedad estatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTATUS(String value) {
        this.estatus = value;
    }

    /**
     * Obtiene el valor de la propiedad limitaciondias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIMITACIONDIAS() {
        return limitaciondias;
    }

    /**
     * Define el valor de la propiedad limitaciondias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIMITACIONDIAS(String value) {
        this.limitaciondias = value;
    }

    /**
     * Obtiene el valor de la propiedad diastotales.
     * 
     */
    public int getDIASTOTALES() {
        return diastotales;
    }

    /**
     * Define el valor de la propiedad diastotales.
     * 
     */
    public void setDIASTOTALES(int value) {
        this.diastotales = value;
    }

    /**
     * Obtiene el valor de la propiedad diaspermitidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIASPERMITIDOS() {
        return diaspermitidos;
    }

    /**
     * Define el valor de la propiedad diaspermitidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIASPERMITIDOS(String value) {
        this.diaspermitidos = value;
    }

    /**
     * Obtiene el valor de la propiedad limitacionhorario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIMITACIONHORARIO() {
        return limitacionhorario;
    }

    /**
     * Define el valor de la propiedad limitacionhorario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIMITACIONHORARIO(String value) {
        this.limitacionhorario = value;
    }

    /**
     * Obtiene el valor de la propiedad horastotales.
     * 
     */
    public int getHORASTOTALES() {
        return horastotales;
    }

    /**
     * Define el valor de la propiedad horastotales.
     * 
     */
    public void setHORASTOTALES(int value) {
        this.horastotales = value;
    }

    /**
     * Obtiene el valor de la propiedad horasxdiamax.
     * 
     */
    public int getHORASXDIAMAX() {
        return horasxdiamax;
    }

    /**
     * Define el valor de la propiedad horasxdiamax.
     * 
     */
    public void setHORASXDIAMAX(int value) {
        this.horasxdiamax = value;
    }

    /**
     * Obtiene el valor de la propiedad horaini1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHORAINI1() {
        return horaini1;
    }

    /**
     * Define el valor de la propiedad horaini1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHORAINI1(String value) {
        this.horaini1 = value;
    }

    /**
     * Obtiene el valor de la propiedad horafin1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHORAFIN1() {
        return horafin1;
    }

    /**
     * Define el valor de la propiedad horafin1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHORAFIN1(String value) {
        this.horafin1 = value;
    }

    /**
     * Obtiene el valor de la propiedad horaini2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHORAINI2() {
        return horaini2;
    }

    /**
     * Define el valor de la propiedad horaini2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHORAINI2(String value) {
        this.horaini2 = value;
    }

    /**
     * Obtiene el valor de la propiedad horafin2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHORAFIN2() {
        return horafin2;
    }

    /**
     * Define el valor de la propiedad horafin2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHORAFIN2(String value) {
        this.horafin2 = value;
    }

    /**
     * Obtiene el valor de la propiedad personasadicionales.
     * 
     */
    public int getPERSONASADICIONALES() {
        return personasadicionales;
    }

    /**
     * Define el valor de la propiedad personasadicionales.
     * 
     */
    public void setPERSONASADICIONALES(int value) {
        this.personasadicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad zona.
     * 
     * @return
     *     possible object is
     *     {@link Zona }
     *     
     */
    public Zona getZona() {
        return zona;
    }

    /**
     * Define el valor de la propiedad zona.
     * 
     * @param value
     *     allowed object is
     *     {@link Zona }
     *     
     */
    public void setZona(Zona value) {
        this.zona = value;
    }

}
