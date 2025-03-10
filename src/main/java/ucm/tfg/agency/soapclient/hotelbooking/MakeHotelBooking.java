
package ucm.tfg.agency.soapclient.hotelbooking;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for makeHotelBooking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="makeHotelBooking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="booking" type="{http://soap/}makeBookingReservationDTO" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeHotelBooking", propOrder = {
    "booking",
    "user",
    "dni"
})
public class MakeHotelBooking {

    protected MakeBookingReservationDTO booking;
    protected long user;
    protected String dni;

    /**
     * Gets the value of the booking property.
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
     * Sets the value of the booking property.
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
     * Gets the value of the user property.
     * 
     */
    public long getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     */
    public void setUser(long value) {
        this.user = value;
    }

    /**
     * Gets the value of the dni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDni() {
        return dni;
    }

    /**
     * Sets the value of the dni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDni(String value) {
        this.dni = value;
    }

}
