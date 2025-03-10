
package ucm.tfg.agency.soapclient.gatewayagency;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modFlightHotelReservation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modFlightHotelReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="booking" type="{http://soap/}modifyBookingReservationDTO" minOccurs="0"/&gt;
 *         &lt;element name="reservation" type="{http://soap/}modifyFlightReservationRequestionSOAP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modFlightHotelReservation", propOrder = {
    "booking",
    "reservation"
})
public class ModFlightHotelReservation {

    protected ModifyBookingReservationDTO booking;
    protected ModifyFlightReservationRequestionSOAP reservation;

    /**
     * Obtiene el valor de la propiedad booking.
     * 
     * @return
     *     possible object is
     *     {@link ModifyBookingReservationDTO }
     *     
     */
    public ModifyBookingReservationDTO getBooking() {
        return booking;
    }

    /**
     * Define el valor de la propiedad booking.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyBookingReservationDTO }
     *     
     */
    public void setBooking(ModifyBookingReservationDTO value) {
        this.booking = value;
    }

    /**
     * Obtiene el valor de la propiedad reservation.
     * 
     * @return
     *     possible object is
     *     {@link ModifyFlightReservationRequestionSOAP }
     *     
     */
    public ModifyFlightReservationRequestionSOAP getReservation() {
        return reservation;
    }

    /**
     * Define el valor de la propiedad reservation.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyFlightReservationRequestionSOAP }
     *     
     */
    public void setReservation(ModifyFlightReservationRequestionSOAP value) {
        this.reservation = value;
    }

}
