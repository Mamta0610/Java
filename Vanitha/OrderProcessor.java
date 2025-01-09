package Vanitha;

import java.util.Map;

public class OrderProcessor {

	public void processOrder(Orders order) {
		double totalAmount = order.calculateTotalAmount();
		
		if(order.getCustomer() instanceof PremiumCustomer) {
		PremiumCustomer premiumCustomer = (PremiumCustomer) order.getCustomer();
			totalAmount = premiumCustomer.applyDiscount(totalAmount);
		}
		System.out.println("Total amount to be paid : " + totalAmount);
	}
	
	private Map<String, Products> inventory;
	
public OrderProcessor(Map<String, Products> inventory) {
	this.inventory = inventory;
}
	public void addProductToOrder(Orders order, String productId) {
		try {
			Products product = inventory.get(productId);
			if(product == null) {
				throw new InventoryException("Product not avaliable ");
			}
			order.addProduct(product);
		}catch(InventoryException e) {
			System.out.println("Error : "+ e.getMessage());
		}
	}
	
	public void completePayment(Orders order) {
		double totalAmount = order.calculateTotalAmount();
		Payment payment = new Payment(totalAmount);
		
		try {
			if(!payment.processPayment()) {
				throw new PaymentException("Payment failed for customer ");
			}
			System.out.println("Payment successful ! Order Processed");
		}catch(PaymentException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
