package lab7;
/**
 * 
 * @author Hamza Wahhas
 * CS 210
 * 3/15/2021
 * Lab 7
 * Wheel.java
 *
 */

//Abstract class that creates a wheel and implements Rollable for its children
public abstract class Wheel implements Rollable{
	
	//Initialize attribute
	protected int wheelSize;
	
	
	
	
	///Constructor
	public Wheel(int wheelSize) {
		
		this.wheelSize = wheelSize;
		
	}

	/**
	 * 
	 * @return wheelsize
	 */
	public int getWheelSize() {
		return wheelSize;
	}


	/**
	 * 
	 * @param wheelSize
	 */
	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}



	
	
	
	
	
	

}