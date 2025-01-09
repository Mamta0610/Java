package santhiPriya;

public class Rectangle extends Shape{
	
	public void draw() {
		System.out.println("Drawing Rectangle shape ");
	}
	
	public void calcArea() {
		int length = 10;
		int breadth =20;
		System.out.print("Rectangle Area is : ");
		System.out.println(length * breadth );
	}
	
}
