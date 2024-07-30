public class StrategyPatternExample {
    public static void main(String[] args) {
        // Creating a payment context with CreditCardPayment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123");
        PaymentContext context = new PaymentContext(creditCardPayment);
        context.executePayment(100.0);

        // Creating a payment context with PayPalPayment strategy
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password123");
        context = new PaymentContext(payPalPayment);
        context.executePayment(200.0);
    }
}
