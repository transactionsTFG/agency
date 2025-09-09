
package ucm.tfg.agency.soapclient.gatewayagency;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hotelFlightReservationDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hotelFlightReservationDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="booking" type="{http://soap/}bookingDTO" minOccurs="0"/&gt;
 *         &lt;element name="reservation" type="{http://soap/}reservationDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotelFlightReservationDTO", propOrder = {
    "booking",
    "reservation"
})
public class HotelFlightReservationDTO {

    protected BookingDTO booking;
    protected ReservationDTO reservation;

    /**
     * Gets the value of the booking property.
     * 
     * @return
     *     possible object is
     *     {@link BookingDTO }
     *     
     */
    public BookingDTO getBooking() {
        return booking;
    }

    /**
     * Sets the value of the booking property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingDTO }
     *     
     */
    public void setBooking(BookingDTO value) {
        this.booking = value;
    }

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationDTO }
     *     
     */
    public ReservationDTO getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationDTO }
     *     
     */
    public void setReservation(ReservationDTO value) {
        this.reservation = value;
    }

}
