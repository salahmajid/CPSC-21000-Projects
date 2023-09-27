/*
 * Lab 2
 * Exercise 1: Number Guessing Game
 */

package lab2;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an integer between 0 and 100: ");

		Random gen = new Random();
		
		int randNum = gen.nextInt(101);
		System.out.println(randNum);

		int userGuessNum = scan.nextInt();
//if-statement to determine of user guessed the pseudo-random number that was generated
		if (randNum == userGuessNum) {
			System.out.println("You guessed correctly!");
		} 
//if anything other than the correct answer is input by the user then it prints this line
		else {
			System.out.println("You guessed incorrectly...");
		}
		scan.close();
	}

}
