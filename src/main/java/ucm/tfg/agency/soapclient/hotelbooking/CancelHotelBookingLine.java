
package ucm.tfg.agency.soapclient.hotelbooking;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cancelHotelBookingLine complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cancelHotelBookingLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="roomId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelHotelBookingLine", propOrder = {
    "bookingId",
    "roomId"
})
public class CancelHotelBookingLine {

    protected long bookingId;
    protected long roomId;

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

    /**
     * Obtiene el valor de la propiedad roomId.
     * 
     */
    public long getRoomId() {
        return roomId;
    }

    /**
     * Define el valor de la propiedad roomId.
     * 
     */
    public void setRoomId(long value) {
        this.roomId = value;
    }

}
