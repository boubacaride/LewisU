package LewisU.Programming;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		int GoingFloor, MyPosition;
		int ChoiceToOperat;
		int ElevatorPosition = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("1. To operate the elevator");
			System.out.println("2. To quit");

			if (ElevatorPosition == 0)
				System.out.println("The elevetor is at basement");

			else {
				System.out.println("The elevator is at floor " + ElevatorPosition);
			}
			System.out.print("Please make your selection: ");
			ChoiceToOperat = Integer.parseInt(sc.nextLine());

			if (ChoiceToOperat == 2) {
				break;

			}
			if (ChoiceToOperat == 1) {
				System.out.print("Please enter your floor: "); // 0- Basement
				MyPosition = Integer.parseInt(sc.nextLine());
				int valid = 0;
				System.out.print("Please enter which floor you want to go: ");
				GoingFloor = Integer.parseInt(sc.nextLine());

				if (ElevatorPosition == 0)
					System.out.println("The elevetor is at basement");

				else {
					System.out.println("The elevtor is at floor " + ElevatorPosition);
				}

				if (ElevatorPosition == MyPosition) {
					System.out.println("The Elevator(E) is now open 'O'");

					if (GoingFloor > ElevatorPosition) {
						System.out.println("The Elevator(E) is U");
						System.out.println("The Elevator(E) is now at " + GoingFloor);
						ElevatorPosition = GoingFloor;

					}
					if (GoingFloor < ElevatorPosition) {
						System.out.println("The Elevator(E) is D");
						System.out.println("The Elevator(E) is now at " + GoingFloor);
						ElevatorPosition = GoingFloor;
					}
				}

				else {
					if (MyPosition > ElevatorPosition) {
						System.out.println("The Elevator(E) is U");
						System.out.println("The Elevator(E) is now at " + MyPosition);
						System.out.println("The Elevator(E) is now open 'O'");
						System.out.println("The Elevator(E) is now close 'C'");
						ElevatorPosition = MyPosition;

						if (GoingFloor > ElevatorPosition) {
							System.out.println("The Elevator(E) is U");
							System.out.println("The Elevator(E) is now at " + GoingFloor);
							System.out.println("The Elevator(E) is open 'O' ");
							System.out.println("The Elevator(E) is close 'C'");
							ElevatorPosition = GoingFloor;

						}

						if (GoingFloor < ElevatorPosition) {
							System.out.println("The Elevator(E) is D");
							System.out.println("The Elevator(E) is now at " + GoingFloor);
							System.out.println("The Elevator(E) is open 'O' ");
							System.out.println("The Elevator(E) is close 'C'");
							ElevatorPosition = GoingFloor;
						}
					}
				}
			}
		}
	}

}
