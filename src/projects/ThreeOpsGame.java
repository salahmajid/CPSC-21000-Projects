/* 
 * Salah Abdelmajid
 * Programming Fundamentals
 * Fall 2023
 * Programming Assignment 1
 * 
 */

package projects;

import java.util.Scanner;
import java.util.Random;

public class ThreeOpsGame {
	// Sets multiplication & addition to constants
	static final String MULT = "*";
	static final String ADD = "+";
	static final String OP_PROMPT = "Select an operation (+ or *): ";

	public static void main(String[] args) {
		
        System.out.println("Programming Fundamentals");
        System.out.println("Name: Salah Abdelmajid");
        System.out.println("PROGRAMMING ASSIGNMENT 1\n");
        
		Scanner scan = new Scanner(System.in);
		Random gen = new Random();
		
		// Final score goal
		int numWin = 10001;

		// Generates random numbers needed
		int randNum1 = gen.nextInt(100);
		int randNum2 = gen.nextInt(100);
		int randNum3 = gen.nextInt(100);
		int randNum4 = gen.nextInt(100);
		
		// Score counter
		int currScore = 0;

		System.out.println("Select three operations on the randomly generated numbers"
				+ " so that the result will be as close as possible to 10001 without going over.\n");

		System.out.println("First number is: " + randNum1 + "\n");

		System.out.print(OP_PROMPT);

		// Takes first input; Calculates initial score
		String firstInput = scan.next();
		switch (firstInput) {
		case MULT:
			currScore = randNum1 * randNum2;
			break;
		case ADD:
			currScore = randNum1 + randNum2;
			break;
		default:
			System.out.println("Invalid input. Closing...");
			System.exit(1);
		}

		System.out.println("Second number is: " + randNum2);
		System.out.println("Result so far is " + currScore + "\n");
		System.out.print(OP_PROMPT);

		// Takes second input; Calculates second score/total score so far
		String secondInput = scan.next();
		switch (secondInput) {
		case MULT:
			currScore *= randNum3;
			break;
		case ADD:
			currScore += randNum3;
			break;
		default:
			System.out.println("Invalid input. Closing...");
			System.exit(1);
		}

		System.out.println("Third number is: " + randNum3);
		System.out.println("Result so far is " + currScore + "\n");
		System.out.print(OP_PROMPT);

		String thirdInput = scan.next();
		switch (thirdInput) {
		case MULT:
			currScore *= randNum4;
			break;
		case ADD:
			currScore += randNum4;
			break;
		default:
			System.out.println("Invalid input. Closing...");
			System.exit(1);
			break;
		}

		System.out.println("Fourth number is: " + randNum4);
		
		// Print format to print final result
		System.out.printf("\nFinal result is %d %s %d %s %d %s %d = %d\n\n", randNum1, firstInput, randNum2, secondInput,
				randNum3, thirdInput, randNum4, currScore);

		// If-statements to determine player's results
		if (currScore > numWin) {
			System.out.print("Your result went over 10001 - you lost!");
		} else if (currScore == numWin) {
			System.out.print("You got it. Congratulations!");
		} else if (currScore >= 9000) {
			System.out.print("You were very close!");
		} else if (currScore >= 5000) {
			System.out.print("You were close!");
		} else {
			System.out.print("Your result was low. Try again.");
		}
		scan.close();

	}
}