
package ucm.tfg.agency.soapclient.gatewayagency;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFlightHotelReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFlightHotelReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hotelBookingId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="flightReservationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightHotelReservation", propOrder = {
    "hotelBookingId",
    "flightReservationId"
})
public class GetFlightHotelReservation {

    protected long hotelBookingId;
    protected long flightReservationId;

    /**
     * Gets the value of the hotelBookingId property.
     * 
     */
    public long getHotelBookingId() {
        return hotelBookingId;
    }

    /**
     * Sets the value of the hotelBookingId property.
     * 
     */
    public void setHotelBookingId(long value) {
        this.hotelBookingId = value;
    }

    /**
     * Gets the value of the flightReservationId property.
     * 
     */
    public long getFlightReservationId() {
        return flightReservationId;
    }

    /**
     * Sets the value of the flightReservationId property.
     * 
     */
    public void setFlightReservationId(long value) {
        this.flightReservationId = value;
    }

}
