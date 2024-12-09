package common.mapper.airlinemta;

import common.dto.airlinemta.ModifyReservationDTO;
import soapclient.airline.reservation.ModifyReservationRequestSOAP;
import soapclient.airline.reservation.ReservationDTO;
import soapclient.airline.reservation.ReservationLineDTO;

public class MapperModifyReservationSOAP {
    private MapperModifyReservationSOAP(){}

    public static ModifyReservationRequestSOAP toSOAP(final ModifyReservationDTO m){
        ModifyReservationRequestSOAP request = new ModifyReservationRequestSOAP();
        ReservationDTO r = MapperReservationRequest.toSOAPRequest(m.getReservationDTO());
        ReservationLineDTO reservationLineDTO = new ReservationLineDTO();
        reservationLineDTO.setFlightInstanceId(m.getReservationLineDTO().getFlightInstanceId());
        reservationLineDTO.setPassengerCount(m.getReservationLineDTO().getPassengerCount());
        reservationLineDTO.setReservationId(m.getReservationLineDTO().getReservationId());

        request.setReservationLine(reservationLineDTO);
        request.setReservation(r);
        return request;
    }
}
