package santhiPriya;

import java.util.Scanner;

public class WhileLoopExample {
	public static void main(String[] args) {
		double balance = 15000; 
		double withdrawalAmt;
		double minBalance = 1000;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to our bank , your current balance is : " + balance);
		
		while(balance>minBalance) {
			System.out.println("Enter withdrawal amount ");
			withdrawalAmt = sc.nextDouble();
			if(withdrawalAmt>balance-minBalance) {
				System.out.println("You cannot withdraw this amount, Insufficient funds ");
			}else {
				balance -=withdrawalAmt;
				System.out.println("Amount Successfully Withdrawn");
				System.out.println("Current balance : " + balance);
			}
			if(balance<=minBalance) {
				System.out.println("You have reached the min balance limit, transaction not possible ");
				break;
			}
			
		}
		
		sc.close();
		System.out.println("Thank you for banking with us... ");
	}

}
