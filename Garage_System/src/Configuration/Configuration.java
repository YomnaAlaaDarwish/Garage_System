package Configuration;
import java.util.Vector;

import Slot.Slot;

public interface Configuration {
	public  Slot chooseSlot(Vector <Slot> arr,double width,double length);
}
