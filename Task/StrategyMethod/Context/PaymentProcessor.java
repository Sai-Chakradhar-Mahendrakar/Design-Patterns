package Context;

import Strategy.PaymentStrategy;

// Context class that uses a PaymentStrategy
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }

    // Process the payment using the selected strategy
    public void processPayment(double amount){
        if(paymentStrategy == null){
            System.out.println("No payment strategy set.");
        }
        else{
            paymentStrategy.processPayment(amount);
        }
    }
}
