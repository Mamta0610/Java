//menu driven cafe management application
//display menu items with prices
//allow the user to place an order
//calculate total price based on ordered items
//option to exit from program

package Vanitha;
import java.util.Scanner;

public class CafeMgmt {
	static String[] menuItems = {"Coffe", "Tea","Cake", "Cookie","Sandwich","Burger","Pasta","Hot Chocolate","Oreo Shake"};
	static double[] prices = {50,20,900,65,120,250,540,140,200};
	
	public static void viewMenu() {
		System.out.println("Cafe Mgmt ");
		for(int i=0;i<menuItems.length;i++) {
			System.out.println((i+1) + " " + menuItems[i] + " $. " + prices[i]);
		}
	}
	
	public static double placeOrder(Scanner sc) {
		double orderAmount =0;
		System.out.println("Enter the number of items you want to order");
		int numberOfItems = sc.nextInt();
		for(int i=0;i<numberOfItems;i++) {
			System.out.println("Enter the item number(1-9) for item " + (i+1) + " :");
			int itemNumber = sc.nextInt();
			if(itemNumber >=1 && itemNumber<=9) {
				orderAmount += prices[itemNumber-1];
				System.out.println("Added " + menuItems[itemNumber-1] + " to your order");
			}else {
				System.out.println("Invalid item number, try again ");
				i--;
			}
		}
		return orderAmount;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double totalAmt=0;
		do {
			System.out.println("Welcome to Cafe Mgmt ");
			System.out.println("1. View Menu");
			System.out.println("2. Place Order");
			System.out.println("3. Calculate Total");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			
		switch(choice) {
		case 1 : 
			viewMenu();
			break;
		case 2 : 
			totalAmt +=placeOrder(sc);
			break;
		case 3 :
			System.out.println("Total Amount : " + totalAmt);
			break;
		case 4 :
			System.out.println("Thank you.... ");
		}
	}while(choice !=4);
		
 }

}
