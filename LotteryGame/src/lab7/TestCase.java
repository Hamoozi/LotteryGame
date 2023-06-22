package lab7;

import java.util.ArrayList;

import java.util.Scanner;

/**
 * 
 * @author Hamza Wahhas
 * CS 210
 * 3/15/2021
 * Lab 7
 * Lab7Driver.java
 *
 */
public class TestCase {

	
	public static<T> void main(String[] args) throws Exception {
		//Create scanner for user input
		Scanner input = new Scanner(System.in);
		
		//Create ArrayList for Rollable objects
		ArrayList<Die> dies = new ArrayList<Die>();
		ArrayList<StepperWheel> wheels = new ArrayList<StepperWheel>();
		ArrayList<LottoBall> balls = new ArrayList<LottoBall>();
		
		
		//Create instances of GameOfChance
		GameOfChance testWheel = new GameOfChance(wheels, "StepperWheel");
		GameOfChance testDie = new GameOfChance(dies, "Dice");
		GameOfChance testBall = new GameOfChance(balls, "LottoBall");
	
		
		
		
		//Create StepperWheels
		//I created three
		StepperWheel wheel = new StepperWheel(5);
		StepperWheel wheel2 = new StepperWheel(4);
		StepperWheel wheel3 = new StepperWheel(11);
		
		//Add stepperwheels to the GameOfChance instance
		//You can also add to array, doesn't matter
		testWheel.add(wheel);
		testWheel.add(wheel2);
		testWheel.add(wheel3);
		
		System.out.println("Testing out StepperWheel");
		//String version by removing brackets
		System.out.println(testWheel.play().replace("[", "").replace("]", ""));
		
		//Same case as before
		if(testWheel.winner() == true) {
			System.out.println("You are a winner!!!");
		}
		else {
			System.out.println("You lost!");
		}
		System.out.println();
		
		
		
		
		
		
		
		//Create new arrau in order to build list of user values
		ArrayList<String> testLotto = new ArrayList<String>();
		
		
		//Ask user for array size in order to keep the LottoBall array and user array synchronized 
		System.out.println("How many values would you like in the LottoBall");
		int lotnum = Integer.valueOf(input.nextLine());
		
		//Create ball with length of user input
		LottoBall ball = new LottoBall(lotnum);
		
		//Add ball
		testBall.add(ball);
		//Creates list
		for (int i = 0; i<lotnum; i++) {
			System.out.println("Enter a value");
			testLotto.add(input.nextLine());
		}
		
		
		
		
		System.out.println("Testing LottoBall");
		//String version
		System.out.println(testBall.play().replace("[", "").replace("]", ""));
		
		//String version
		System.out.println("Your guess " + testLotto.toString().replace("[", "").replace("]", ""));
		
		//Same case as above except we use other winner method which takes user input
		if (testBall.winner(testLotto.toString()) == true) {
			System.out.println("You are a winner!!!");
		}
		else {
			System.out.println("You lost!");
		}
		
		System.out.println();
		
		
		//Create die
		Die die = new Die();
		Die die1 = new Die();
		
		//Add die to the GameOfChance instance
		//You can also add to array, doesn't matter
		testDie.add(die);
		testDie.add(die1);
		System.out.println("Testing out Di");
		//Replace brackets in order to resemble a string
		System.out.println(testDie.play().replace("[", "").replace("]", ""));
		//if the user won, print out that they are a winner
		//else let them know they lost 
		if(testDie.winner() == true) {
			System.out.println("You are a winner!!!");
		}
		else {
			System.out.println("You lost!");
		}
		
		System.out.println();
		
		
		
	}

}
