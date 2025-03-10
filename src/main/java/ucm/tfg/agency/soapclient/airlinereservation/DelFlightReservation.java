
package ucm.tfg.agency.soapclient.airlinereservation;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para delFlightReservation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="delFlightReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idReservationAirline" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delFlightReservation", propOrder = {
    "idReservationAirline"
})
public class DelFlightReservation {

    protected long idReservationAirline;

    /**
     * Obtiene el valor de la propiedad idReservationAirline.
     * 
     */
    public long getIdReservationAirline() {
        return idReservationAirline;
    }

    /**
     * Define el valor de la propiedad idReservationAirline.
     * 
     */
    public void setIdReservationAirline(long value) {
        this.idReservationAirline = value;
    }

}
