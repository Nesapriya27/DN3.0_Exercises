public class AdapterPatternExample {
    public static void main(String[] args) {
        // Using PayPal adapter
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalPaymentGateway());
        payPalProcessor.processPayment(100.0);

        // Using Stripe adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripePaymentGateway());
        stripeProcessor.processPayment(200.0);

        // Using Square adapter
        PaymentProcessor squareProcessor = new SquareAdapter(new SquarePaymentGateway());
        squareProcessor.processPayment(300.0);
    }
}
