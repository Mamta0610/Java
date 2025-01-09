package santhiPriya;
//encapsulation

public class Product {
	//private data members
	private int productId;
	private String productName;
	private double price;
	private int quantityStock;
	
	//parameterized constructor
	public Product(int productId, String productName, double price, int quantityStock) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityStock = quantityStock;
	}

	//getter-setter method
	public String getProductDetails() {
		return "productId : " + productId + " productName :" +productName+
				" price : "+ price+ " quantityStock :" + quantityStock;
	}
	
	public void updatePrice(double newPrice) {
		if(newPrice>0) {
			this.price=newPrice;
		}
	}
	public void updateStock(int quantity) {
		if(quantity>0) {
			this.quantityStock=quantity;
		}
	}
	
}
