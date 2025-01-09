package Vanitha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineShoppingSystem {
	public static void main(String[] args) {
		List<Products> producList = new ArrayList<Products>();
		producList.add(new Products("laptop", 65000));
		producList.add(new Products("phone", 55000));
		producList.add(new Products("earphone", 5000));
		producList.add(new Products("bottle", 500));
		producList.add(new Products("tshirt", 6000));
		
		Map<String, Products> inventory = new HashMap<String, Products>();
		inventory.put("Pr01", new Products("laptop", 65000));
		inventory.put("Pr02", new Products("phone", 55000));
		inventory.put("Pr03", new Products("earphone", 5000));
		inventory.put("Pr04", new Products("bottle", 500));
		inventory.put("Pr05", new Products("tshirt", 6000));
		
		Products product = inventory.get("Pr01");
		System.out.println("Product name : " + product.getProductName());
		
	Customer regualarCustomer = new Customer("abc", "abc@gmail.co", 9876543);
	PremiumCustomer premiumCustomer = new PremiumCustomer("def", "def@gmail.com", 876543, 0.5);
	
	Orders order1 = new Orders(regualarCustomer);
	Orders order2 = new Orders(premiumCustomer);
	
	OrderProcessor orderProcessor = new OrderProcessor(inventory);
	orderProcessor.addProductToOrder(order1, "Pr01");
	orderProcessor.addProductToOrder(order2, "Pr02");
	
	orderProcessor.completePayment(order1);
	orderProcessor.completePayment(order2);
	}

}
