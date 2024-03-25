public class ATM {
    private Account[] accounts = new Account[10];

    // Initialize accounts with default balance
    public ATM() {
        for (int i = 0; i < accounts.length; i++) {
            // Assuming initial balance for each account is $100
            accounts[i] = new Account(i, 100);
        }
    }

    // Method to deposit money
    public void deposit(int id, double amount) {
        if (id >= 0 && id < accounts.length) {
            accounts[id].deposit(amount);
        } else {
            System.out.println("Invalid account ID.");
        }
    }

    // Method to withdraw money
    public void withdraw(int id, double amount) {
        if (id >= 0 && id < accounts.length) {
            accounts[id].withdraw(amount);
        } else {
            System.out.println("Invalid account ID.");
        }
    }

    // Method to check balance
    public double getBalance(int id) {
        if (id >= 0 && id < accounts.length) {
            return accounts[id].getBalance();
        } else {
            System.out.println("Invalid account ID.");
            return -1;
        }
    }
}
