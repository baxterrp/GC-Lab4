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
			if (number > 0 && number < 10) {
				long factorial = 1;

				for (int i = number; i > 0; i--) {
					factorial *= i;
				}

				System.out.println("The factorial of " + number + " is "
						+ factorial);
				System.out.println("Continue?(y/n)");
				scan.nextLine();
				option = scan.nextLine();
			} else {
				System.out.println("Invalid number");
				continue;
			}

		} while (Character.toLowerCase(option.charAt(0)) == ('y'));

		System.out.println("Goodbye.");
		scan.close();
	}

}
