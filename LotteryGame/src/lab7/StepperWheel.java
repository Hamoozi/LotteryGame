package lab7;


import java.util.Arrays;
import java.util.Random;


/**
 * 
 * @author Hamza Wahhas
 * CS 210
 * 3/15/2021
 * Lab 7
 * StepperWheel.java
 *
 */

public class StepperWheel extends Wheel {
	//An array of symbols which the wheel will draw from
	protected static final String[] array = {"Blank","Basketball", "Baseball", "Football", "Hockey", "Blank", "Basketball", "Baseball", "Football", "Hockey","Blank", "Basketball", "Baseball", "Football", "Hockey", "Blank","Blank","Basketball", "Baseball", "Football", "Hockey"};
	
	/**
	 * 
	 * @param wheelSize
	 */
	public StepperWheel(int wheelSize) {
		super(wheelSize);
		// TODO Auto-generated constructor stub
		
		
 	}
	

	//Create logic for rollRandom from Rollable interface
	public String rollRandom() {
		// TODO Auto-generated method stub
		
		//Creates array based off of wheelsize
		if (wheelSize < 7 && wheelSize >=2) {
			
			//Create copy
			String arr[] = Arrays.copyOfRange(array, 0, 9);
			
			int random = new Random().nextInt(arr.length);
			//Return random symbol
			return arr[random];
			
			
		}
		//Creates array based off of wheelsize
		else if (wheelSize >= 7 && wheelSize < 21) {
			String arr[] = Arrays.copyOfRange(array, 0, 21);
			//Create copy
			int random = new Random().nextInt(arr.length);
			//Return random symbol
			return arr[random];
		}
		else {
			return "You must have values greater than or equal to 2 and less than or equal to 20";
		}
		
	}

}
