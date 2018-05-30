/**
 * 
 * Tom Abraham
 * period #1
 */
import java.util.Scanner;


public class CarDriver {//Method that houses the driver code
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//Creating new object "scan" of the scanner class
		Car c = new Car();//Creates new object "c" for the car class
		System.out.println("MPG Lab 2017-18");
		System.out.print("New car odometer reading: ");//your code goes here
		int newCarOdometerReading = scan.nextInt();
		System.out.println("Filling Station Visit: ");
		System.out.print("odometer reading: ");
		int currentOdometerReading = scan.nextInt();
		System.out.print("gallons to fill tank: ");
		int gallons = scan.nextInt();
		System.out.println();
		//System.out.println();
		
		//Scanner nextScan = new Scanner(System.in);
		c.fillUp(currentOdometerReading, newCarOdometerReading, gallons);//Passes the values of the variables to the neccessary methods
		double milesPerGallon = c.calculateMPG();
		System.out.printf("Miles Per Gallon: %.2f ", milesPerGallon);
		c.resetMPG();
		System.out.println();
		System.out.println();
		
		Scanner nextScan = new Scanner(System.in);//Creates new object "nextScan" of the scanner class
		Car myCar = new Car();
		System.out.println("Filling Station Visit: ");
		System.out.print("odometer reading: ");
		int nextCurrentOdometerReading = nextScan.nextInt();
		System.out.print("gallons to fill tank: ");
		double nextGallons = nextScan.nextDouble();
		System.out.println();
		myCar.fillUp(nextCurrentOdometerReading, currentOdometerReading, nextGallons);//This passes on the value of the variables to the necessary methods
		double nextMilesPerGallon = myCar.calculateMPG();
		System.out.printf("Miles Per Gallon: %.2f ", nextMilesPerGallon);
	}

}
