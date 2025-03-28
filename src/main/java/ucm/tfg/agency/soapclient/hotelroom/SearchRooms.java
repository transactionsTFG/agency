
package ucm.tfg.agency.soapclient.hotelroom;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchRooms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the nameHotel property.
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
     * Sets the value of the nameHotel property.
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
     * Gets the value of the nameCountry property.
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
     * Sets the value of the nameCountry property.
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
