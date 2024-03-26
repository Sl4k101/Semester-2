package Q1;
import java.util.Scanner;

public class LoanTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        // Use the defaults if the user inputs non-positive values
        if (annualInterestRate <= 0) annualInterestRate = 2.5;
        if (numberOfYears <= 0) numberOfYears = 1;
        if (loanAmount <= 0) loanAmount = 1000;

        try {
            Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
            System.out.println("The loan was created on " + loan.getLoanDate());
            System.out.println("The monthly payment is " + loan.getMonthlyPayment());
            System.out.println("The total payment is " + loan.getTotalPayment());
        } catch (IllegalArgumentException ex) {
            System.err.println("Cannot create a loan: " + ex.getMessage());
        }
        
        input.close();
    }
}
