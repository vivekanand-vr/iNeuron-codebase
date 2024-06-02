
public class CopyStrings {

	public static void main(String[] args) 
	{
		String s1="iNeuron";
		
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("First String is "+s1);
		System.out.println("Copy of First String "+ s2);
	}

}
