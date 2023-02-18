package Vechicle;
import java.util.Vector;

public class VechicleDB {
	private static VechicleDB  singletonVechicles ;
	private  Vector<Vechile> allVehicle;
	private  int numOFViecle;
	private VechicleDB() {
		allVehicle = new Vector<Vechile> ();
		numOFViecle =0;
	}
	public  Vector<Vechile> getAllVehicle() {
		return allVehicle;
	}

	public void setAllVehicle(Vector<Vechile> allVehicle) {
		this.allVehicle = allVehicle;
	}
	public  int getNumOFViecle() {
		return numOFViecle;
	}
	public  void setNumOFViecle(int numOFViecle) {
		this.numOFViecle = numOFViecle;
	}
	
	public static VechicleDB getInstance() {
		
		if(singletonVechicles==null)
		{
			singletonVechicles = new VechicleDB();
		}
		return singletonVechicles;

}
	public void deleteVehicle(Vechile vec) {
		
		allVehicle.remove(vec);
		
	}
	public void addVehicleToVector(Vechile newVec  )
	{
		numOFViecle = numOFViecle + 1;
		allVehicle.add(newVec);
	} 

}
