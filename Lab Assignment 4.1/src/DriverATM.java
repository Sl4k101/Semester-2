import java.util.Scanner;

public class DriverATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATM atm = new ATM();

        while (true) {
            System.out.println("Enter an id: ");
            int id = input.nextInt();

            if (id < 0 || id >= 10) {
                System.out.println("Please enter a valid id.");
                continue;
            }

            int choice;
            do {
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1: // Check balance
                        System.out.println("The balance is " + atm.getBalance(id));
                        break;
                    case 2: // Withdraw
                        System.out.print("Enter an amount to withdraw: ");
                        double withdrawAmount = input.nextDouble();
                        atm.withdraw(id, withdrawAmount);
                        break;
                    case 3: // Deposit
                        System.out.print("Enter an amount to deposit: ");
                        double depositAmount = input.nextDouble();
                        atm.deposit(id, depositAmount);
                        break;
                    case 4: // Exit
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter again.");
                }
            } while (choice != 4);
        }
    }
}