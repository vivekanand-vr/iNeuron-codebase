package com.getitdone;

public class Pattern1 {

	public static void main(String[] args) {
		int n=20;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0&&i>(n-1)/2||i>=(n-1)/2+j &&j<n-1||i==n-1||i+j>=n-1+(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
