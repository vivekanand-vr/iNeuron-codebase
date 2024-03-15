package getitdone.com;

public class MaxOccuringCharacter {
	static final int CHAR=256;
  static char maxOccurringChar(String s) {
	  int count[]=new int[CHAR];
	  for(int i=0;i<s.length();i++){
		  count[s.charAt(i)]++;
	  }
	  int res=1;
	  char a = '\u0000';
	  for(int i=0;i<CHAR;i++) {
		  if(count[i]>res) {
			  res=count[i];
			  a=(char)i;
		  }
		  
	  }
	  return a;
	  
  }
	public static void main(String[] args) {
		String s="akash";
		System.out.println("the most repeating character in a string is: "+maxOccurringChar(s));
		

	}

}
