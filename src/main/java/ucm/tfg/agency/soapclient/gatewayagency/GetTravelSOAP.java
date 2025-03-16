
package ucm.tfg.agency.soapclient.gatewayagency;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getTravelSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getTravelSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerCounter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightReservationID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="hotelReservationID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="flightCost" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="hotelCost" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTravelSOAP", propOrder = {
    "id",
    "userId",
    "date",
    "returnDate",
    "passengerCounter",
    "cost",
    "status",
    "flightReservationID",
    "hotelReservationID",
    "flightCost",
    "hotelCost",
    "active",
    "dateCreation"
})
public class GetTravelSOAP {

    protected long id;
    protected long userId;
    protected String date;
    protected String returnDate;
    protected int passengerCounter;
    protected double cost;
    protected String status;
    protected long flightReservationID;
    protected long hotelReservationID;
    protected double flightCost;
    protected double hotelCost;
    protected boolean active;
    protected Object dateCreation;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad userId.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Define el valor de la propiedad userId.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad returnDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Define el valor de la propiedad returnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(String value) {
        this.returnDate = value;
    }

    /**
     * Obtiene el valor de la propiedad passengerCounter.
     * 
     */
    public int getPassengerCounter() {
        return passengerCounter;
    }

    /**
     * Define el valor de la propiedad passengerCounter.
     * 
     */
    public void setPassengerCounter(int value) {
        this.passengerCounter = value;
    }

    /**
     * Obtiene el valor de la propiedad cost.
     * 
     */
    public double getCost() {
        return cost;
    }

    /**
     * Define el valor de la propiedad cost.
     * 
     */
    public void setCost(double value) {
        this.cost = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad flightReservationID.
     * 
     */
    public long getFlightReservationID() {
        return flightReservationID;
    }

    /**
     * Define el valor de la propiedad flightReservationID.
     * 
     */
    public void setFlightReservationID(long value) {
        this.flightReservationID = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelReservationID.
     * 
     */
    public long getHotelReservationID() {
        return hotelReservationID;
    }

    /**
     * Define el valor de la propiedad hotelReservationID.
     * 
     */
    public void setHotelReservationID(long value) {
        this.hotelReservationID = value;
    }

    /**
     * Obtiene el valor de la propiedad flightCost.
     * 
     */
    public double getFlightCost() {
        return flightCost;
    }

    /**
     * Define el valor de la propiedad flightCost.
     * 
     */
    public void setFlightCost(double value) {
        this.flightCost = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelCost.
     * 
     */
    public double getHotelCost() {
        return hotelCost;
    }

    /**
     * Define el valor de la propiedad hotelCost.
     * 
     */
    public void setHotelCost(double value) {
        this.hotelCost = value;
    }

    /**
     * Obtiene el valor de la propiedad active.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Obtiene el valor de la propiedad dateCreation.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDateCreation() {
        return dateCreation;
    }

    /**
     * Define el valor de la propiedad dateCreation.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDateCreation(Object value) {
        this.dateCreation = value;
    }

}
