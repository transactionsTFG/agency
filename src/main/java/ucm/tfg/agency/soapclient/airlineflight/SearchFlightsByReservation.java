
package ucm.tfg.agency.soapclient.airlineflight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchFlightsByReservation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchFlightsByReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reservationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchFlightsByReservation", propOrder = {
    "reservationId"
})
public class SearchFlightsByReservation {

    protected long reservationId;

    /**
     * Obtiene el valor de la propiedad reservationId.
     * 
     */
    public long getReservationId() {
        return reservationId;
    }

    /**
     * Define el valor de la propiedad reservationId.
     * 
     */
    public void setReservationId(long value) {
        this.reservationId = value;
    }

}
