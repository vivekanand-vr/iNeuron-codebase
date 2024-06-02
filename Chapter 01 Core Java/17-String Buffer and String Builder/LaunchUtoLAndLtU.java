import java.util.Scanner;

public class LaunchUtoLAndLtU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		char ch='a';//97-32= 65/A
		System.out.println(ch);
		    ch=(char) (ch-32);
		    System.out.println(ch);
		    
		    
		    Scanner hyder=new Scanner(System.in);
		   System.out.println("Please enter the string value to be converted to upper case");
		    String s1=hyder.nextLine();
		    
		   String s2="";
		   
		   for(int i=0;i<s1.length();i++)
		   {
			   s2=s2+(char)(s1.charAt(i)-32);
		   }
		   
		   //String str=""+'I';
		   System.out.println(s1);
		   System.out.println(s2);
		 
		   
		    String str1="HYDER";
		    System.out.println(str1);
		    
		   String str2="";
		   
		   for(int i=0;i<str1.length();i++)
		   {
			   str2=str2+(char)(str1.charAt(i)+32);
		   }
		   
		   System.out.println(str2);
		   
		   
		   
		   //To convert InEUrOn into iNeuRoN
		   
		   String ss="InEUrOn";
		   String ss2="";
	
		   for(int i=0;i<ss.length();i++)
		   {
			   if(ss.charAt(i)>='a' && ss.charAt(i)<='z')
			   {
				   ss2=ss2+(char)(ss.charAt(i)-32);
			   }
			   else 
			   {
				   ss2=ss2+(char)(ss.charAt(i)+32);
			   }
			  
		   }
		   System.out.println(ss);
		   System.out.println(ss2);
		   
		   
		
	}

}
