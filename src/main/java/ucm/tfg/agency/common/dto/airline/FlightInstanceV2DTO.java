package ucm.tfg.agency.common.dto.airline;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightInstanceV2DTO {
    private long id;
	private LocalDate departureDate;
	private LocalDate arrivalDate;
	private String statusFlight;
	private int passengerCounter;
	private double price;
	private boolean active;
	private long idFlight;
	private long idAircraft;
	private String weekDay;
	private String cityDestination;
	private String countryOrigin;
	private String countryDestination;
}
