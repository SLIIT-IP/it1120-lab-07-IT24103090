import java.util.Scanner;

public class IT24103090Lab7Q1A {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter marks for four subjects :");
		System.out.print("Enter Subject mark 1: ");
		double subject1 = sc.nextDouble();
		System.out.print("Enter Subject mark 2: ");
		double subject2 = sc.nextDouble();
		System.out.print("Enter Subject mark 3: ");
		double subject3 = sc.nextDouble();
		System.out.print("Enter Subject mark 4: ");
		double subject4 = sc.nextDouble();
		
		double average = (double)(subject1 + subject2 + subject3 + subject4)/ 4;
		System.out.println("Average is :" + average);
		
		System.out.print("Overall Grade is : ");
		if (average >= 75 && average <= 100){
			System.out.print("Distinction");
		} else if (average >= 50 && average < 75){
			System.out.print("Credit");
		} else {
			System.out.print("Fail");
		}
	}
}