
package ucm.tfg.agency.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "RoomsPort", targetNamespace = "http://ucm.tfg/hotelMTA")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RoomsPort {


    /**
     * 
     * @param getRoomRequest
     * @return
     *     returns ucm.tfg.agency.soap.GetRoomResponse
     */
    @WebMethod
    @WebResult(name = "getRoomResponse", targetNamespace = "http://ucm.tfg/hotelMTA", partName = "getRoomResponse")
    public GetRoomResponse getRoom(
        @WebParam(name = "getRoomRequest", targetNamespace = "http://ucm.tfg/hotelMTA", partName = "getRoomRequest")
        GetRoomRequest getRoomRequest);

}
