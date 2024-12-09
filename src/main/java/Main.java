import business.businessdelegate.BusinessDelegate;
import common.dto.airlinemta.FlightDTO;
import common.enums.TypeService;
import common.result.Result;

public class Main {

	public static void main(String[] args) {
		BusinessDelegate b = new BusinessDelegate(TypeService.MTA);
		Result<FlightDTO> r = b.getFlight(3);
		System.out.println(r.getMessage());
		System.out.println(r.getData());
	}

}
