package Strategy;

public class App {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // First checkout: Credit Card
        cart.setPaymentStrategy(new CreditCardStrategy("1234567812345678", "123"));
        cart.checkout(100);

        // Second checkout: PayPal
        cart.setPaymentStrategy(new PaypalStrategy("user@example.com"));
        cart.checkout(50);

        // Third checkout: Crypto
        cart.setPaymentStrategy(new CryptoStrategy("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout(200);
    }
}
