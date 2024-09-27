package Strategy.ConcreteStrategy;

import Strategy.PaymentStrategy;

public class CryptoPayment implements PaymentStrategy{
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of Rs." + amount +" to wallet address " + walletAddress);
    }
}
