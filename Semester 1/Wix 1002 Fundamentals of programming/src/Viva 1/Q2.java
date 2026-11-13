
import java.util.Scanner;

public class Q2{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // PART 1: Declare variables

        double balance;
        double annualRate;
        double rate;
        double payment;

        double interest;
        double minimum;

        double totalInterest = 0;
        double totalFees = 0;
        double totalPaid = 0;

        int raisedMonths = 0;
        int holidayMonth = 0;

        char choice;

        double[] yearlyBalance = new double[3];

        // PART 2: Get user inputs

        do {
            System.out.print("Enter outstanding balance (RM): ");
            balance = input.nextDouble();

            if (balance < 500 || balance > 50000) {
                System.out.println("Invalid balance! Enter RM 500 - RM 50000.");
            }

        } while (balance < 500 || balance > 50000);

        System.out.print("Enter annual interest rate (%): ");
        annualRate = input.nextDouble();

        rate = annualRate / (100 * 12);

        System.out.print("Enter planned monthly payment (RM): ");
        payment = input.nextDouble();

        System.out.print("Take a payment holiday? (Y/N): ");
        choice = input.next().charAt(0);

        if (choice == 'Y' || choice == 'y') {

            do {
                System.out.print("Enter holiday month (1-36): ");
                holidayMonth = input.nextInt();

                if (holidayMonth < 1 || holidayMonth > 36) {
                    System.out.println("Invalid month!");
                }

            } while (holidayMonth < 1 || holidayMonth > 36);
        }

        // PART 3: Simulate each month

        for (int month = 1; month <= 36; month++) {

            // Step 1: Add interest

            interest = balance * rate;

            balance = balance + interest;

            totalInterest = totalInterest + interest;

            // Step 2: Check payment holiday

            if (month == holidayMonth) {

                balance = balance + 25;

                totalFees = totalFees + 25;

                System.out.printf(
                    "Month %d: Payment holiday - late fee RM 25.00 charged.%n",
                    month
                );

            } else {

                // Step 3: Calculate minimum payment

                minimum = Math.max(balance * 0.05, 50);

                double actualPayment = payment;

                if (actualPayment < minimum) {

                    actualPayment = minimum;

                    raisedMonths++;
                }

                // Step 4: Never pay more than balance

                if (actualPayment > balance) {
                    actualPayment = balance;
                }

                // Step 5: Make payment

                balance = balance - actualPayment;

                totalPaid = totalPaid + actualPayment;
            }

            // Step 6: Check whether debt is cleared

            if (balance < 0.005) {

                balance = 0;

                System.out.println(
                    "Debt fully cleared in Month " + month + "!"
                );

                break;
            }

            // Step 7: Store yearly balances

            if (month == 12) {
                yearlyBalance[0] = balance;
            }

            if (month == 24) {
                yearlyBalance[1] = balance;
            }

            if (month == 36) {
                yearlyBalance[2] = balance;
            }
        }

        // PART 4: Display final results

        System.out.printf("End of Year 1 Balance: RM %.2f%n",
                yearlyBalance[0]);

        System.out.printf("End of Year 2 Balance: RM %.2f%n",
                yearlyBalance[1]);

        System.out.printf("End of Year 3 Balance: RM %.2f%n",
                yearlyBalance[2]);

        System.out.printf("Total Interest Charged: RM %.2f%n",
                totalInterest);

        System.out.printf("Total Late Fees: RM %.2f%n",
                totalFees);

        System.out.printf("Total Amount Paid: RM %.2f%n",
                totalPaid);

        System.out.println("Months Raised to Minimum Payment: "
                + raisedMonths);

        if (balance > 0) {
            System.out.println("Debt not cleared after 36 months.");
        }

        input.close();
    }
}
