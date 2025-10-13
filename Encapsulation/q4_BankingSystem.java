
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getBalance() { return balance; }
    protected void setBalance(double balance) { this.balance = balance; }
    public void deposit(double amount) {
        if (amount > 0) setBalance(getBalance() + amount);
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }

    public abstract double calculateInterest();
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; 

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100.0);
    }

    @Override
    public boolean applyForLoan(double amount) {
        return getBalance() >= 0.2 * amount;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; 
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= overdraftLimit * 10;
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit;
    }
}

public class q4_BankingSystem {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount("SA-001", "humanSam", 10000, 4.0);
        BankAccount ca = new CurrentAccount("CA-002", "humanCora", 2000, 5000);

        BankAccount[] accounts = { sa, ca };
        for (BankAccount a : accounts) {
            System.out.println("Account: " + a.getAccountNumber() + " Holder: " + a.getHolderName());
            System.out.println("Balance: " + a.getBalance() + " Interest: " + a.calculateInterest());
            if (a instanceof Loanable) {
                Loanable L = (Loanable) a;
                System.out.println("Loan Eligibility amount (approx): " + L.calculateLoanEligibility());
            }
            System.out.println("-----");
        }
    }
}
