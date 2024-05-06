package Design_Patterns.strategy_pattern;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;

    public PaymentProcessor() {
        paymentStrategy = null;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        if(this.paymentStrategy != null){
            this.paymentStrategy = null;
        }
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if(paymentStrategy != null){
            paymentStrategy.processPayment(amount);
        }
        else {
            System.out.println("PaymentStrategy not selected");
        }
    }

}
