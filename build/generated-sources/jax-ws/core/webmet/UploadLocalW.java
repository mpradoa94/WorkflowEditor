
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Upload_LocalW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Upload_LocalW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indata" type="{http://Webmet.core/}uploadIndata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Upload_LocalW", propOrder = {
    "indata"
})
public class UploadLocalW {

    protected UploadIndata indata;

    /**
     * Obtiene el valor de la propiedad indata.
     * 
     * @return
     *     possible object is
     *     {@link UploadIndata }
     *     
     */
    public UploadIndata getIndata() {
        return indata;
    }

    /**
     * Define el valor de la propiedad indata.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadIndata }
     *     
     */
    public void setIndata(UploadIndata value) {
        this.indata = value;
    }

}
