
package ucm.tfg.agency.soapclient.hotelroom;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchRooms complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchRooms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRooms", propOrder = {
    "nameHotel",
    "nameCountry"
})
public class SearchRooms {

    protected String nameHotel;
    protected String nameCountry;

    /**
     * Obtiene el valor de la propiedad nameHotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameHotel() {
        return nameHotel;
    }

    /**
     * Define el valor de la propiedad nameHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameHotel(String value) {
        this.nameHotel = value;
    }

    /**
     * Obtiene el valor de la propiedad nameCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCountry() {
        return nameCountry;
    }

    /**
     * Define el valor de la propiedad nameCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCountry(String value) {
        this.nameCountry = value;
    }

}
