
package core.webmet;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abcHorarioHabil complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abcHorarioHabil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_instancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="horarioH" type="{http://Webmet.core/}horarioHabil" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abcHorarioHabil", propOrder = {
    "idInstancia",
    "horarioH"
})
public class AbcHorarioHabil {

    @XmlElement(name = "Id_instancia")
    protected int idInstancia;
    @XmlElement(required = true)
    protected List<HorarioHabil> horarioH;

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
     * Gets the value of the horarioH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horarioH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorarioH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HorarioHabil }
     * 
     * 
     */
    public List<HorarioHabil> getHorarioH() {
        if (horarioH == null) {
            horarioH = new ArrayList<HorarioHabil>();
        }
        return this.horarioH;
    }

}
