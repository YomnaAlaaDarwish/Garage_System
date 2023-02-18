package Slot;
import java.util.Vector;

import Configuration.Configuration;
import Vechicle.Vechile;

public class SlotController {
	private SlotDB slots;
	
	public SlotController(){
		
		slots = SlotDB.getInstance();
	}

	public void setVectorOfSlots(int numSlots ,Vector <Double> slotsData) {
		
		 
	for(int i =0 , x=0  ; i<= numSlots ; i= i+2 ){
		
		//System.out.println(" index " + x + "lenght = " + slotsData.get(x) + "Width= " + slotsData.get(++x));
		slots.addSlot(slotsData.get(x), slotsData.get(++x));
		//System.out.println(" num " + x );
		x++ ;
	}
	}
	
	public Vector<Slot> searchAvaliableSlots ()
	{
		Vector<Slot>allSlot = slots.getAllSlot();
		Vector<Slot> avaliableSlot = new Vector<Slot>();
	 		
		for (int i=0; i<allSlot.size() ;i++)
		{
			if (!allSlot.get(i).getFlag() )
			{
				avaliableSlot.add(allSlot.get(i));
				
			}
		}
		return avaliableSlot;
	}

		
	public void searchToSetFlag( Vechile vehicle)
	{
		Vector<Slot>allSlot = slots.getAllSlot();

		for (int i=0; i<allSlot.size();i++)
		{
			if (allSlot.get(i).getId()==vehicle.getSlotId() )
			{
				allSlot.get(i).setFlag(false);
			}
		}
		
	}
	
	public Vector<Slot> searchAppropiteSlots(double depth , double width  )
	{
	 Vector<Slot> appropiteSlot;
	 Vector<Slot>allSlot = slots.getAllSlot();

	 appropiteSlot = new Vector<Slot>();
	 
		for (int i=0; i<allSlot.size();i++)
		{
			if (allSlot.get(i).getLenght()>=depth && allSlot.get(i).getWidth()>=width )
			{
				appropiteSlot.add(allSlot.get(i));
			}
		}
		return appropiteSlot;
	}
	
	
	public void setConfiguration(Configuration configuration) {
		slots.setConfiguration(configuration);
	}
	public Configuration getConfiguration() {
		 return slots.getConfiguration();
	}

}
