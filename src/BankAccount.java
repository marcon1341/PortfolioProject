public class BankAccount implements Valuable{
    private String accountNumber;
    private double balance;
    private double debt;

    public BankAccount(String accountNumber, double balance, double debt) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.debt = debt;
    }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }

    @Override
    public double getValue() {
        return balance - debt;
    }
}

