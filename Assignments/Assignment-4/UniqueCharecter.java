package getitdone.com;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueCharecter {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		   System.out.println("Enter the String");
		   String a=sc.nextLine();
		a=a.toLowerCase();
		char[] s=a.toCharArray();
		Arrays.sort(s);
		boolean flag=false;
		for(int i=1;i<s.length;i++) {
			if(s[i]==s[i-1]) {
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		

	}

}
