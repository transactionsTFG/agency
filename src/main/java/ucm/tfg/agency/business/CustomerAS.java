package ucm.tfg.agency.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import ucm.tfg.agency.soap.GetCustomerRequest;
import ucm.tfg.agency.soap.GetCustomerResponse;


public class CustomerAS extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(CustomerAS.class);

    public GetCustomerResponse getCustomer(String dni) {

        GetCustomerRequest request = new GetCustomerRequest();
        request.setDni(dni);

        log.info("Requesting customer with DNI " + dni);

        GetCustomerResponse response = (GetCustomerResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/hotelMTA/ws/customers", request,
                        new SoapActionCallback(
                                "http://ucm.tfg/hotelMTA/GetCustomerRequest"));

        return response;
    }
}
