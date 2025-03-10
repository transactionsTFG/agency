
package ucm.tfg.agency.soapclient.gatewayagency;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchTravel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchTravel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramSearchTravel" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchTravel", propOrder = {
    "paramSearchTravel"
})
public class SearchTravel {

    protected long paramSearchTravel;

    /**
     * Obtiene el valor de la propiedad paramSearchTravel.
     * 
     */
    public long getParamSearchTravel() {
        return paramSearchTravel;
    }

    /**
     * Define el valor de la propiedad paramSearchTravel.
     * 
     */
    public void setParamSearchTravel(long value) {
        this.paramSearchTravel = value;
    }

}
