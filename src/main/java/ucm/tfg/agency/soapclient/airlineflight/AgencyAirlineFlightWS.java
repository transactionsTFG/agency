
package ucm.tfg.agency.soapclient.airlineflight;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebService(name = "AgencyAirlineFlightWS", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AgencyAirlineFlightWS {


    /**
     * 
     * @param idFlightSearch
     * @return
     *     returns ucm.tfg.agency.soapclient.airlineflight.FlightSOAP
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "search", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.airlineflight.Search")
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.airlineflight.SearchResponse")
    @Action(input = "http://soap/AgencyAirlineFlightWS/searchRequest", output = "http://soap/AgencyAirlineFlightWS/searchResponse")
    public FlightSOAP search(
        @WebParam(name = "idFlightSearch", targetNamespace = "")
        long idFlightSearch);

    /**
     * 
     * @param idFlightInstance
     * @return
     *     returns ucm.tfg.agency.soapclient.airlineflight.FlightInstanceDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchFlightInstance", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.airlineflight.SearchFlightInstance")
    @ResponseWrapper(localName = "searchFlightInstanceResponse", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.airlineflight.SearchFlightInstanceResponse")
    @Action(input = "http://soap/AgencyAirlineFlightWS/searchFlightInstanceRequest", output = "http://soap/AgencyAirlineFlightWS/searchFlightInstanceResponse")
    public FlightInstanceDTO searchFlightInstance(
        @WebParam(name = "idFlightInstance", targetNamespace = "")
        long idFlightInstance);

    /**
     * 
     * @param reservationId
     * @return
     *     returns java.util.List<ucm.tfg.agency.soapclient.airlineflight.IdFlightInstanceWithSeatsDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchFlightInstanceByReservation", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.airlineflight.SearchFlightInstanceByReservation")
    @ResponseWrapper(localName = "searchFlightInstanceByReservationResponse", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.airlineflight.SearchFlightInstanceByReservationResponse")
    @Action(input = "http://soap/AgencyAirlineFlightWS/searchFlightInstanceByReservationRequest", output = "http://soap/AgencyAirlineFlightWS/searchFlightInstanceByReservationResponse")
    public List<IdFlightInstanceWithSeatsDTO> searchFlightInstanceByReservation(
        @WebParam(name = "reservationId", targetNamespace = "")
        long reservationId);

    /**
     * 
     * @param paramSearchFlight
     * @return
     *     returns java.util.List<ucm.tfg.agency.soapclient.airlineflight.FlightListDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchFlight", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.airlineflight.SearchFlight")
    @ResponseWrapper(localName = "searchFlightResponse", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.airlineflight.SearchFlightResponse")
    @Action(input = "http://soap/AgencyAirlineFlightWS/searchFlightRequest", output = "http://soap/AgencyAirlineFlightWS/searchFlightResponse")
    public List<FlightListDTO> searchFlight(
        @WebParam(name = "paramSearchFlight", targetNamespace = "")
        ParamSearchFlightSOAP paramSearchFlight);

}
