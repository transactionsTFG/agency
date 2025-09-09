
package ucm.tfg.agency.soapclient.gatewayagency;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchTravel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the paramSearchTravel property.
     * 
     */
    public long getParamSearchTravel() {
        return paramSearchTravel;
    }

    /**
     * Sets the value of the paramSearchTravel property.
     * 
     */
    public void setParamSearchTravel(long value) {
        this.paramSearchTravel = value;
    }

}
