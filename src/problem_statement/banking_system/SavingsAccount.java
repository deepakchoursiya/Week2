package day06.problem_statement.banking_system;

// SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
    private static final double interestRate = 0.04; // 4% interest
    private static final double loanEligibilityFactor = 2.5; // 2.5x balance for loan

    // Constructor
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public boolean applyForLoan(double amount) {
        double eligibility = calculateLoanEligibility();
        if (amount <= eligibility) {
            System.out.println("Loan approved for amount: " + amount);
            return true;
        } else {
            System.out.println("Loan denied. Requested amount exceeds eligibility.");
            return false;
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * loanEligibilityFactor;
    }
}
