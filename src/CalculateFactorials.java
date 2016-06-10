import java.util.Scanner;

public class CalculateFactorials {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		String option = "yes";

		System.out.println("Welcome to the Factorial Calculator!");

		do {
			System.out
					.print("Enter an integer that's greater than 0 but less than 10: ");
			number = scan.nextInt();

			// ensure number is between 0 and 10 with if
			if (number > 0 && number < 10) {
				long factorial = 1;

				// loop from number down to 1 multiplying factorial by each
				// iteration of i
				for (int i = number; i > 0; i--) {
					factorial *= i;
				}

				// output factorial
				System.out.println("The factorial of " + number + " is "
						+ factorial);
				System.out.println("Continue?(y/n)");
				scan.nextLine();
				option = scan.nextLine();
			} else {
				// if number is outside of valid range - continue loop
				System.out.println("Invalid number");
				continue;
			}

		} while (Character.toLowerCase(option.charAt(0)) == ('y'));

		System.out.println("Goodbye.");
		scan.close();
	}

}
