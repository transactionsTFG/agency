package ucm.tfg.agency.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import ucm.tfg.agency.soap.GetBookingRequest;
import ucm.tfg.agency.soap.GetBookingResponse;



public class BookingAS extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(BookingAS.class);

    public GetBookingResponse getBooking(int id) {

        GetBookingRequest request = new GetBookingRequest();
        request.setId(id);

        log.info("Requesting booking with id " + id);

        GetBookingResponse response = (GetBookingResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/hotelMTA/ws/bookings", request,
                        new SoapActionCallback(
                                "http://ucm.tfg/hotelMTA/GetBookingRequest"));

        return response;
    }
}
