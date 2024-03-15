package getitdone.com;

import java.util.Scanner;

public class CountDifferentCharacters {
     
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		   System.out.println("Enter the String");
		   String s=sc.nextLine();
		countDifferentCharacters(s);
		
	}

	private static void countDifferentCharacters(String a) {
		
		int[] count=new int[126];
		int n=a.length();
		for(int i=0;i<n;i++) {
			count[a.charAt(i)]++;
		}
		int special=0;
		int consonants=0;
		int vowals=0;
		
		for(int i=0;i<=125;i++) {
			if(i>=32 && i<=47 || i>=58 && i<=64 || i>=91 && i<=96 || i>=123 && i>=126) {
				special=special+count[i];	
			}
			else if(i>=65 && i<=90 || i>=97 && i<=122) {
				
				if(i==65 ||i== 69|| i==73|| i==79||i== 85||i== 97|| i==101||i== 105||i== 111||i== 117 ) {
					vowals=vowals+count[i];
				}else {
					consonants=consonants+count[i];
				}
				
			}
			
		}
		System.out.println("No of specialCharecters: "+special+" number of vowals: "+vowals+" number of consonants: "+consonants);
		
		
		
		
	}

}
