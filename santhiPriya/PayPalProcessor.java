package santhiPriya;

public class PayPalProcessor extends PaymentProcessor{

	@Override
	void processPayment(double amount) {
		System.out.println("Processing Paypal payment of $ " + amount);
	}

	@Override
	void refund(double amount) {
		System.out.println("Refunding Paypal payment of $ " + amount);
	}

}
