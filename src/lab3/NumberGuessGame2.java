package lab3;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame2 {
	static final int UPPER_BOUND = 100;
	static final int LOWER_BOUND = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random gen = new Random();
		int randNum = gen.nextInt(LOWER_BOUND, UPPER_BOUND + 1);
		System.out.println(randNum);

		System.out.printf("Guess an integer between %d and %d: ", LOWER_BOUND, UPPER_BOUND);

		int userGuessNum = scan.nextInt();

		while (randNum != userGuessNum) {
			System.out.println("Your guess was wrong, please try again: ");
			userGuessNum = scan.nextInt();
		}

        System.out.println("You guessed correctly!");

        scan.close();

	}

}