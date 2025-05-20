import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("Net Worth", "Jhon");
//        fixed asset
        portfolio.add(new House("Family Home", 400000, 2000, 2900, 5));
        portfolio.add(new Jewelry("Diamond", 2000, 21));
        portfolio.add(new Gold("Bar", 1300, 1.8));

//        liquid asset
        portfolio.add(new BankAccount("23433", 23000, 2300));
        portfolio.add(new CreditCard("4564 6787 67947 7678", 5000, 300));

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Portfolio total value: " + currency.format(portfolio.getValue()));
    }

}
