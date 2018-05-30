/**
 * 
 * Tom Abraham
 * period #1
 */
public class Car {//This is used of instantiating the instance variables

	private int startOdometer; 
	private int currentOdometer; 
	private double gallonsConsumed;
	
	public Car(){//Default constructor used for calling in the driver
		
	}
	
	public void fillUp(int currentOd, int startOd, double gallonsUsed) {//This parameter constructor is used for initializing all the instance variables
		currentOdometer = currentOd;
		gallonsConsumed = gallonsUsed;
		startOdometer = startOd;
	}
	
	public double calculateMPG(){//This method is used for calculating the miles per gallon. 
		double MilesPerGallon = (currentOdometer - startOdometer) / gallonsConsumed;
		return MilesPerGallon;
	}
	
	public void resetMPG() {//This method is used for resetting the variables so that the mpg can be calculated once again
		gallonsConsumed = 0;
		startOdometer = currentOdometer;
		
	}
	
	
	
}//end class
