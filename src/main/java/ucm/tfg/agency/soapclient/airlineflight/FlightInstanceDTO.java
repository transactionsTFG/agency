
package ucm.tfg.agency.soapclient.airlineflight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightInstanceDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>Clase Java para flightInstanceDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Gets the value of the active property.
     * Obtiene el valor de la propiedad active.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * Define el valor de la propiedad active.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * Obtiene el valor de la propiedad arrivalDate.
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
     * Sets the value of the arrivalDate property.
     * Define el valor de la propiedad arrivalDate.
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
     * Gets the value of the departureDate property.
     * Obtiene el valor de la propiedad departureDate.
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
     * Sets the value of the departureDate property.
     * Define el valor de la propiedad departureDate.
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
     * Gets the value of the id property.
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the idFlight property.
     * Obtiene el valor de la propiedad idFlight.
     * 
     */
    public long getIdFlight() {
        return idFlight;
    }

    /**
     * Sets the value of the idFlight property.
     * Define el valor de la propiedad idFlight.
     * 
     */
    public void setIdFlight(long value) {
        this.idFlight = value;
    }

    /**
     * Gets the value of the passengerCounter property.
     * Obtiene el valor de la propiedad passengerCounter.
     * 
     */
    public int getPassengerCounter() {
        return passengerCounter;
    }

    /**
     * Sets the value of the passengerCounter property.
     * Define el valor de la propiedad passengerCounter.
     * 
     */
    public void setPassengerCounter(int value) {
        this.passengerCounter = value;
    }

    /**
     * Gets the value of the price property.
     * Obtiene el valor de la propiedad price.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * Define el valor de la propiedad price.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the statusFlight property.
     * Obtiene el valor de la propiedad statusFlight.
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
     * Sets the value of the statusFlight property.
     * Define el valor de la propiedad statusFlight.
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
