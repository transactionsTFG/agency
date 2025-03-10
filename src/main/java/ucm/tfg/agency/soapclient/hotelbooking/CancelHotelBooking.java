
package ucm.tfg.agency.soapclient.hotelbooking;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cancelHotelBooking complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cancelHotelBooking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelHotelBooking", propOrder = {
    "bookingId"
})
public class CancelHotelBooking {

    protected long bookingId;

    /**
     * Obtiene el valor de la propiedad bookingId.
     * 
     */
    public long getBookingId() {
        return bookingId;
    }

    /**
     * Define el valor de la propiedad bookingId.
     * 
     */
    public void setBookingId(long value) {
        this.bookingId = value;
    }

}
