package Vanitha;
//inherit customer base class

public class PremiumCustomer extends Customer{
	
	private double discountRate;

	public PremiumCustomer(String name, String email, long phone, double discountRate) {
		super(name, email, phone);
		this.discountRate = discountRate;
	}
	
	public String getName() {
		return "Premium " + super.getName();
	}
	
	public double applyDiscount(double totalAmount) {
		return totalAmount-(totalAmount*discountRate);
	}
}
