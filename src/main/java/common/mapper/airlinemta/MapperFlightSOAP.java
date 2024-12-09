package common.mapper.airlinemta;

import common.dto.airlinemta.FlightDTO;
import soapclient.airline.flight.FlightSOAP;

public class MapperFlightSOAP {
    private MapperFlightSOAP(){}

    public static FlightDTO toDTO(final FlightSOAP f){
        return  FlightDTO
                    .builder()
                    .active(f.isActive())
                    .arrivalTime(f.getArrivalTime())
                    .codeFlight(f.getCodeFlight())
                    .id(f.getId())
                    .weekDay(f.getWeekDay())
                    .departureTime(f.getDepartureTime())
                    .idAircraft(f.getIdAircraft())
                    .idOriginFlight(f.getIdDestinationFlight())
                    .build();
    }

}
