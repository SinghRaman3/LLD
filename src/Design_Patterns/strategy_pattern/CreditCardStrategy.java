package Design_Patterns.strategy_pattern;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of " + amount + " processed via credit card");
    }
}
