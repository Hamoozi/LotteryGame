package lab7;

import java.util.Random;
import java.util.Arrays;


/**
 * 
 * @author Hamza
 * LottoBall.java
 *
 */

public class LottoBall implements Rollable {
	
	//Attribute for max number of values
	protected int max;
	
	//Constructor
	public LottoBall(int max) {	
		this.max = max;
	}

	/**
	 * 
	 * @return max
	 */
	public int getMax() {
		return max;
	}
	
	/**
	 * 
	 * @param max
	 */

	public void setMax(int max) {
		this.max = max;
	}

	
	//Logic for rollRandom from interface
	public String rollRandom() {
		//Create an array based off the length of max
		int[] arr = new int[max];
		Random random = new Random();
		//Random fill the array with values
		for (int i =0; i<arr.length; i++) {
			int num = random.nextInt(100);
			arr[i] = num;
			
		}
		//Return the string version of that array
		return Arrays.toString(arr);
		
	}


}
