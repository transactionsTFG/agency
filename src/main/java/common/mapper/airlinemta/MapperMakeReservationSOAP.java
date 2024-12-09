package common.mapper.airlinemta;

import common.dto.airlinemta.MakeReservationDTO;
import soapclient.airline.reservation.CustomerDTO;
import soapclient.airline.reservation.MakeReservationRequestSOAP;
import soapclient.airline.reservation.ReservationDTO;

public class MapperMakeReservationSOAP {
    private MapperMakeReservationSOAP(){}
    public static MakeReservationRequestSOAP toSOAP(final MakeReservationDTO m){
        final common.dto.airlinemta.CustomerDTO customerParam = m.getCustomer();

        MakeReservationRequestSOAP request = new MakeReservationRequestSOAP();
        ReservationDTO r = MapperReservationRequest.toSOAPRequest(m.getReservation());
        CustomerDTO c = new CustomerDTO();
        c.setActive(customerParam.isActive());
        c.setDni(customerParam.getDni());
        c.setEmail(customerParam.getEmail());
        c.setId(customerParam.getId());
        c.setName(customerParam.getName());
        c.setPhone(customerParam.getPhone());
        
        request.setIdFlight(m.getIdFlight());
        request.setNumberOfSeats(m.getNumberOfSeats());
        request.setCustomer(c);
        request.setReservation(r);
        return request;
    }
}
