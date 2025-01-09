package santhiPriya;
//abstraction
abstract public class PaymentMethod {
	
	protected double amount;

	public PaymentMethod(double amount) {
		this.amount = amount;
	}
	
	abstract public void processPayment();
}
