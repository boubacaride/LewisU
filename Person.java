package me2;

import java.util.Scanner;

public class Person {

	// Attributes
	private String firstName;
	private String lastName;

	/**
	 * Default constructor
	 */
	public Person() {
		this.firstName = "";
		this.lastName = "";
	}

	/**
	 * Parameterized constructor
	 *
	 * @param first
	 * @param last
	 */
	public Person(String first, String last) {
		setName(first, last);
	}

	public String toString() {
		return (firstName + " " + lastName);
	}

	public void setName(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;

	}
}

class PaidAdvisor extends Person {

	// Attributes
	private double regularPayRate;
	private double overtimePayRate;
	private double hoursWorked;
	private double specialPayRate;
	private double specialHours;
	private double totalWages;
	final private double REGULAR_HOURS = 30;

	/**
	 * Default constructor
	 */
	public PaidAdvisor() {

	}

	/**
	 * Constructor
	 *
	 * first last hoursWorked specialHours
	 * 
	 */
	public PaidAdvisor(String first, String last, double hoursWorked, double specialHours) {
		this(first, last);
		this.regularPayRate = 25;
		this.overtimePayRate = (this.regularPayRate + (this.regularPayRate / 2));
		this.hoursWorked = hoursWorked;
		this.specialPayRate = 50;
		this.specialHours = specialHours;

	}

	/**
	 * Constructor
	 *
	 * @param regularPayRate
	 * @param hoursWorked
	 */
	public PaidAdvisor(String firstName, String lastName) {
		super(firstName, lastName);

	}

	/**
	 * @return the regularPayRate
	 */
	public double getPayRate() {
		return this.regularPayRate;
	}

	/**
	 * @return the hoursWorked
	 */
	public double getHoursWorked() {
		return this.hoursWorked;
	}

	/**
	 * Sets the name, PayRates, hours worked, and specialHours
	 *
	 * firstName lastName regularPayRate overtimePayRate hoursWorked
	 */
	public void setNameRateHours(String firstName, String lastName, float regularPayRate, float hoursWorked) {
		setName(firstName, lastName);
		this.regularPayRate = regularPayRate;
		this.overtimePayRate = (this.regularPayRate + (this.regularPayRate / 2));
		this.hoursWorked = hoursWorked;
		this.specialHours = specialHours;
	}

	/**
	 * Calculates the multiplication of the pay rate (the regular pay rate and the
	 * overtime pay rate, and special rate) and the hours worked
	 *
	 * @return
	 */
	public double calculatePay() {

		if (this.hoursWorked <= REGULAR_HOURS)

			totalWages = this.regularPayRate * this.hoursWorked;
		else if (specialHours > 0)
			totalWages = (this.specialHours * specialPayRate) + (this.regularPayRate * REGULAR_HOURS)
					+ this.overtimePayRate * (this.hoursWorked - REGULAR_HOURS - specialHours);
		else
			totalWages = (this.regularPayRate * REGULAR_HOURS)
					+ this.overtimePayRate * (this.hoursWorked - REGULAR_HOURS);

		return totalWages;
	}

	@Override
	public String toString() {
		return "PaidAdvisor " + super.toString() + "\nPay Rate:	$" + this.regularPayRate + "/hour" + "\nSpecial Rate: $"
				+ this.specialPayRate + "/hour" +

				"\nHours Worked:	" + this.hoursWorked + "\nSpecial Hours Worked: " + this.specialHours
				+ "\nTotal Wages:	$" + totalWages;
	}
}

class Test {

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
