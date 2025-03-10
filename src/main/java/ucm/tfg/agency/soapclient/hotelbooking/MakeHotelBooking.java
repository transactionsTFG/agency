
package ucm.tfg.agency.soapclient.hotelbooking;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para makeHotelBooking complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad user.
     * 
     */
    public long getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     */
    public void setUser(long value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad dni.
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
     * Define el valor de la propiedad dni.
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
