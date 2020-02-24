import java.util.Random;

public class problem1 {

	public static void main(String[] args) {
		Random rand = new Random();

		int steps = 0;
		int tries = 0;

		while (steps != 6) {
			int number = rand.nextInt(2);
			if (number == 0) {// go down
				steps = 0;
				tries++;
			} else {//go up
				steps++;
			}

		}
		System.out.println("The ant fell for " + tries + " tries ");
	}

}
