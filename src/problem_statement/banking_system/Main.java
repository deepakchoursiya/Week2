package day06.problem_statement.banking_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of bank accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Add accounts to the list
        accounts.add(new SavingsAccount("SA001", "Aliya", 50000));
        accounts.add(new CurrentAccount("CA001", "Babli", 20000));

        // Process each account
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());

            // Calculate interest dynamically
            double interest = account.calculateInterest();
            System.out.println("Interest: " + interest);

            // Deposit and withdraw demonstration
            account.deposit(5000);
            account.withdraw(10000);

            // Handle loanable accounts
            if (account instanceof Loanable) {

                System.out.println("Loan Eligibility: " + ((Loanable)account).calculateLoanEligibility());
                ((Loanable)account).applyForLoan(30000);
            }

            System.out.println("-----------------------------------");
        }
    }
}
