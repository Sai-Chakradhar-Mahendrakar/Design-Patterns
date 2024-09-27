package Strategy.ConcreteStrategy;

import Strategy.PaymentStrategy;

public class PaypalPayment implements PaymentStrategy{
    private String email;

    public PaypalPayment(String email){
        this.email=email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment of Rs." + amount + " using Paypal email "+ email);
    }
    
}
