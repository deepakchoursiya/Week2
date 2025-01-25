package day06.problem_statement.banking_system;

// Interface Loanable
interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}
