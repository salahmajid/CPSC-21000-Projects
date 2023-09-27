package lab2;

public class FloatEqu {

	public static void main(String[] args) {

		final double TOLERANCE = 0.000001;

		double num1 = (1.0 / 10) * (1.0 / 10);
		double num2 = (1.0 / 100);
//Takes absolute value of the difference of hard coded values;
//If-else statement to prove floating point values are never truly equal 
		if (Math.abs(num1 - num2) < TOLERANCE) {
			System.out.println("Essentially equal");
		} else {
			System.out.println("NOT EQUAL");
		}
	}

}
