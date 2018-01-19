
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getRepExplosionMateriales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getRepExplosionMateriales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_Instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IDCANTIDAD" type="{http://Webmet.core/}repExplosionMaterialesDTO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRepExplosionMateriales", propOrder = {
    "idInstancia",
    "idcantidad"
})
public class GetRepExplosionMateriales {

    @XmlElement(name = "ID_Instancia")
    protected int idInstancia;
    @XmlElement(name = "IDCANTIDAD", required = true)
    protected List<RepExplosionMaterialesDTO> idcantidad;

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
     * Gets the value of the idcantidad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idcantidad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDCANTIDAD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepExplosionMaterialesDTO }
     * 
     * 
     */
    public List<RepExplosionMaterialesDTO> getIDCANTIDAD() {
        if (idcantidad == null) {
            idcantidad = new ArrayList<RepExplosionMaterialesDTO>();
        }
        return this.idcantidad;
    }

}
