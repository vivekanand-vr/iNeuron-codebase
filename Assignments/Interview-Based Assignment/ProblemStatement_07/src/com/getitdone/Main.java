package com.getitdone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String string = findNumber();
		System.out.println(string);
	
	}
	
	public static String findNumber() {

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(List.of(1,2,3,42,7,4,34,23,12,2));
        Collections.sort(list);
        System.out.println("Enter the number to find from 1-100");
        int nextInt = sc.nextInt();
        
         int result = Collections.binarySearch(list, nextInt);
         if(0<result&&result<list.size()) {
      	   return "index  "+result+" value"+" "+nextInt;
         }
       
       return "Number Not found"; 
		}

}
