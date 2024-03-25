import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0; // Assume this is a percentage, e.g., 4.5 for 4.5%
    private Date dateCreated;

    // No-arg constructor
    public Account() {
        dateCreated = new Date();
    }

    // Constructor with specified id and balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    // Accessors (getters)
    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    // Mutators (setters)
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Method to return the monthly interest rate
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    // Method to return the monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Method to withdraw a specified amount
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    // Method to deposit a specified amount
    public void deposit(double amount) {
        this.balance += amount;
    }
}
