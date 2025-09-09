
package ucm.tfg.agency.soapclient.gatewayagency;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchFlightHotel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchFlightHotel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parmaSearchAirlineHotel" type="{http://soap/}searchAirlineHotelRequestSOAP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchFlightHotel", propOrder = {
    "parmaSearchAirlineHotel"
})
public class SearchFlightHotel {

    protected SearchAirlineHotelRequestSOAP parmaSearchAirlineHotel;

    /**
     * Gets the value of the parmaSearchAirlineHotel property.
     * 
     * @return
     *     possible object is
     *     {@link SearchAirlineHotelRequestSOAP }
     *     
     */
    public SearchAirlineHotelRequestSOAP getParmaSearchAirlineHotel() {
        return parmaSearchAirlineHotel;
    }

    /**
     * Sets the value of the parmaSearchAirlineHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAirlineHotelRequestSOAP }
     *     
     */
    public void setParmaSearchAirlineHotel(SearchAirlineHotelRequestSOAP value) {
        this.parmaSearchAirlineHotel = value;
    }

}
