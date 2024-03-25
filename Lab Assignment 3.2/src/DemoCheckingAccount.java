
import java.time.LocalDate;

public class DemoCheckingAccount {
    public static void main(String[] args) {
        CheckingAccount[] CheckingAccountArray = new CheckingAccount[2];

        // Create using no-arg constructor and set properties
        CheckingAccount acc1 = new CheckingAccount();
        acc1.setAccNo(1);
        acc1.setLastName("Doe");
        acc1.setFirstName("John");
        acc1.setAccBalance(500);
        acc1.setMonthlyFee(10);
        acc1.setMinBalance(50);
        CheckingAccountArray[0] = acc1;

        // Create using parameterized constructor
        CheckingAccount acc2 = new CheckingAccount(2, "Smith", "Jane", 1000, 15, 100, LocalDate.now());
        CheckingAccountArray[1] = acc2;

        // Display accounts
        for (CheckingAccount acc : CheckingAccountArray) {
            System.out.println(acc);
        }

        // Demonstrate deposit and withdrawal
        acc1.deposit(200);
        System.out.println("After deposit: " + acc1.getBalance());
        acc1.withdraw(100);
        System.out.println("After withdrawal: " + acc1.getBalance());
    }
}
