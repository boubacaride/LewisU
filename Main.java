package lewisU;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner to get user input
		Scanner sc = new Scanner(System.in);

		// Get name
		System.out.print("Enter the consultants's name: ");
		String name = sc.nextLine();

		// Get hours worked
		System.out.print("Enter the hours worked: ");
		double hours = sc.nextDouble();

		// Get special hour worked
		System.out.print("Have you worked for a special session (Y or N)?  ");
		char response = sc.next().charAt(0);

		double specialHours = 0;

		if (response == 'y') {
			System.out.print("Please enter special hours worked ");
			specialHours = sc.nextDouble();
		}

		// Close scanner
		sc.close();

		// Split name into first and last name
		String[] nameSplit = name.split(" ");

		// Create PaidAdvisor object
		PaidAdvisor consultant = new PaidAdvisor(nameSplit[0], nameSplit[1], hours, specialHours);

		consultant.calculatePay();

		// Print consultant details
		System.out.println(consultant);

	}

}
