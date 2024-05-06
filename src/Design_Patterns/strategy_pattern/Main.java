package Design_Patterns.strategy_pattern;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        PaymentStrategy paymentStrategy = new UPIPaymentStrategy();

        paymentProcessor.setPaymentStrategy(paymentStrategy);
        paymentProcessor.processPayment(50000);

        paymentStrategy = new CreditCardStrategy();

        paymentProcessor.setPaymentStrategy(paymentStrategy);
        paymentProcessor.processPayment(70000);
    }
}
