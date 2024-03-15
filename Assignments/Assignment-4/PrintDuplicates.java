package getitdone.com;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDuplicates {
     public static void printDuplicates(String s){
    	 s = s.toLowerCase();
    	 int[] arr=new int[26];
    	 
    	
    	
    	
    	for(int i=0;i<s.length();i++) {
    		arr[s.charAt(i)-97]++;
}
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>1) {
    		  char a=(char)(i+97);
    		  System.out.println(a);
    		}
    	}
    	
    	 
    	 
     }
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		   System.out.println("Enter the String");
		   String s=sc.nextLine();
		   printDuplicates(s);
		   

	}

}
