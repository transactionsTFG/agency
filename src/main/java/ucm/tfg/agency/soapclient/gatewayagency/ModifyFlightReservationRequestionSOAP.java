
package ucm.tfg.agency.soapclient.gatewayagency;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyFlightReservationRequestionSOAP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyFlightReservationRequestionSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idReservation" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="flights" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="flight" type="{http://soap/}idFlightInstanceWithSeatsSOAP" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "modifyFlightReservationRequestionSOAP", propOrder = {
    "idReservation",
    "flights"
})
public class ModifyFlightReservationRequestionSOAP {

    protected long idReservation;
    protected ModifyFlightReservationRequestionSOAP.Flights flights;

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
     * Gets the value of the flights property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyFlightReservationRequestionSOAP.Flights }
     *     
     */
    public ModifyFlightReservationRequestionSOAP.Flights getFlights() {
        return flights;
    }

    /**
     * Sets the value of the flights property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyFlightReservationRequestionSOAP.Flights }
     *     
     */
    public void setFlights(ModifyFlightReservationRequestionSOAP.Flights value) {
        this.flights = value;
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
     *         &lt;element name="flight" type="{http://soap/}idFlightInstanceWithSeatsSOAP" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "flight"
    })
    public static class Flights {

        protected List<IdFlightInstanceWithSeatsSOAP> flight;

        /**
         * Gets the value of the flight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the flight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IdFlightInstanceWithSeatsSOAP }
         * 
         * 
         */
        public List<IdFlightInstanceWithSeatsSOAP> getFlight() {
            if (flight == null) {
                flight = new ArrayList<IdFlightInstanceWithSeatsSOAP>();
            }
            return this.flight;
        }

    }

}
