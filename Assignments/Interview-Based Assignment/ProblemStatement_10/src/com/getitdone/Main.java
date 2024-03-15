package com.getitdone;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<10;i++) {
		  System.out.println("add the number..");
			list.add(sc.nextInt());
		}
		
		int secondLargest = findSecondLargest(list);
		System.out.println("Second largest element is "+secondLargest);
		
		System.out.println();
		
		int secondSmallest = finsSecondSmallest(list);
		System.out.println("Second smallest element is "+secondSmallest);
		

	}
	private static int finsSecondSmallest(ArrayList<Integer> list) {
		int smallest=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<smallest) {
				second=smallest;
				smallest=list.get(i);
				
			}
			else if( list.get(i)!=smallest) {
				if(smallest==Integer.MAX_VALUE || list.get(i)<second) {
					second=list.get(i);
				}
			}
		}
		
		
		
		
		return second;
		
	}
	public static int findSecondLargest(ArrayList<Integer> list) {
		int largest=0;
		int second=-1;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>largest) {
				second=largest;
				largest=list.get(i);
				}else if(list.get(i)!=largest) {
					if(second==-1 || list.get(i)>second) {
						second=list.get(i);
					}
				}
			
		}
		

		return second;
	}

}
