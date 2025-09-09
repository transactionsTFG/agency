
package ucm.tfg.agency.soapclient.gatewayagency;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTravelSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the date property.
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
     * Sets the value of the date property.
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
     * Gets the value of the returnDate property.
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
     * Sets the value of the returnDate property.
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
     * Gets the value of the passengerCounter property.
     * 
     */
    public int getPassengerCounter() {
        return passengerCounter;
    }

    /**
     * Sets the value of the passengerCounter property.
     * 
     */
    public void setPassengerCounter(int value) {
        this.passengerCounter = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     */
    public double getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     */
    public void setCost(double value) {
        this.cost = value;
    }

    /**
     * Gets the value of the status property.
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
     * Sets the value of the status property.
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
     * Gets the value of the flightReservationID property.
     * 
     */
    public long getFlightReservationID() {
        return flightReservationID;
    }

    /**
     * Sets the value of the flightReservationID property.
     * 
     */
    public void setFlightReservationID(long value) {
        this.flightReservationID = value;
    }

    /**
     * Gets the value of the hotelReservationID property.
     * 
     */
    public long getHotelReservationID() {
        return hotelReservationID;
    }

    /**
     * Sets the value of the hotelReservationID property.
     * 
     */
    public void setHotelReservationID(long value) {
        this.hotelReservationID = value;
    }

    /**
     * Gets the value of the flightCost property.
     * 
     */
    public double getFlightCost() {
        return flightCost;
    }

    /**
     * Sets the value of the flightCost property.
     * 
     */
    public void setFlightCost(double value) {
        this.flightCost = value;
    }

    /**
     * Gets the value of the hotelCost property.
     * 
     */
    public double getHotelCost() {
        return hotelCost;
    }

    /**
     * Sets the value of the hotelCost property.
     * 
     */
    public void setHotelCost(double value) {
        this.hotelCost = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the dateCreation property.
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
     * Sets the value of the dateCreation property.
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
