
import java.util.Scanner;
import java.util.Vector;

import Driver.DriverBoundery;
import Manager.ManagerBoundry;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void  start()
	{ System.out.println("Welcome ..Manager\nPlease,Setup Garage.");
		ManagerBoundry	choosedMethod  = new ManagerBoundry ();
		choosedMethod.setUpBoundery();
		
		boolean notExit = true ;
		Scanner obj= new Scanner (System.in);
		 while( notExit ) {
		 System.out.println("choose:\n1.for Manager\n2.for Driver\n3.Exit\n");
			int choice = obj.nextInt();
			switch(choice) {
			  case 1:
			  {
				   choosedMethod  = new ManagerBoundry ();
				  choosedMethod.performMethod();
				  break; 
			  }
			   
			  case 2:{
				  DriverBoundery choosedDriver  = new DriverBoundery();
				  choosedDriver.performMethod();
			    break;
			  }
			  case 3 :
			  {
				  notExit = false;
				  break;
			  }
			  
			  default:
				  System.out.println("Error You can Choose 1 or 2 or 3 only \n");
			}
		 }
		 
	}
	public static void main(String[] args) {
		start();	
	}
}
