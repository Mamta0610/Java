package santhiPriya;

//parent class
public class Vehicle {
	//parent class property
	protected int speed;
	int fuelCapacity;
	String brand; 
	
	//parameterised constructor
	public Vehicle(int s, int fuelCapacity, String brand) {
		this.speed = s;
		this.fuelCapacity = fuelCapacity;
		this.brand = brand;
	}

	//property class functionality
	public void accelerate() {
		System.out.println("Vehicle is accelerating ");
	}
	
	public void brake() {
		System.out.println("Vehicle is braking ");
	}
	
}
