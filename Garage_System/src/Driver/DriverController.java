package Driver;
import Slot.SlotController;
import Vechicle.Vechile;
import Vechicle.VechileController;

public class DriverController {
	
	public int parkIn( Vechile vechile )
	{
		ParkInController parking = new ParkInController();	
		 return parking.parkIn(vechile);	
	}
	
	public double parkOut( int vechileId ) {
		ParkOutController parking = new ParkOutController();
		VechileController vechileController = new VechileController();
		return parking.parkOut(vechileController.checkById(vechileId));		
	}
	public boolean checkSlotAvailability() {
		SlotController slotController = new SlotController();
		  if(slotController.searchAvaliableSlots()== null) {
			  return false;
		  }
		return true;		
	}
	public boolean checkVechileAvailability(int id) {
		VechileController vechileController = new VechileController();
		  if(vechileController.checkById(id)== null) {
			  return false;
		  }
		  else
			  return true;		
	}

}
