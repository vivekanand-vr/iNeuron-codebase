package com.getitdone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number");
		int i = scanner.nextInt();
		try {
		if(i>0) {
			System.out.println("Square of the number is "+i*i);
		}else {
			throw new NegativeNumberException("Entered number is negative .");
		}
		}catch(NegativeNumberException e) {
			System.out.println("Exception Handled.. with message +"+e.getMessage());
		}

	}

}
