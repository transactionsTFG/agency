
package ucm.tfg.agency.soapclient.airlinereservation;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para makeFlightReservation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="makeFlightReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reservation" type="{http://soap/}makeFlightReservationSOAP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeFlightReservation", propOrder = {
    "reservation"
})
public class MakeFlightReservation {

    protected MakeFlightReservationSOAP reservation;

    /**
     * Obtiene el valor de la propiedad reservation.
     * 
     * @return
     *     possible object is
     *     {@link MakeFlightReservationSOAP }
     *     
     */
    public MakeFlightReservationSOAP getReservation() {
        return reservation;
    }

    /**
     * Define el valor de la propiedad reservation.
     * 
     * @param value
     *     allowed object is
     *     {@link MakeFlightReservationSOAP }
     *     
     */
    public void setReservation(MakeFlightReservationSOAP value) {
        this.reservation = value;
    }

}
