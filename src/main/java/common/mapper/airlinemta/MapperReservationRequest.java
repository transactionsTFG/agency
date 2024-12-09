package common.mapper.airlinemta;

import soapclient.airline.reservation.ReservationDTO;

public class MapperReservationRequest {
    private MapperReservationRequest(){}
    public static ReservationDTO toSOAPRequest(final common.dto.airlinemta.ReservationDTO r){
        ReservationDTO request = new ReservationDTO();
        request.setActive(r.isActive());
        request.setDate(r.getDate());
        request.setId(r.getId());
        request.setIdCustomer(r.getIdCustomer());
        request.setTotal(r.getTotal());
        return request;
    }
}
