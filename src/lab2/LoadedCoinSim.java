package lab2;

import java.util.Random;

public class LoadedCoinSim {

	public static void main(String[] args) {
		Random gen = new Random();

//"final" ensures that constant can't be changed
		final double HEAD_PROB = 0.75;

		int headCount = 0;

		int i = 0;
//Implemented ++i to reduce amount of time it takes to manually change the numbers
		if (gen.nextDouble() < HEAD_PROB) {
			System.out.println("Toss " + ++i + ": Heads");
			headCount++;
		} else {
			System.out.println("Toss " + ++i + ": Tails");
		}

		if (gen.nextDouble() < HEAD_PROB) {
			System.out.println("Toss " + ++i + ": Heads");
			headCount++;
		} else {
			System.out.println("Toss " + ++i + ": Tails");
		}

		if (gen.nextDouble() < HEAD_PROB) {
			System.out.println("Toss " + ++i + ": Heads");
			headCount++;
		} else {
			System.out.println("Toss " + ++i + ": Tails");
		}

		if (gen.nextDouble() < HEAD_PROB) {
			System.out.println("Toss " + ++i + ": Heads");
			headCount++;
		} else {
			System.out.println("Toss " + ++i + ": Tails");
		}

		if (gen.nextDouble() < HEAD_PROB) {
			System.out.println("Toss " + ++i + ": Heads");
			headCount++;
		} else {
			System.out.println("Toss " + ++i + ": Tails");
		}

		if (gen.nextDouble() < HEAD_PROB) {
			System.out.println("Toss " + ++i + ": Heads");
			headCount++;
		} else {
			System.out.println("Toss " + ++i + ": Tails");
		}

		if (gen.nextDouble() < HEAD_PROB) {
			System.out.println("Toss " + ++i + ": Heads");
			headCount++;
		} else {
			System.out.println("Toss " + ++i + ": Tails");
		}

		if (gen.nextDouble() < HEAD_PROB) {
			System.out.println("Toss " + ++i + ": Heads");
			headCount++;
		} else {
			System.out.println("Toss " + ++i + ": Tails");
		}

		if (gen.nextDouble() < HEAD_PROB) {
			System.out.println("Toss " + ++i + ": Heads");
			headCount++;
		} else {
			System.out.println("Toss " + ++i + ": Tails");
		}

		if (gen.nextDouble() < HEAD_PROB) {
			System.out.println("Toss " + ++i + ": Heads");
			headCount++;
		} else {
			System.out.println("Toss " + ++i + ": Tails");
		}
		System.out.println("Number of heads: " + headCount);
	}

}
