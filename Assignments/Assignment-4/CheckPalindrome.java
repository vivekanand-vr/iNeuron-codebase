package getitdone.com;

public class CheckPalindrome {
	
	public static void checkPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		boolean flag=false;
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}else {
				flag=true;
				
			}
			
		}
		if(flag) {
			System.out.println("String is not palindrome.");
		}else {
			System.out.println("String is palindrome.");
		}
		
	}

	public static void main(String[] args) {
		String s="2555";
		checkPalindrome(s);

	}

}
