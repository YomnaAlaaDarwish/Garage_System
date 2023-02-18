package Vechicle;


import java.time.LocalTime; // import the LocalTime class
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Vechile {
	private Date departureTime;
	private Date arrivalTime;
	private int slotId;
	private int id;
	private double width;
	private double depth;
	private String model;
	private static int  vId;
	static
	{
		vId=1;
	}
	public Vechile() {
		id=vId;
		vId++;
	}

	public Vechile (String model,double width,double depth) 
	{
		this.model=model;
		this.width=width;
		this.depth=depth;
		id=vId;
		vId++;	
	}

	 public Date getDepartureTime () {
		 return departureTime ;
	    }
	 public Date getArrivalTime () {
		 return arrivalTime ;
	    }
	 public void setDepartureTime(Date time) {
		 departureTime = time;
	    }
	 public void setArrivalTime (Date time) {
		 arrivalTime = time;
	    }
	 public void setSlotId (int id) {
		 slotId = id;
	    }

	 public int getSlotId () {
	       return slotId;
	    }
	 public int getId () {
	       return id;
	    }
	 public double getDepth () {
	       return depth;
	    }
	 public double getWidth () {
	       return width;
	    }
	 public void setModel (String m) {
		 model=m;
	    }
	 public void display () {
		 System.out.println("Vechile state :");
		
			 
		 
		 System.out.println("  Slot id = " + slotId);  
		 System.out.println(" width = " + width); 
		 System.out.println(" depth = " + depth); 
		 System.out.println(" arrivalTime = " + arrivalTime); 
		 System.out.println(" id = " + id); 
		 System.out.println(" model = " + model); 
		 
			
	    }
	
}


