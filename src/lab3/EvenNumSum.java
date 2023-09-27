package lab3;

import java.util.Scanner;

public class EvenNumSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInput;
		int numSum = 0;

		do {
			System.out.print("Enter an integer greater than one: ");
			userInput = scan.nextInt();
			if (userInput <= 1) {
				System.out.println("Incorrect input!");
			}
		}  while (userInput <= 1);

		for (int i = 2; i <= userInput; i += 2) {
			numSum += i;
		}
		System.out.printf("Sum of even integers from 2 to %d = %d",userInput, numSum);
	}

}
