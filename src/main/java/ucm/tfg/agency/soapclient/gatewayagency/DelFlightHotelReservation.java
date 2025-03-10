
package ucm.tfg.agency.soapclient.gatewayagency;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para delFlightHotelReservation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="delFlightHotelReservation"&gt;
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
@XmlType(name = "delFlightHotelReservation", propOrder = {
    "hotelBookingId",
    "flightReservationId"
})
public class DelFlightHotelReservation {

    protected long hotelBookingId;
    protected long flightReservationId;

    /**
     * Obtiene el valor de la propiedad hotelBookingId.
     * 
     */
    public long getHotelBookingId() {
        return hotelBookingId;
    }

    /**
     * Define el valor de la propiedad hotelBookingId.
     * 
     */
    public void setHotelBookingId(long value) {
        this.hotelBookingId = value;
    }

    /**
     * Obtiene el valor de la propiedad flightReservationId.
     * 
     */
    public long getFlightReservationId() {
        return flightReservationId;
    }

    /**
     * Define el valor de la propiedad flightReservationId.
     * 
     */
    public void setFlightReservationId(long value) {
        this.flightReservationId = value;
    }

}
