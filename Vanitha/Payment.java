package Vanitha;

public class Payment {
	
	private double amount;

	public Payment(double amount) {
		this.amount = amount;
	}
	
	public boolean processPayment() {
		if(amount >0) {
			return true;
		}
		return false;
	}
}
