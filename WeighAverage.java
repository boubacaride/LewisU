package day1.examples;

public class WeighAverage {

	public static void main(String[] args) {
		
		//Declare variables
		double testscore75 = .10;
		double testscore95 = .20;      
		double testscore85 = .25;
		double testscore55 = .25;
		double testscore65 = .10;
		double testscore70 = .10;
		double assignmentscore55_1= 0.05;
		double assignmentscore65_1 = 0.10;
		double assignmentscore65_2 = 0.15;
		double assignmentscore60 = 0.25;
		double assignmentscore55_2 = 0.25;
		double assignmentscore50 = .20;
		
		//Get the average test score
		double testscore[] = {testscore75,testscore95,testscore85,testscore55,testscore65,
				testscore70};
		double sum_test = 0; 
		
		for (double i : testscore)
			sum_test += i;
		double average_test = sum_test/5;
		System.out.println("The average test score is: "+average_test);
		
		// Get the average assignment score
		double assignmentscore[] = {assignmentscore55_1,assignmentscore65_1,assignmentscore65_2,
				assignmentscore60,assignmentscore55_2,assignmentscore50};
		double sum_assignment = 0; 
		
		for (double j : assignmentscore)
			sum_assignment += j;
		double average_assignment = sum_assignment/5;
		System.out.println("The average of the assignment scores is "+average_assignment);
		
		//Get the master average between the two weighted averages.
		System.out.println("The master average between the two weighted averages is "
				+ (average_assignment+average_test)/2);
				
		}
		}

	


