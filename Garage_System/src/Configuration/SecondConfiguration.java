package Configuration;

import java.util.Vector;

import Slot.Slot;
public class SecondConfiguration implements Configuration{
	public  Slot chooseSlot(Vector <Slot> arr,double width,double length)
 {
		 for(int i =  0; i < arr.size() ; i++) {
			 if(arr.get(i).getLenght() == length && arr.get(i).getWidth() == width) {
				 return arr.get(i);
			 }
		 }
		 return null;
	 }

	

}
