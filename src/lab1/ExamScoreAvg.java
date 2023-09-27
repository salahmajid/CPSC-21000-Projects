/*
 * Lab 1
 * Exercise 4: Calculating average of user input 
 */

package lab1;

// Imports scanner object.
import java.util.Scanner;

public class ExamScoreAvg {

	public static void main(String[] args) {
	
	// Implements Scanner input
	Scanner scan = new Scanner(System.in);
			
	// Prompts user to input exam score.
	System.out.print("Enter the first exam score: ");
		
	// Declaration and Initialization of a variable; exam scores.
	double examscore1 = scan.nextDouble();
		
	System.out.print("Enter the second exam score: ");
	double examscore2 = scan.nextDouble();
		
	System.out.print("Enter the third exam score: ");
	double examscore3 = scan.nextDouble();
		
	// Calculates the inputs from the user. 
	double examscoreavg = (examscore1 + examscore2 + examscore3) / 3;
				
	// Prints the average of all numbers that were input. 
	System.out.println("Exam AVG = " + examscoreavg);
		
	// There was a warning on line 14, so I added this to close the scanner. 
	scan.close();
	}
	
}