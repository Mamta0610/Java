package santhiPriya;

public class Triangle extends Shape{
	
	public void draw() {
		System.out.println("Drawing Traingle shape ");
	}
	
	public void calcArea() {
		int base = 10;
		int height = 7;
		System.out.print("Traingle Area is :");
		System.out.println(0.5 * base * height);
	}

}
