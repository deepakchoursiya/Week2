package day06.problem_statement.banking_system;

// CurrentAccount class
class CurrentAccount extends BankAccount {
    private static final double limit = 10000; // Overdraft limit for current accounts

    // Constructor
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        // No interest for current accounts
        return 0.0;
    }

    // Overriding withdraw to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount >= -limit)) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}
