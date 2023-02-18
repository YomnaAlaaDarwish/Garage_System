package Driver;


 import java.time.LocalTime; // import the LocalTime class

 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.util.Date;

import Helper.Finance;
import Slot.SlotController;
import Vechicle.Vechile;
import Vechicle.VechileController;

import java.time.format.DateTimeFormatter;
 import java.time.LocalDateTime;

public class ParkOutController {
	public double parkOut (Vechile vehicle) {
		double fees;
		VechileController vechileController = new VechileController();
		SlotController slotController = new SlotController();
		vehicle.setDepartureTime(vechileController.setTime());
		Finance finance=Finance.getInstance();
		fees=finance.calculateFees(vehicle.getDepartureTime(),vehicle.getArrivalTime());
		finance.updateTotalIncome(fees);
		slotController.searchToSetFlag(vehicle);
		vechileController.deleteVehicle(vehicle);
		return fees; 
}
}