package business.businessdelegate.services.airline;

import common.dto.airlinemta.FlightDTO;
import common.dto.airlinemta.MakeReservationDTO;
import common.dto.airlinemta.ModifyReservationDTO;
import common.dto.airlinemta.ReservationDTO;
import common.result.Result;

public interface AirlineService {
    Result<FlightDTO> getFlight(long idFlight);
    Result<ReservationDTO> makeResevation(final MakeReservationDTO m);
    Result<Void> cancelReservation(final long idReservation, final long idFlightInstance);
    Result<ReservationDTO> modifyReservation(final ModifyReservationDTO m);
    Result<ReservationDTO> searchReservation(final long idReservation);
}
