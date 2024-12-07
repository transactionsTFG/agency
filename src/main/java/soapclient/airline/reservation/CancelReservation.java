
package soapclient.airline.reservation;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cancelReservation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cancelReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idFlight" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idFlightInstance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelReservation", propOrder = {
    "idFlight",
    "idFlightInstance"
})
public class CancelReservation {

    protected long idFlight;
    protected long idFlightInstance;

    /**
     * Obtiene el valor de la propiedad idFlight.
     * 
     */
    public long getIdFlight() {
        return idFlight;
    }

    /**
     * Define el valor de la propiedad idFlight.
     * 
     */
    public void setIdFlight(long value) {
        this.idFlight = value;
    }

    /**
     * Obtiene el valor de la propiedad idFlightInstance.
     * 
     */
    public long getIdFlightInstance() {
        return idFlightInstance;
    }

    /**
     * Define el valor de la propiedad idFlightInstance.
     * 
     */
    public void setIdFlightInstance(long value) {
        this.idFlightInstance = value;
    }

}
