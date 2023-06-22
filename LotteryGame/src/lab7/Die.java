package lab7;

import java.util.Random;
/**
 * 
 * @author Hamza Wahhas
 * Die.java
 *
 */

public class Die implements Rollable{
	//Create an array of values you would find in a die
	protected static final int[] array = {1,2,3,4,5,6};

	//Logic for rollRandom from interface
	public String rollRandom() {
		//Take a random value from array
		int random = new Random().nextInt(array.length);
		
		//Return string version of that value
		return String.valueOf(array[random]);
		
	}
	


}
