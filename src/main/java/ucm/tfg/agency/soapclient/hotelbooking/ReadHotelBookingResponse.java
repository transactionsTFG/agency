
package ucm.tfg.agency.soapclient.hotelbooking;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para readHotelBookingResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="readHotelBookingResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://soap/}bookingDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readHotelBookingResponse", propOrder = {
    "_return"
})
public class ReadHotelBookingResponse {

    @XmlElement(name = "return")
    protected BookingDTO _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link BookingDTO }
     *     
     */
    public BookingDTO getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingDTO }
     *     
     */
    public void setReturn(BookingDTO value) {
        this._return = value;
    }

}
