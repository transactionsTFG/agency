
package ucm.tfg.agency.soapclient.airlinereservation;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchFlightReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchFlightReservation"&gt;
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
@XmlType(name = "searchFlightReservation", propOrder = {
    "idReservationAirline"
})
public class SearchFlightReservation {

    protected long idReservationAirline;

    /**
     * Gets the value of the idReservationAirline property.
     * 
     */
    public long getIdReservationAirline() {
        return idReservationAirline;
    }

    /**
     * Sets the value of the idReservationAirline property.
     * 
     */
    public void setIdReservationAirline(long value) {
        this.idReservationAirline = value;
    }

}
