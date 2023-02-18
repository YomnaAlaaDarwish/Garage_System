package Vechicle;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class VechileController {
	
	private VechicleDB vechiles;
	// delete vechile 

	public VechileController() {
		vechiles =  VechicleDB.getInstance();
	}
	public  int getNumOFViecle() {
		return vechiles.getNumOFViecle();
	}
	public void addVehicleToVector(Vechile newVec){
		vechiles.addVehicleToVector(newVec);
	}
	
public Vechile checkById(int vehicleId) {
	Vector<Vechile>allVehicle = vechiles.getAllVehicle();
		for (int i=0; i<allVehicle.size() ;i++)
		{
			if (allVehicle.get(i).getId()== vehicleId)
			{
				return allVehicle.get(i);
			}
		}
		return null;
		
	}
public void deleteVehicle(Vechile vec) {
	vechiles.deleteVehicle(vec);	
}

public Date setTime(){
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  Date date = new Date();
	  return date;	
}

}
