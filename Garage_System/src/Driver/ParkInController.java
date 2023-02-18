package Driver;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Vector;

import Configuration.Configuration;
import Slot.Slot;
import Slot.SlotController;
import Vechicle.Vechile;
import Vechicle.VechileController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkInController {

	public int parkIn (Vechile vechile) {	
		Vector<Slot> appropiteSlot;
		SlotController slotController = new SlotController();		
		 appropiteSlot = new Vector<Slot> ();
		 Slot chosedSlot = new Slot() ;
		 appropiteSlot= slotController.searchAppropiteSlots(vechile.getDepth() ,vechile.getWidth());
		 Configuration configuration = slotController.getConfiguration();
		chosedSlot = configuration.chooseSlot(appropiteSlot, vechile.getWidth(),vechile.getDepth());
		VechileController vechileController = new VechileController();
		if(chosedSlot==null)
			return -1; 
		int slotId=	chosedSlot.getId();
		Date arrivalTime = vechileController.setTime();
		vechile.setArrivalTime(arrivalTime);
		vechile.setSlotId(slotId);
		chosedSlot.setFlag(true);

		vechileController.addVehicleToVector(vechile);
		
		return slotId;
	}

}
