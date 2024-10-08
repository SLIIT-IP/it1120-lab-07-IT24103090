import java.util.Scanner;

public class IT24103090Lab7Q1B {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		for(int i=1; i<=3; i++){
			System.out.println("Student" +i);
			
			System.out.print("Enter marks :");
			
			int[] marks = new int[4];
			int sum = 0;
            for (int j = 0; j < 4; j++) {
                marks[j] = sc.nextInt();
				sum += marks[j];
            }
			
		double average = (double)sum/4;
		System.out.println("Average is :" + average);
		
		System.out.print("Overall Grade is : ");
		if (average >= 75 && average <= 100){
			System.out.println("Distinction");
		} else if (average >= 50 && average < 75){
			System.out.println("Credit");
		} else {
			System.out.println("Fail");
		}
		System.out.print("\n");
		}
	}
}