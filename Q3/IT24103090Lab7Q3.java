import java.util.Scanner;

public class IT24103090Lab7Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
			System.out.print("Enter total bill amount : ");
            double totalBill = sc.nextDouble();

            System.out.print("Enter mode of payment (C for Cash, O for Other): ");
            char paymentMode = sc.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = totalBill * 0.05;
                double finalAmount = totalBill - discount;
				System.out.println("Discount is :" +discount);
                System.out.println("Amount to be paid : " +finalAmount);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applied");
				System.out.println("Amount to be paid: " +totalBill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
		System.out.println("\n");
        }
    }
}
