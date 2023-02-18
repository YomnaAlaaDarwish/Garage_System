package Helper;
import java.time.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.temporal.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Finance {
	private static Finance singletonfinance;
	private double totalIncome;
	private double parkingCost;
	
	private Finance(){}
public static Finance getInstance() {
		
		if(singletonfinance==null)
		{
			singletonfinance = new Finance();
		}
		return singletonfinance;

}
public void setParkingCost(double cost) { 
	parkingCost = cost;
}
public double getParkingCost() {
	return parkingCost;
}

	
	public double calculateFees(Date departure_time,Date start_time)
	{double total=0;

        long difference_In_Time= departure_time.getTime() - start_time.getTime();

        long difference_In_Hours= (difference_In_Time/ (1000 * 60 * 60))% 24;
            
        long difference_In_Years= (difference_In_Time/ (1000l * 60 * 60 * 24 * 365));    

        long difference_In_Days= (difference_In_Time/ (1000 * 60 * 60 * 24))% 365;
        
        total=difference_In_Hours+(difference_In_Days*24)+(difference_In_Years*365*24);
        
        long difference_In_Minutes= (difference_In_Time/ (1000 * 60))% 60;
        
    	if(difference_In_Minutes>=1)
    	{
    		total+=1;
    	}
        
        total*=parkingCost;
    	
        return total ;
	}
	
	public void updateTotalIncome(double fees)
	{
		totalIncome+=fees;
	}
	public double getTotalIncome()
	{
		return totalIncome;
	}


}
