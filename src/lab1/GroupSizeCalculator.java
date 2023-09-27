/*
 * Lab 1
 * Exercise 5: Group Calculator
 */

package lab1;

// Imports scanner object.
import java.util.Scanner;

public class GroupSizeCalculator {

	public static void main(String[] args) {
	
	// Implements Scanner input. 
	Scanner scan = new Scanner(System.in);	
	
	// Declares and initializes user input variables and prompts user to input.
	System.out.println("Enter the number of students: ");
	int numStudents = scan.nextInt();
	System.out.println("Enter the number of groups: ");
	int numGroups = scan.nextInt();
	
	// Declares and initializes calculation variables for user's inputs.
	int numquotient; 
	numquotient = numStudents / numGroups;
	int numremainder; 
	numremainder = numStudents % numGroups;

	// Prints results of calculating user's inputs.
	System.out.println("Number of students per group = " + numquotient);
	System.out.println("Remaining number of students = " + numremainder);
	
	// Error from line 15. This is the fix to stop scanning in the program. 
	scan.close();
	
	}

}