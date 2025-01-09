//phone book system
//array to store name & phone number
//allow user to add new contact, search by name, delete contact
// search can be case-insensitive

package Vanitha;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		String[] names = new String[10];
		String[] phoneNumber = new String[10];
		
		Scanner sc = new Scanner(System.in);
		
		//add contacts
		names[0]= "ABC";
		phoneNumber[0] = "12345";
		
		names[1]= "DEF";
		phoneNumber[1] = "78906";
		
		names[2]= "GHI";
		phoneNumber[2] = "34568";
		
		names[3]= "ABCD";
		phoneNumber[3] = "214367";
		
		names[4]= "zaaw";
		phoneNumber[4] = "977643";
		
		names[5]= "vannn";
		phoneNumber[5] = "770643";
		
		System.out.println("Enter a name to search.. ");
		String searchName = sc.nextLine();
		
		boolean found = false;
		for(int i=0;i<names.length;i++) {
			if(names[i]!=null && names[i].equalsIgnoreCase(searchName)) {
				System.out.println("phone number : " + phoneNumber[i]);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println(" Contact not found ");
		}
		
		sc.close();

	}

}
