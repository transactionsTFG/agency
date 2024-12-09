package common.mapper.airlinemta;

import common.dto.airlinemta.ReservationDTO;
import soapclient.airline.reservation.ReservationSOAP;

public class MapperReservationSOAP {
    private MapperReservationSOAP(){}
    public static ReservationDTO toDTO(final ReservationSOAP r){
        return ReservationDTO.builder()
                             .id(r.getId())
                             .date(r.getDate())
                             .total(r.getTotal())
                             .idCustomer(r.getIdCustomer())
                             .active(r.isActive())
                             .build();
    }
}
