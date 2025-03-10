
package ucm.tfg.agency.soapclient.airlinereservation;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para updateReservationDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateReservationDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bookingDTO" type="{http://soap/}bookingDTO" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idCustomer" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="updatePrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="updatePriceReservationDTO" type="{http://soap/}updatePriceReservationDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateReservationDTO", propOrder = {
    "active",
    "bookingDTO",
    "date",
    "id",
    "idCustomer",
    "total",
    "updatePrice",
    "updatePriceReservationDTO"
})
public class UpdateReservationDTO {

    protected boolean active;
    protected BookingDTO bookingDTO;
    protected String date;
    protected long id;
    protected long idCustomer;
    protected double total;
    protected double updatePrice;
    @XmlElement(nillable = true)
    protected List<UpdatePriceReservationDTO> updatePriceReservationDTO;

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
     * Obtiene el valor de la propiedad bookingDTO.
     * 
     * @return
     *     possible object is
     *     {@link BookingDTO }
     *     
     */
    public BookingDTO getBookingDTO() {
        return bookingDTO;
    }

    /**
     * Define el valor de la propiedad bookingDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingDTO }
     *     
     */
    public void setBookingDTO(BookingDTO value) {
        this.bookingDTO = value;
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
     * Obtiene el valor de la propiedad idCustomer.
     * 
     */
    public long getIdCustomer() {
        return idCustomer;
    }

    /**
     * Define el valor de la propiedad idCustomer.
     * 
     */
    public void setIdCustomer(long value) {
        this.idCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad updatePrice.
     * 
     */
    public double getUpdatePrice() {
        return updatePrice;
    }

    /**
     * Define el valor de la propiedad updatePrice.
     * 
     */
    public void setUpdatePrice(double value) {
        this.updatePrice = value;
    }

    /**
     * Gets the value of the updatePriceReservationDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatePriceReservationDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatePriceReservationDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatePriceReservationDTO }
     * 
     * 
     */
    public List<UpdatePriceReservationDTO> getUpdatePriceReservationDTO() {
        if (updatePriceReservationDTO == null) {
            updatePriceReservationDTO = new ArrayList<UpdatePriceReservationDTO>();
        }
        return this.updatePriceReservationDTO;
    }

}
