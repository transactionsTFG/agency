
package ucm.tfg.agency.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for booking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="booking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nightsNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="withBreakfast" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="agencyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="customerDNI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="peopleNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rooms"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "booking", propOrder = {
    "id",
    "date",
    "nightsNumber",
    "withBreakfast",
    "agencyName",
    "active",
    "customerDNI",
    "peopleNumber",
    "rooms"
})
public class Booking {

    protected int id;
    @XmlElement(required = true)
    protected String date;
    protected int nightsNumber;
    protected boolean withBreakfast;
    @XmlElement(required = true)
    protected String agencyName;
    protected boolean active;
    @XmlElement(required = true)
    protected String customerDNI;
    protected int peopleNumber;
    @XmlElement(required = true)
    protected Booking.Rooms rooms;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the nightsNumber property.
     * 
     */
    public int getNightsNumber() {
        return nightsNumber;
    }

    /**
     * Sets the value of the nightsNumber property.
     * 
     */
    public void setNightsNumber(int value) {
        this.nightsNumber = value;
    }

    /**
     * Gets the value of the withBreakfast property.
     * 
     */
    public boolean isWithBreakfast() {
        return withBreakfast;
    }

    /**
     * Sets the value of the withBreakfast property.
     * 
     */
    public void setWithBreakfast(boolean value) {
        this.withBreakfast = value;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
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
     * Gets the value of the customerDNI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDNI() {
        return customerDNI;
    }

    /**
     * Sets the value of the customerDNI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDNI(String value) {
        this.customerDNI = value;
    }

    /**
     * Gets the value of the peopleNumber property.
     * 
     */
    public int getPeopleNumber() {
        return peopleNumber;
    }

    /**
     * Sets the value of the peopleNumber property.
     * 
     */
    public void setPeopleNumber(int value) {
        this.peopleNumber = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link Booking.Rooms }
     *     
     */
    public Booking.Rooms getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking.Rooms }
     *     
     */
    public void setRooms(Booking.Rooms value) {
        this.rooms = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomNumber"
    })
    public static class Rooms {

        @XmlElement(type = Integer.class)
        protected List<Integer> roomNumber;

        /**
         * Gets the value of the roomNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the roomNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getRoomNumber() {
            if (roomNumber == null) {
                roomNumber = new ArrayList<Integer>();
            }
            return this.roomNumber;
        }

    }

}
