package getitdone.com;

public class Pangram {
	static boolean isPangram(String s) {
		int[] count=new int[26];
		s=s.toLowerCase();
		s=s.replace(" ","");
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(count[i]==0) 
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		String s="The quick brown fox jumps over a lazy dong";
		String a="abcdefghijklmnopqurs";
		System.out.println(isPangram(s));

	}

}
