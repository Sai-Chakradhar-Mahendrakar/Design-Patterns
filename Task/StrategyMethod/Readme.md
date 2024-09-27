# Strategy Design Pattern - Payment Processing System

## Problem Statement

You are tasked with designing a **payment processing system** that allows users to choose between multiple payment methods. Different customers may want to pay using different methods, and the system should be able to accommodate that dynamically. The payment options include:

1. **Credit Card**
2. **PayPal**
3. **Cryptocurrency**

The payment method should be **selectable at runtime**, and each method should have its **own way** of processing payments.

## Requirements

1. **Strategy Interface:**
   - Create a `PaymentStrategy` interface that declares a method `processPayment(double amount)` for processing payments.

2. **Concrete Payment Strategies:**
   - Implement three concrete strategies:
     - **CreditCardPayment**: Simulates processing payments using a credit card.
     - **PayPalPayment**: Simulates processing payments via PayPal.
     - **CryptoPayment**: Simulates payment processing through cryptocurrency.

3. **Context Class:**
   - Create a `PaymentProcessor` class (the **Context**) that allows setting and changing the payment strategy at runtime. This class should be able to invoke the appropriate `processPayment()` method based on the selected strategy.

4. **Strategy Selection:**
   - Implement a mechanism where users can dynamically select the payment method at runtime.
   - The system should handle invalid or unsupported payment method choices by providing appropriate feedback.

5. **Testing:**
   - Test the system by simulating multiple payment scenarios. Ensure that different payment methods can be selected, switched, and processed without restarting the system.

## Optional Features

- **New Payment Methods:**  
  Allow easy addition of new payment strategies, such as bank transfer or cash on delivery.

- **Discount Handling:**  
  Extend the system by adding a separate discount strategy (e.g., percentage discount or fixed amount discount) that can work alongside the payment strategies.

- **Invalid Payment Handling:**  
  Implement error handling for invalid or unavailable payment methods, giving proper feedback to the user.

## Deliverables

1. **Strategy Interface:** A `PaymentStrategy` interface for defining the payment method.
2. **Concrete Strategies:** At least three classes implementing different payment methods (`CreditCardPayment`, `PayPalPayment`, `CryptoPayment`).
3. **Context Class:** A `PaymentProcessor` class that can switch between strategies and process payments.
4. **Test Cases:** Example scenarios to test multiple payment methods.
