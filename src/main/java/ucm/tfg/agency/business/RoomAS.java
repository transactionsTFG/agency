package ucm.tfg.agency.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import ucm.tfg.agency.soap.GetRoomRequest;
import ucm.tfg.agency.soap.GetRoomResponse;



public class RoomAS extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(RoomAS.class);

    public GetRoomResponse getRoom(int number) {

        GetRoomRequest request = new GetRoomRequest();
        request.setNumber(number);

        log.info("Requesting room with number " + number);

        GetRoomResponse response = (GetRoomResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/hotelMTA/ws/", request,
                        new SoapActionCallback(
                                "http://ucm.tfg/hotelMTA/GetRoomRequest"));

        return response;
    }
}
