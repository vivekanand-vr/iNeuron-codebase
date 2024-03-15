package getitdone.com;

import java.util.Scanner;

public class RemoveDuplicates {
	static String removeDuplicate(String s) {
		String st="";
		boolean[] b=new boolean[26];
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
		 int index=s.charAt(i)-97;
			if(b[index]!=true) {
				st=st+s.charAt(i);
				b[index]=true;
			}
		}
		return st;
	}

	public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the String");
	   String s=sc.nextLine();	
	   String ans= removeDuplicate(s);
	  System.out.println(ans);

	}

}
