
package ucm.tfg.agency.soapclient.gatewayagency;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchFlightHotel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad parmaSearchAirlineHotel.
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
     * Define el valor de la propiedad parmaSearchAirlineHotel.
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
