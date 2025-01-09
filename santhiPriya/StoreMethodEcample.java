package santhiPriya;

public class StoreMethodEcample {
	
	//default method
	void details() {
		System.out.println("Store sells all items used in kitchen ");
	}
	
	static void productDetails() {
		System.out.println("Products avaliable : Fruits, vegetables, pulses etc ");
	}
	//parameters method 
	 double calculateTotalCost(double price, int quantity) {
		return  price * quantity;
	}
	public static void main(String[] args) {
		StoreMethodEcample sm = new StoreMethodEcample(); //object creation
		sm.details(); //call default method
		System.out.println("Total price of fruit : " + sm.calculateTotalCost(100.56, 2)); //calls parameterized method
		
		StoreMethodEcample.productDetails(); //calls static method
	}

}
