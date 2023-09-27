package lab3;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random gen = new Random();
		int randNum = gen.nextInt(101);
		System.out.println(randNum);

		System.out.println("Guess an integer between 0 and 100: ");

		int userGuessNum = scan.nextInt();

		while (randNum != userGuessNum) {
			System.out.println("Your guess was wrong, please try again: ");
			userGuessNum = scan.nextInt();
		}

        System.out.println("You guessed correctly!");

        scan.close();

	}

}