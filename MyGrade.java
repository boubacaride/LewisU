package LewisU.Programming;
import java.io.*;
import java.util.*;
import java.lang.*;

public class MyGrade {

	

		public static int getInput(double[][] scores){

		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter number of students: ");
		    int StudentsNum = sc.nextInt();
		    for (int i = 0; i<StudentsNum; i++){
		       for (int j = 0; j<4; j++){
		           System.out.print("Enter number " + (j+1) + " Score(0-50): ");
		           scores[i][j] = sc.nextDouble();
		       }
		       for (int j = 4; j<8; j++){
		           System.out.print("Assignment number " + (j+1) + " Score(0-75): ");
		           scores[i][j] = sc.nextDouble();
		       }

		    }
		    return StudentsNum;
		}

		public static double calculateMeanGrade(double[][] data,int StudentsNum,String[] grades){
		    double total = 0;
		    for (int i = 0; i<StudentsNum; i++){
		        double sum = 0;
		        for (int j = 0; j<8; j++){
		           sum = sum + data[i][j];
		        }
		        if (sum >= 450)
		           grades[i] = "A";
		        else if (sum >= 400 )
		           grades[i] = "B";
		        else if (sum >= 350 )
		           grades[i] = "C";
		        else if (sum >= 300 )
		           grades[i] = "D";
		        else
		           grades[i] = "F";
		        data[i][8] = sum;
		        total = total + sum;

		    }
		    return total/StudentsNum;
		}

		public static double Deviation(double data[][], int StudentsNum, double m){
		    double total = 0;
		    for (int i = 0; i<StudentsNum; i++){
		        total = total + (data[i][8]- m)*(data[i][8]- m);
		    }
		    double avg = total/StudentsNum;
		    return Math.sqrt(avg);
		}

		public static void calculateModified(double[][] data, int StudentsNum, String[] StudentGrade,double mean, double deviation){
		    for (int i =0; i<StudentsNum; i++){
		        if (data[i][8] >= (mean + 2 * deviation))
		           StudentGrade[i] = "A";
		        else if (data[i][8] >= (mean + 1 * deviation))
		           StudentGrade[i] = "B";
		        else if (data[i][8] >= mean)
		           StudentGrade[i] = "C";
		        else if (data[i][8] >= (mean - 1 * deviation))
		           StudentGrade[i] = "D";
		        else if (data[i][8] < (mean - 2 * deviation))
		           StudentGrade[i] = "F";  
		            
		    }
		  
		}

		public static void Display(double[][] data, int StudentsNum, String[] mgrades){
		    for (int i = 0; i < StudentsNum; i++)
		    {
		       System.out.println("Student " + (i+1) + " " + mgrades[i]);
		    }
		}

		public static void main(String[] args){
		       
		        double[][] scores = new double[100][9];
		        String[] grades = new String[100];
		        String[] mgrades = new String[100];
		        int StudentsNum = getInput(scores);
		        double mean = calculateMeanGrade(scores,StudentsNum,grades);
		        double stddeviation = Deviation(scores,StudentsNum,mean);
		        for (int i = 0; i< StudentsNum; i++){
		            mgrades[i] = grades[i];
		        }
		        calculateModified(scores,StudentsNum,mgrades,mean, stddeviation);
		        Display(scores,StudentsNum,mgrades);
		       
		}
		}

	