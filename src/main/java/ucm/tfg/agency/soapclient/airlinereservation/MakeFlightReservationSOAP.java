
package ucm.tfg.agency.soapclient.airlinereservation;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para makeFlightReservationSOAP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="makeFlightReservationSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCustomer" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "makeFlightReservationSOAP", propOrder = {
    "dni",
    "idCustomer",
    "flights"
})
public class MakeFlightReservationSOAP {

    protected String dni;
    protected long idCustomer;
    protected MakeFlightReservationSOAP.Flights flights;

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDni(String value) {
        this.dni = value;
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
     * Obtiene el valor de la propiedad flights.
     * 
     * @return
     *     possible object is
     *     {@link MakeFlightReservationSOAP.Flights }
     *     
     */
    public MakeFlightReservationSOAP.Flights getFlights() {
        return flights;
    }

    /**
     * Define el valor de la propiedad flights.
     * 
     * @param value
     *     allowed object is
     *     {@link MakeFlightReservationSOAP.Flights }
     *     
     */
    public void setFlights(MakeFlightReservationSOAP.Flights value) {
        this.flights = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
         * returned list will be present inside the JAXB object.
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
