package Slot;
import java.util.Vector;

import Configuration.Configuration;

public class SlotDB {
	private static  SlotDB singletonslots ;
	private  Vector<Slot> allSlot;
	private Configuration configuration;

		
	private SlotDB() {
		allSlot = new Vector<Slot>();
	}
	
	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}


	public  Vector<Slot> getAllSlot() {
		return allSlot;
	}

	public void setAllSlot(Vector<Slot> allSlot) {
		this.allSlot = allSlot;
	}
	 
	public static SlotDB getInstance() {
	
			if(singletonslots==null)
			{
				singletonslots = new SlotDB();
			}
			return singletonslots;
	
	}
	
	
	public  void  addSlot (double len,double wid)
	{   
		
	//	System.out.println(" in add slot " );
		Slot newSlot = new Slot( len, wid);
		//System.out.println(" after create slot " );

		allSlot.add(newSlot);
		//System.out.println(" add ok " );

		}


}
