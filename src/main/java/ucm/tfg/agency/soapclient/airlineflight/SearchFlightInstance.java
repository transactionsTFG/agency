
package ucm.tfg.agency.soapclient.airlineflight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchFlightInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the idFlightInstance property.
     * 
     */
    public long getIdFlightInstance() {
        return idFlightInstance;
    }

    /**
     * Sets the value of the idFlightInstance property.
     * 
     */
    public void setIdFlightInstance(long value) {
        this.idFlightInstance = value;
    }

}
