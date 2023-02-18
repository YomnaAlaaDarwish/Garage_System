package Driver;

import java.util.Scanner;

import Vechicle.Vechile;

public class DriverBoundery {
	  DriverController driverController;
	  public DriverBoundery(){
		  driverController = new DriverController();
	  }
	  

	public void  performMethod() {
		System.out.println("Welecome.. driver ");  
	System.out.println("choose:\n1.ParkIn\n2.ParkOut\n");

		Scanner obj1= new Scanner (System.in);
		int choice = obj1.nextInt();
		switch(choice) {
		  case 1:{// park in 
			  if(!driverController.checkSlotAvailability())
			  {
				  System.out.println("there is no avaliable slots now " );
				  break;// second Chance
			  }
			  

		  
			  System.out.println("Enter the Lenght and Depth of Your Vechile\n");
			
				  
			  double len = obj1.nextDouble();
			  double depth = obj1.nextDouble();
			  while(len<=0 || depth<=0)
			  {
	          System.out.println("invalid Intput Lenght or Depth can not take value 0 or Nagtavie");
	           len = obj1.nextDouble();
			  depth = obj1.nextDouble();
	          
			  }
			  
		  
			  System.out.println("Enter the Model of Your Vechile\n");
			  Scanner obj2= new Scanner (System.in);
			  String model =obj2.nextLine(); 
			 
			  Vechile vechile = new Vechile(model ,depth , len);
			  		  
			int slotid = driverController.parkIn(vechile);
			confirmParking(slotid,vechile.getId());
			        
		       break; 
		  }
		  
		  case 2:{//park out
			  
			  System.out.println("Enter Your Vechile ID: \n");
			  int ID = obj1.nextInt();
			  
			  Vechile vechile = new Vechile();
			  
					  if(driverController.checkVechileAvailability(ID)== true)
					  {
						double fees = driverController.parkOut(ID);
						System.out.println("\nYour Fees: \n"+fees);

					  }
					  else {System.out.println("there is not vehicle with this id \n");}
					  break;
		  		}
		 
		  default:
			  System.out.println("Error You can Choose 1 or only \n");
		    
		}
	}
	public void confirmParking(int slot ,int id) {
		if(slot==-1)
		System.out.println("\nSorry,There is no avialable slot.\n");
		else {
		System.out.println("Keep Your Vechile ID You will need it to park out: \n");
		System.out.println("\nYour Vechile ID: \n"+id );
		System.out.println("You can Park at Slot: \n"+slot );		
	}
}

}
