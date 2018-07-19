package diceRolling;

import java.util.Random;
import java.util.Scanner;

public class DiceRolling {
	
	//method used for generating the random numbers
	public static int randNum(int x) {
		Random rand = new Random();
		int y = rand.nextInt(x) + 1;
		return y;
	}

	public static void main(String[] args) {

	// Opens Scanner and declares variables
		Scanner scnr = new Scanner(System.in);
		char response = 'y';
		int rollNumber = 1;
		
		//initial do loop is for the continuation question
		do {
			
		//collect the number of sides on the dice
		System.out.println("How many sides should the dice have?");
		int responseSides = scnr.nextInt();
		
		//calls the method used to generate random numbers
		int rand1 = randNum(responseSides);
		int rand2 = randNum(responseSides);
		
				//prints the rollNumber you are on
				System.out.println("Roll " + rollNumber + ":");

				
				//determines if the roll results in any special outputs
				if (rand1 == 1 && rand2 == 1) {
					System.out.println(rand1);
					System.out.println(rand2);
					System.out.println("Snakeyes! Each dice was a 1!");
				} else if (rand1 == 6 && rand2 ==6) {
					System.out.println(rand1);
					System.out.println(rand2);
					System.out.println("BoxCars! Each dice was a 6!");
				} else if (rand1 + rand2 == 7 || rand1 + rand2 == 11) {
					System.out.println(rand1);
					System.out.println(rand2);
					System.out.println("Craps! The two die total 7 or 11!");
				} else {
					System.out.println(rand1);
					System.out.println(rand2);
				}
				//asks and collects the re-roll information
				System.out.println("Would you like to roll the dice again? (y to continue)");
				response = scnr.next().charAt(0);
				
				//adds 1 to the rollNumber if they decide to re-roll
				if (response =='y') {
					rollNumber = rollNumber + 1;
				}
				} while (response == 'y');

		//alerts user they are leaving the program
		System.out.println("Goodbye!");
		scnr.close();
	}
}
