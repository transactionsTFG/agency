
package ucm.tfg.agency.soapclient.gatewayagency;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para makeFlightHotelReservation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="makeFlightHotelReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="booking" type="{http://soap/}makeBookingReservationDTO" minOccurs="0"/&gt;
 *         &lt;element name="reservation" type="{http://soap/}makeFlightReservationSOAP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeFlightHotelReservation", propOrder = {
    "booking",
    "reservation"
})
public class MakeFlightHotelReservation {

    protected MakeBookingReservationDTO booking;
    protected MakeFlightReservationSOAP reservation;

    /**
     * Obtiene el valor de la propiedad booking.
     * 
     * @return
     *     possible object is
     *     {@link MakeBookingReservationDTO }
     *     
     */
    public MakeBookingReservationDTO getBooking() {
        return booking;
    }

    /**
     * Define el valor de la propiedad booking.
     * 
     * @param value
     *     allowed object is
     *     {@link MakeBookingReservationDTO }
     *     
     */
    public void setBooking(MakeBookingReservationDTO value) {
        this.booking = value;
    }

    /**
     * Obtiene el valor de la propiedad reservation.
     * 
     * @return
     *     possible object is
     *     {@link MakeFlightReservationSOAP }
     *     
     */
    public MakeFlightReservationSOAP getReservation() {
        return reservation;
    }

    /**
     * Define el valor de la propiedad reservation.
     * 
     * @param value
     *     allowed object is
     *     {@link MakeFlightReservationSOAP }
     *     
     */
    public void setReservation(MakeFlightReservationSOAP value) {
        this.reservation = value;
    }

}
