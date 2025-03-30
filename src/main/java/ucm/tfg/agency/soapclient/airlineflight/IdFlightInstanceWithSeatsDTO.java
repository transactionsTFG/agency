
package ucm.tfg.agency.soapclient.airlineflight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
<<<<<<< HEAD
 * <p>Java class for idFlightInstanceWithSeatsDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
=======
 * <p>Clase Java para idFlightInstanceWithSeatsDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
 * 
 * <pre>
 * &lt;complexType name="idFlightInstanceWithSeatsDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idFlightInstance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idFlightInstanceWithSeatsDTO", propOrder = {
    "idFlightInstance",
    "seats"
})
public class IdFlightInstanceWithSeatsDTO {

    protected long idFlightInstance;
    protected int seats;

    /**
<<<<<<< HEAD
     * Gets the value of the idFlightInstance property.
=======
     * Obtiene el valor de la propiedad idFlightInstance.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public long getIdFlightInstance() {
        return idFlightInstance;
    }

    /**
<<<<<<< HEAD
     * Sets the value of the idFlightInstance property.
=======
     * Define el valor de la propiedad idFlightInstance.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public void setIdFlightInstance(long value) {
        this.idFlightInstance = value;
    }

    /**
<<<<<<< HEAD
     * Gets the value of the seats property.
=======
     * Obtiene el valor de la propiedad seats.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public int getSeats() {
        return seats;
    }

    /**
<<<<<<< HEAD
     * Sets the value of the seats property.
=======
     * Define el valor de la propiedad seats.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public void setSeats(int value) {
        this.seats = value;
    }

}
