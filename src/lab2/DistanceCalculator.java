/*
 * Lab 2
 * Exercise 2: Distance Calculator
 */

package lab2;

import java.util.Scanner;

import java.text.DecimalFormat;

public class DistanceCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the value for x1: ");
		double x1 = scan.nextDouble();

		System.out.println("Please enter the value for x2: ");
		double x2 = scan.nextDouble();

		System.out.println("Please enter the value for y1: ");
		double y1 = scan.nextDouble();

		System.out.println("Please enter the value for y2: ");
		double y2 = scan.nextDouble();
		// Adds then square roots the inputs to calculate the distance
		double dist = Math.sqrt(Math.pow(y1-y2, 2) + Math.pow(x1-x2, 2));
		// Implements decimal format of the calculated number
		DecimalFormat fmt = new DecimalFormat("0.###");
		// This takes the calculated distance and formats it to the set format from the line above
		fmt.format(dist);

		System.out.print(fmt.format(dist));
		
		scan.close();

	}

}
