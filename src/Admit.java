//Nam Nguyen
//2/5/19
//CSE142
//TA: Khushi Chaudhari 
//Assingment #4
//
//This program compares two applicants to determine which one seems like the stronger applicant.  For each candidate I will need either SAT or ACT scores plus a weighted GPA.


import java.util.*;

public class Admit 
{
	public static void main(String[] args)
	{
		Scanner readln = new Scanner(System.in);
		System.out.println("This program compares two applicants to\r\n" + 
				"determine which one seems like the stronger\r\n" + 
				"applicant.  For each candidate I will need\r\n" + 
				"either SAT or ACT scores plus a weighted GPA.\r\n");
		System.out.println("Information for applicant #1:");
		double std1 = engScore(readln) + gpaScore(readln); 
		System.out.println("Information for applicant #2:");
		double std2 = engScore(readln) + gpaScore(readln);
		compare(std1, std2);
	}
	
	//This method decide to use ACT or SAT score
	public static double engScore(Scanner readln)
	{
		System.out.print("\tdo you have 1) SAT scores or 2) ACT scores? ");
		int i = readln.nextInt();
		if (i == 1)
			return processSAT(readln);
		else
			return processACT(readln);
	}
	
	//This method calculate SAT score
	public static double processSAT(Scanner readln)
	{
		System.out.print("\tSAT math? ");
		double sum = readln.nextInt() * 2;
		System.out.print("\tSAT critical reading? ");
		sum += readln.nextInt();
		System.out.print("\tSAT writing? ");
		sum += readln.nextInt();
		sum = round(sum / 32);
		System.out.println("\texam score = " + sum);
		return sum;
	}
	
	//This method calculate ACT score 
	public static double processACT(Scanner readln)
	{
		System.out.print("\tACT English? ");
		double sum = readln.nextInt();
		System.out.print("\tACT math? ");
		sum += readln.nextInt() * 2;
		System.out.print("\tACT reading? ");
		sum += readln.nextInt();
		System.out.print("\tACT science? ");
		sum += readln.nextInt();
		sum = round(sum / 1.8);
		System.out.println("\texam score = " + sum);
		return sum;
	}
	
	//This method round the real number to 1 decimal point
	public static double round(double x)
	{
		return ( (double) Math.round(x * 10) / 10); 
	}
	
	//This method calculate the GPA score
	public static double gpaScore(Scanner readln)
	{
		System.out.print("\toverall GPA? ");
		double gpa = readln.nextDouble();
		System.out.print("\tmax GPA? ");
		gpa = gpa / readln.nextDouble();
		System.out.print("\tTranscript Multiplier? ");
		gpa = gpa * 100 * readln.nextDouble();
		gpa = round(gpa);
		System.out.println("\tGPA score = " + gpa + "\n");
		return gpa;
	}
	
	//This method compare 2 students
	public static void compare(double a, double b)
	{
		System.out.println("First applicant overall score  = " + a);
		System.out.println("Second applicant overall score  = " + b);
		if (a > b)
			System.out.println("The first applicant seems to be better");
		else if (a < b)
				System.out.println("The second applicant seems to be better");
			 else
				 System.out.println("The two applicants seem to be equal");
	}
}
