package getitdone.com;

public class Anagram {
	static final int CHAR=256;
	static boolean areAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		
		int[] count=new int[CHAR];
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		for(int i=0;i<256;i++) {
			if(count[i]!=0) return false;
		}
		
		return true;
	}
	

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		System.out.println(areAnagram(s1,s2));

	}

}
