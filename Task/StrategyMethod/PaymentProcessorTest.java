import java.util.Scanner;

import Context.PaymentProcessor;
import Strategy.ConcreteStrategy.CreditCardPayment;
import Strategy.ConcreteStrategy.CryptoPayment;
import Strategy.ConcreteStrategy.PaypalPayment;

public class PaymentProcessorTest {
    public static void main(String args[]){
        PaymentProcessor processor = new PaymentProcessor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Cryptocurrency");

        int choice = scanner.nextInt();
        double amount = 100.0;

        switch (choice) {
            case 1:
                // Credit card payment
                System.out.println("Enter Credit Card number:");
                String cardNumber = scanner.next();
                processor.setPaymentStrategy(new CreditCardPayment(cardNumber));
                break;

            case 2:
                // PayPal payment
                System.out.println("Enter PayPal email:");
                String email = scanner.next();
                processor.setPaymentStrategy(new PaypalPayment(email));
                break;

            case 3:
                // Crypto payment
                System.out.println("Enter Cryptocurrency wallet address:");
                String walletAddress = scanner.next();
                processor.setPaymentStrategy(new CryptoPayment(walletAddress));
                break;

            default:
                System.out.println("Invalid payment method.");
                break;
        }

        // Process Payment
        processor.processPayment(amount);
        scanner.close();
    }
}
