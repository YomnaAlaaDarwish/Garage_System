package Manager;
import java.util.Scanner;
import java.util.Vector;

import Slot.Slot;

public class ManagerBoundry {
	
	private ManagerController managerController;
	
	public ManagerBoundry () {
		managerController = new ManagerController ();
	}
	
	public void  performMethod() {
		System.out.println(" Welecome.. manger ");  
		System.out.println("choose:\n1.SetUP\n2.Display Avialable Slots\n3.Show total income \n4.Show total number of vehicle\n");

		Scanner obj1= new Scanner (System.in);
		int choice = obj1.nextInt();
		switch(choice) {
		  case 1:
		  {
			  setUpBoundery();
			  break; }
		  
		   
		  case 2:
		  { 
			displayAvaliableSlots(managerController.searchAvailableSlots());
		    break;
		   }
		  case 3:
		  { 
			  System.out.println("The Total income is = "+ managerController.getTotalIncome());
		    break;
		    }
		  case 4:
		  { 
			  System.out.println("The number of vehicle is = "+ managerController.getNumOFViecle());
		    break;
		    }
		  
		  default:
				System.out.println("Error You can Choose 1 or 2 or 3 or 4 only \n");

		}
		
	}
	
	public Vector<Double> takeAllDimentionSlots(int slots) {
		
		 Vector<Double> slotsInfo ;
		 slotsInfo = new Vector<Double> ();
		 double num ;
		 System.out.println("Enter The Lenght and Width of Slot ");  
		 for(int i =0  ; i< slots*2 ; i++) {
		Scanner obj= new Scanner (System.in);
		num = obj.nextDouble() ;
		while (num<=0)
		{
			System.out.println("Enter valid number for Lenght and Width of Slot that bigger than 0 ");
			obj= new Scanner (System.in);
			num = obj.nextDouble() ;
		}
		
		slotsInfo.add(num);
		 }
		
		return slotsInfo ;
		
		 
		
	}
	public  void displayAvaliableSlots (Vector<Slot> avaliableSlot)
	{
		for (int i=0; i<avaliableSlot.size() ;i++)
		{
			
			avaliableSlot.get(i).display();
		}
	}
	
	public static void displayFees(long fee ) {
		System.out.println("\nYour Fees: \n"+fee);


	}
	public void setUpBoundery() {
		
		Scanner obj1= new Scanner (System.in);
		System.out.println("Choose Configration:\n1.First come first served slots the park-in\n"+ "2.Best-fit approach\n" );
		
		int config  = obj1.nextInt();
		while (config != 1 && config != 2)
		{
			System.out.println("Enter valid number for Configration 1 or 2 only");
			obj1= new Scanner (System.in);
			config  = obj1.nextInt();
		}
		System.out.println("Enter the cost for parking 1 hour\n");
		double cost = obj1.nextDouble();
		while(cost<=0) {
			System.out.println("Erorr Enter Positive number, try again !!\n");
			cost = obj1.nextDouble();
		}

		System.out.println("Enter The Number  of Slots ");
		int slots = obj1.nextInt();
		while(slots<=0) {
			System.out.println("Erorr Enter Positive number, try again !!\n");
			slots = obj1.nextInt();
		}
		Vector <Double> slotData = takeAllDimentionSlots(slots);
		
		managerController.SetUpGarage(slots, config, slotData,cost);
	}

}
