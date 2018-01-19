
package core.webmet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ALL_WorkstationlistW complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ALL_WorkstationlistW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ALL_WorkstationlistW", propOrder = {
    "inst"
})
public class ALLWorkstationlistW {

    protected int inst;

    /**
     * Obtiene el valor de la propiedad inst.
     * 
     */
    public int getInst() {
        return inst;
    }

    /**
     * Define el valor de la propiedad inst.
     * 
     */
    public void setInst(int value) {
        this.inst = value;
    }

}
