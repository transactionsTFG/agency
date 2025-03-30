
package ucm.tfg.agency.soapclient.airlineflight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchFlightInstance complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchFlightInstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idFlightInstance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchFlightInstance", propOrder = {
    "idFlightInstance"
})
public class SearchFlightInstance {

    protected long idFlightInstance;

    /**
     * Obtiene el valor de la propiedad idFlightInstance.
     * 
     */
    public long getIdFlightInstance() {
        return idFlightInstance;
    }

    /**
     * Define el valor de la propiedad idFlightInstance.
     * 
     */
    public void setIdFlightInstance(long value) {
        this.idFlightInstance = value;
    }

}
