/*
 * Lab 1 
 * Exercise 6 : Rounding 
 */

package lab1;

//Imports scanner object.
import java.util.Scanner;

public class Rounding {

	public static void main(String[] args) {
		
	// Implements Scanner input.
	Scanner scan = new Scanner (System.in);
		
	// Prompts user to input a number.
	System.out.println("Enter a positive number to be rounded: ");
		
	// Declares and initializes variable.
	double numInput = scan.nextDouble();
		
	// Converts user's input into an integer;
	int numRounded = (int) (numInput + 0.5);
		
	// Prints out user's input rounded. 
	System.out.println("Rounded number = " + numRounded);
		
	// Error from line 14. Added this to stop scanning. 
	scan.close();

	}
}