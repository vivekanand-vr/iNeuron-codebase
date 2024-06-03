
public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=10; int b=20;
		 * 
		 * 
		 * int c= (a<b)? a: b; System.out.println(c);
		 */
		
		int a=100;
		int b=20;
		int c=60;
		
		int res = (a<b)? (a<c? a:c):(b<c?b:c) ;
		System.out.println(res);
	
		int num1=100;
		int num2=20;
		int num3=60;
		if(num1<num2)
		{
			if(num1<num3)
			{
				System.out.println(num1);
			}
			else
			{
				System.out.println(num3);
			}
		}
		else if(num2<num3)
		{
			System.out.println(num2);
		}
		else
		{
			System.out.println(num3);
		}
		
		
	}

}
