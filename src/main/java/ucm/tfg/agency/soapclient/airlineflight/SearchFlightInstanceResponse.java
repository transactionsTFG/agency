
package ucm.tfg.agency.soapclient.airlineflight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
<<<<<<< HEAD
 * <p>Java class for searchFlightInstanceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
=======
 * <p>Clase Java para searchFlightInstanceResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
 * 
 * <pre>
 * &lt;complexType name="searchFlightInstanceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://soap/}flightInstanceDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchFlightInstanceResponse", propOrder = {
    "_return"
})
public class SearchFlightInstanceResponse {

    @XmlElement(name = "return")
    protected FlightInstanceDTO _return;

    /**
<<<<<<< HEAD
     * Gets the value of the return property.
=======
     * Obtiene el valor de la propiedad return.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     * @return
     *     possible object is
     *     {@link FlightInstanceDTO }
     *     
     */
    public FlightInstanceDTO getReturn() {
        return _return;
    }

    /**
<<<<<<< HEAD
     * Sets the value of the return property.
=======
     * Define el valor de la propiedad return.
>>>>>>> 43d7f60833fe04bc86b98f69f9edbc12c9d528c0
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInstanceDTO }
     *     
     */
    public void setReturn(FlightInstanceDTO value) {
        this._return = value;
    }

}
