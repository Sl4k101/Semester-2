//Matthew Cheung Assignment 3.2 class: data structures and OOP.
//Date: mon Feb 12 2024 Teacher Istiaque Shariar.

import java.time.LocalDate;

public class CheckingAccount {
    private int accNo = 0;
    private String lastName = "lastName";
    private String firstName = "firstName";
    private double accBalance = 0.0;
    private double monthlyFee = 0.0;
    private double minBalance = 10.0;
    private LocalDate dateCreated = LocalDate.now();

    public CheckingAccount() {
    }

    public CheckingAccount(int accNo, String lastName, String firstName, double accBalance, double monthlyFee,
            double minBalance, LocalDate dateCreated) {
        this.accNo = accNo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.accBalance = accBalance;
        this.monthlyFee = monthlyFee;
        this.minBalance = minBalance;
        this.dateCreated = dateCreated;
    }

    // Accessors and Mutators
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void applyMonthlyFee() {
        accBalance -= monthlyFee;
    }

    public double getBalance() {
        return accBalance;
    }

    public void withdraw(double amount) {
        if (accBalance - amount < minBalance) {
            System.out.println("Withdrawal cancelled. Insufficient funds to maintain the minimum balance.");
        } else {
            accBalance -= amount;
        }
    }

    public void deposit(double amount) {
        accBalance += amount;
    }

    public String toString() {
        return String.format("Account Number: %d, Name: %s %s, Balance: %.2f", accNo, firstName, lastName, accBalance);
    }
}
