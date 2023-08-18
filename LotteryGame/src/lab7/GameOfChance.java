package lab7;

import java.util.ArrayList;
/**
 * 
 * @author Hamza
 * GameOfChance.java
 *
 */

//Constructor
//T extends Rollable to allow use of classes that have implemented Rollable
public class GameOfChance<T extends Rollable> implements Rollable {
	
	//Attributes 
	//Create list to store rollable objects
	protected ArrayList<T> myList;
	//String of the current game being played
	protected String currentPlay;
	
	//Arraylist to hold all the values of myList.rollRandom
	protected ArrayList<String> List = new ArrayList<String>();
	
	
	/**
	 * 
	 * @param myList
	 * @param currentPlay
	 */
	public GameOfChance(ArrayList<T> myList, String currentPlay){
		this.myList = myList;
		this.currentPlay = currentPlay;
		
	}
	
	
	/**
	 * 
	 * @return myList
	 */
	public ArrayList<T> getMyList() {
		return myList;
	}

	/**
	 * 
	 * @param myList
	 */

	public void setMyList(ArrayList<T> myList) {
		this.myList = myList;
	}


	/**
	 * 
	 * @return currentPLay
	 */
	public String getCurrentPlay() {
		return currentPlay;
	}


	/**
	 * 
	 * @param currentPlay
	 */
	public void setCurrentPlay(String currentPlay) {
		this.currentPlay = currentPlay;
	}


	//Unneeded
	public String rollRandom() {
		return null;
		
		
	}
	/**
	 * 
	 * @param x
	 * Adds to object to myList
	 */
	public void add(T x) {
		myList.add(x);
	}
	//Plays the game by returning the randomized values from list
	//Adds each rollRandom from myList to be used later
	public String play() {
		
		for (int i =0; i<myList.size();i++) {
			List.add(myList.get(i).rollRandom());	
		}
		//LottoBall only needs one object so you can grab the first one
		if (currentPlay.equals("LottoBall")) {
			return List.get(0);
		}
		return List.toString();

	}
	//Returns whether the user has won or not
	//Uses exception when there isn't enough objects
	/**
	 * 
	 * @return boolean value of winner
	 * @throws Exception when size is less than 2
	 */
	public boolean winner() throws Exception {
		
		
		//If all values in the array are equal
		boolean allEqual = List.stream().distinct().limit(2).count() <= 1;
		//Based on current play, check if it meets the size requirements and if its good, return whether all values are the same
		if (currentPlay.equals("Dice")) {
			
			if (myList.size() < 2) {
				throw new Exception("You must roll more than two di");
			}
			else {
				if (allEqual) {
					return true;
			
			
				}
			}
		}
		else if (currentPlay.equals("StepperWheel")) {
			if (myList.size() < 2) {
				throw new Exception("You must have more than one StepperWheel");
			}
			else {
				if (allEqual) {
					return true;
				
				
				}
			}
			
		}
		
		
		return false;
	}
	/**
	 * 
	 * @param Takes user guesses and compares it to the random generated values
	 * @return Boolean value of winner
	 */
	public boolean winner(String winner) {
		
		//If the string from play equals the string from the user, return true
		if (currentPlay.equals("LottoBall")) {
			if (play().equals(winner)) {
				return true;
			}
		}
		return false;
		
	}

 
}
