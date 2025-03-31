
package ucm.tfg.agency.soapclient.airlinereservation;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agencyReservationSuccessDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agencyReservationSuccessDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateReservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idBooking" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idReservation" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="statusFlightsDTO" type="{http://soap/}statusFlightDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalReservation" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agencyReservationSuccessDTO", propOrder = {
    "dateReservation",
    "idBooking",
    "idReservation",
    "statusFlightsDTO",
    "totalReservation"
})
public class AgencyReservationSuccessDTO {

    protected String dateReservation;
    protected long idBooking;
    protected long idReservation;
    @XmlElement(nillable = true)
    protected List<StatusFlightDTO> statusFlightsDTO;
    protected double totalReservation;

    /**
     * Gets the value of the dateReservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateReservation() {
        return dateReservation;
    }

    /**
     * Sets the value of the dateReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReservation(String value) {
        this.dateReservation = value;
    }

    /**
     * Gets the value of the idBooking property.
     * 
     */
    public long getIdBooking() {
        return idBooking;
    }

    /**
     * Sets the value of the idBooking property.
     * 
     */
    public void setIdBooking(long value) {
        this.idBooking = value;
    }

    /**
     * Gets the value of the idReservation property.
     * 
     */
    public long getIdReservation() {
        return idReservation;
    }

    /**
     * Sets the value of the idReservation property.
     * 
     */
    public void setIdReservation(long value) {
        this.idReservation = value;
    }

    /**
     * Gets the value of the statusFlightsDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the statusFlightsDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusFlightsDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusFlightDTO }
     * 
     * 
     */
    public List<StatusFlightDTO> getStatusFlightsDTO() {
        if (statusFlightsDTO == null) {
            statusFlightsDTO = new ArrayList<StatusFlightDTO>();
        }
        return this.statusFlightsDTO;
    }

    /**
     * Gets the value of the totalReservation property.
     * 
     */
    public double getTotalReservation() {
        return totalReservation;
    }

    /**
     * Sets the value of the totalReservation property.
     * 
     */
    public void setTotalReservation(double value) {
        this.totalReservation = value;
    }

}
