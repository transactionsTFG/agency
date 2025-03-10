
package ucm.tfg.agency.soapclient.airlineflight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchFlight complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchFlight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramSearchFlight" type="{http://soap/}paramSearchFlightSOAP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchFlight", propOrder = {
    "paramSearchFlight"
})
public class SearchFlight {

    protected ParamSearchFlightSOAP paramSearchFlight;

    /**
     * Obtiene el valor de la propiedad paramSearchFlight.
     * 
     * @return
     *     possible object is
     *     {@link ParamSearchFlightSOAP }
     *     
     */
    public ParamSearchFlightSOAP getParamSearchFlight() {
        return paramSearchFlight;
    }

    /**
     * Define el valor de la propiedad paramSearchFlight.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamSearchFlightSOAP }
     *     
     */
    public void setParamSearchFlight(ParamSearchFlightSOAP value) {
        this.paramSearchFlight = value;
    }

}
