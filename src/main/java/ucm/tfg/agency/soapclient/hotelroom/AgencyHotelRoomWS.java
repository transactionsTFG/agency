
package ucm.tfg.agency.soapclient.hotelroom;

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
@WebService(name = "AgencyHotelRoomWS", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AgencyHotelRoomWS {


    /**
     * 
     * @param bookingId
     * @return
     *     returns java.util.List<ucm.tfg.agency.soapclient.hotelroom.BookingLineDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchRoomsByBooking", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.hotelroom.SearchRoomsByBooking")
    @ResponseWrapper(localName = "searchRoomsByBookingResponse", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.hotelroom.SearchRoomsByBookingResponse")
    @Action(input = "http://soap/AgencyHotelRoomWS/searchRoomsByBookingRequest", output = "http://soap/AgencyHotelRoomWS/searchRoomsByBookingResponse")
    public List<BookingLineDTO> searchRoomsByBooking(
        @WebParam(name = "bookingId", targetNamespace = "")
        long bookingId);

    /**
     * 
     * @param nameCountry
     * @param nameHotel
     * @return
     *     returns java.util.List<ucm.tfg.agency.soapclient.hotelroom.RoomListDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchRooms", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.hotelroom.SearchRooms")
    @ResponseWrapper(localName = "searchRoomsResponse", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.hotelroom.SearchRoomsResponse")
    @Action(input = "http://soap/AgencyHotelRoomWS/searchRoomsRequest", output = "http://soap/AgencyHotelRoomWS/searchRoomsResponse")
    public List<RoomListDTO> searchRooms(
        @WebParam(name = "nameHotel", targetNamespace = "")
        String nameHotel,
        @WebParam(name = "nameCountry", targetNamespace = "")
        String nameCountry);

    /**
     * 
     * @param id
     * @return
     *     returns ucm.tfg.agency.soapclient.hotelroom.RoomDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchRoom", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.hotelroom.SearchRoom")
    @ResponseWrapper(localName = "searchRoomResponse", targetNamespace = "http://soap/", className = "ucm.tfg.agency.soapclient.hotelroom.SearchRoomResponse")
    @Action(input = "http://soap/AgencyHotelRoomWS/searchRoomRequest", output = "http://soap/AgencyHotelRoomWS/searchRoomResponse")
    public RoomDTO searchRoom(
        @WebParam(name = "id", targetNamespace = "")
        long id);

}
