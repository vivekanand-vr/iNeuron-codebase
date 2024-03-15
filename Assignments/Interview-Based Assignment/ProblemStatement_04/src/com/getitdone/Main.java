package com.getitdone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		IBank bank=null;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Chose from the list");
		System.out.println("Press 1 to deposit");
		System.out.println("Press 2 to withdraw");
		int nextInt = scanner.nextInt();
		if(nextInt==1) {
			bank=new CanaraBank();
			System.out.println("Enter the amount");
			float depo = scanner.nextFloat();
			String result = bank.deposit(depo);
			System.out.println(result);
		}else {
			bank=new CanaraBank();
			System.out.println("Enter the amount");
			float with = scanner.nextFloat();
			String result = bank.withdrawal(with);
			System.out.println(result);
			
			
		}
		

	}

}
