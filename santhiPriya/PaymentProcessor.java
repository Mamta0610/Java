package santhiPriya;

abstract public class PaymentProcessor {
	
	abstract void processPayment(double amount);
	
	abstract void refund(double amount) ;
	
	//abstract method - do not have logic only method declaration
}
