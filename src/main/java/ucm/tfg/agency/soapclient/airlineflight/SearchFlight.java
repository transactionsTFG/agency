
package ucm.tfg.agency.soapclient.airlineflight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchFlight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramSearchFlight" type="{http://soap/}paramSearchFlightSOAP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchFlight", propOrder = {
    "paramSearchFlight"
})
public class SearchFlight {

    protected ParamSearchFlightSOAP paramSearchFlight;

    /**
     * Gets the value of the paramSearchFlight property.
     * 
     * @return
     *     possible object is
     *     {@link ParamSearchFlightSOAP }
     *     
     */
    public ParamSearchFlightSOAP getParamSearchFlight() {
        return paramSearchFlight;
    }

    /**
     * Sets the value of the paramSearchFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamSearchFlightSOAP }
     *     
     */
    public void setParamSearchFlight(ParamSearchFlightSOAP value) {
        this.paramSearchFlight = value;
    }

}
