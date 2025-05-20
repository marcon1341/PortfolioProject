public class CreditCard implements Valuable{
    private String cardNumber;
    private double creditLimit;
    private double amountOwed;

    public CreditCard(String cardNumber, double creditLimit, double amountOwed) {
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
        this.amountOwed = amountOwed;
    }

    public void charge(double amount) { amountOwed += amount; }
    public void pay(double amount) { amountOwed -= amount; }

    @Override
    public double getValue() {
        return creditLimit - amountOwed;
    }
}
