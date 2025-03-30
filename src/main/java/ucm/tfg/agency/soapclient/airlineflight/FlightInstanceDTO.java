
package ucm.tfg.agency.soapclient.airlineflight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
<<<<<<< HEAD
 * <p>Java class for flightInstanceDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
=======
 * <p>Clase Java para flightInstanceDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
 * 
 * <pre>
 * &lt;complexType name="flightInstanceDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idFlight" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="passengerCounter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="statusFlight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightInstanceDTO", propOrder = {
    "active",
    "arrivalDate",
    "departureDate",
    "id",
    "idFlight",
    "passengerCounter",
    "price",
    "statusFlight"
})
public class FlightInstanceDTO {

    protected boolean active;
    protected Object arrivalDate;
    protected Object departureDate;
    protected long id;
    protected long idFlight;
    protected int passengerCounter;
    protected double price;
    protected String statusFlight;

    /**
<<<<<<< HEAD
     * Gets the value of the active property.
=======
     * Obtiene el valor de la propiedad active.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
<<<<<<< HEAD
     * Sets the value of the active property.
=======
     * Define el valor de la propiedad active.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
<<<<<<< HEAD
     * Gets the value of the arrivalDate property.
=======
     * Obtiene el valor de la propiedad arrivalDate.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getArrivalDate() {
        return arrivalDate;
    }

    /**
<<<<<<< HEAD
     * Sets the value of the arrivalDate property.
=======
     * Define el valor de la propiedad arrivalDate.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setArrivalDate(Object value) {
        this.arrivalDate = value;
    }

    /**
<<<<<<< HEAD
     * Gets the value of the departureDate property.
=======
     * Obtiene el valor de la propiedad departureDate.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDepartureDate() {
        return departureDate;
    }

    /**
<<<<<<< HEAD
     * Sets the value of the departureDate property.
=======
     * Define el valor de la propiedad departureDate.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDepartureDate(Object value) {
        this.departureDate = value;
    }

    /**
<<<<<<< HEAD
     * Gets the value of the id property.
=======
     * Obtiene el valor de la propiedad id.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public long getId() {
        return id;
    }

    /**
<<<<<<< HEAD
     * Sets the value of the id property.
=======
     * Define el valor de la propiedad id.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
<<<<<<< HEAD
     * Gets the value of the idFlight property.
=======
     * Obtiene el valor de la propiedad idFlight.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public long getIdFlight() {
        return idFlight;
    }

    /**
<<<<<<< HEAD
     * Sets the value of the idFlight property.
=======
     * Define el valor de la propiedad idFlight.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public void setIdFlight(long value) {
        this.idFlight = value;
    }

    /**
<<<<<<< HEAD
     * Gets the value of the passengerCounter property.
=======
     * Obtiene el valor de la propiedad passengerCounter.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public int getPassengerCounter() {
        return passengerCounter;
    }

    /**
<<<<<<< HEAD
     * Sets the value of the passengerCounter property.
=======
     * Define el valor de la propiedad passengerCounter.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public void setPassengerCounter(int value) {
        this.passengerCounter = value;
    }

    /**
<<<<<<< HEAD
     * Gets the value of the price property.
=======
     * Obtiene el valor de la propiedad price.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
<<<<<<< HEAD
     * Sets the value of the price property.
=======
     * Define el valor de la propiedad price.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
<<<<<<< HEAD
     * Gets the value of the statusFlight property.
=======
     * Obtiene el valor de la propiedad statusFlight.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusFlight() {
        return statusFlight;
    }

    /**
<<<<<<< HEAD
     * Sets the value of the statusFlight property.
=======
     * Define el valor de la propiedad statusFlight.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusFlight(String value) {
        this.statusFlight = value;
    }

}
