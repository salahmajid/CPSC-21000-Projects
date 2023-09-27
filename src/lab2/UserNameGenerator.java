package lab2;

import java.util.Random;
import java.util.Scanner;

public class UserNameGenerator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random gen = new Random();

		System.out.println("Please enter your first name: ");
		String firstInput = scan.next();

		System.out.println("Please enter your last name: ");
		String lastInput = scan.next();

		int randNum = gen.nextInt(90) + 10;
//Concatenates the variables; substring takes first four characters; charAt takes first character
		String userName = lastInput.substring(0, 4) + firstInput.charAt(0) + randNum;

		System.out.println("Your username is: " + userName);

		scan.close();

	}

}