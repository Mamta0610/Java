package Vanitha;

import java.util.ArrayList;
import java.util.List;

public class Orders {
	private Customer customer;
	private List<Products> products;
	
	public Orders(Customer customer) {
		this.customer = customer;
		this.products = new ArrayList<Products>();
	}
	
	public void addProduct(Products product) {
		products.add(product);
	}
	
	public double calculateTotalAmount() {
		double total =0;
		for(Products product : products){
			total+=product.getPrice();
		}return total;
	}
	
	public Customer getCustomer() {
		return customer; 
	}
	
}
