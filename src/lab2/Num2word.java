package lab2;

import java.util.Scanner;

public class Num2word {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number 0 - 9: ");
		int userInput = scan.nextInt();
//Takes user inputs and switches them to set cases
		switch (userInput) {
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;			
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("seven");
				break;
			case 8:
				System.out.println("eight");
				break;
			case 9:
				System.out.println("nine");
				break;
//Any input w/ out a set case results in this line printing
			default:
				System.out.println("This is not a valid input.");
		}
		scan.close();
	}

}
