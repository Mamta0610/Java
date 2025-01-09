package Vanitha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortingEg {
	public static void main(String[] args) {
		List<Product> prd = new ArrayList<Product>();
		prd.add(new Product("abc", 89.56));
		prd.add(new Product("def", 70.56));
		prd.add(new Product("hjk", 90.00));
		prd.add(new Product("qwqe", 51.46));
		prd.add(new Product("pop", 30.26));
		prd.add(new Product("xaad", 65.12));
		prd.add(new Product("vfd", 99.00));
		
		//sort product by price in asc order
		Collections.sort(prd,Comparator.comparingDouble(p -> p.price));
		
		//print sorted list
		System.out.println("Products sorted list ");
		for(Product pp : prd) {
			System.out.println(pp);
		}
	}

}
