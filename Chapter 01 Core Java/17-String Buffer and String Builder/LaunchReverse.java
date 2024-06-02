
public class LaunchReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="iNeuron";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("Original String: "+s1);
		System.out.println("After Reversing: "+s2);

		
		//ineuron java --> avaj norueni
		
		String str1="ineuron java";
		String str2="";
		
		String sarr[]=str1.split(" ");
		
		for(String elem: sarr)
		{
			for(int i=elem.length()-1;i>=0;i--)
			{
				str2=str2+elem.charAt(i);
			}
			str2=str2 +" ";
			
		}
		System.out.println(str2);// norueni avaj
		
	// ineuron java ->java ineuron
		
		String ss="ineuron java";
		String ss2="";
		String ar[]=ss.split(" ");
		for(int i=ar.length-1; i>=0;i--)
		{
			ss2=ss2+ar[i]+" ";
		}
		System.out.println(ss);
		System.out.println(ss2);
		
		
		
	}

}
