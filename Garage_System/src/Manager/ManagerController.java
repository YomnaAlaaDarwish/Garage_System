package Manager;
import java.util.Vector;
import Configuration.Configuration;
import Configuration.FactoreyConfig;
import Slot.Slot;
import Slot.SlotController;
import Vechicle.VechileController;
import Helper.Finance;

public class ManagerController {
	
	public void SetUpGarage(int numSlots , int configType , Vector <Double> slotsData ,double cost ) {	
		SlotController slotController = new SlotController();
		slotController.setVectorOfSlots(numSlots ,slotsData);
		FactoreyConfig factoreyConfig = new FactoreyConfig();
		Configuration config = factoreyConfig.create(configType);
		slotController.setConfiguration(config);
		Finance finance = Finance.getInstance();
		finance.setParkingCost(cost);
		  
		System.out.println("you finish the setup succsefuly ");
	}
	public Vector<Slot>searchAvailableSlots(){
		SlotController slotController = new SlotController();
		return slotController.searchAvaliableSlots();
	
	}
	public int getNumOFViecle() {
		VechileController vechileController = new VechileController();
		
		return vechileController.getNumOFViecle() ;
	}
	public double getTotalIncome()
	{
		Finance finance = Finance.getInstance();
		return finance.getTotalIncome();
	}

}
