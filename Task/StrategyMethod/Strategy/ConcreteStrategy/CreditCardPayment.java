package Strategy.ConcreteStrategy;

import Strategy.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;

    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of Rs."+ amount + " using card number "+ cardNumber);
    }
}
