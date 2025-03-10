
package ucm.tfg.agency.soapclient.hotelbooking;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyHotelBooking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyHotelBooking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="booking" type="{http://soap/}modifyBookingReservationDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyHotelBooking", propOrder = {
    "booking"
})
public class ModifyHotelBooking {

    protected ModifyBookingReservationDTO booking;

    /**
     * Gets the value of the booking property.
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
     * Sets the value of the booking property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyBookingReservationDTO }
     *     
     */
    public void setBooking(ModifyBookingReservationDTO value) {
        this.booking = value;
    }

}
