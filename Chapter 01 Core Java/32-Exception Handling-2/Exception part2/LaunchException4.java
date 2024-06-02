import java.util.Scanner;

class Alpha
{
	void alpha() throws ArithmeticException
	{
		System.out.println("Connection to Calc app is established");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first num to divide");
		int num1=scan.nextInt();
		System.out.println("Enter the 2nd num to divide");
		int num2=scan.nextInt();
		
		 int res=num1/num2;
		
		System.out.println("The res is "+ res);
		System.out.println("Connection is terminated");	
	}
}

class Beta
{
	void beta() throws ArithmeticException
	{
		Alpha a=new Alpha();
		a.alpha();
	}
}
public class LaunchException4 {

	public static void main(String[] args) 
	{
		try
		{
		Beta b=new Beta();
		b.beta();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Exception finally handled in main");
		}

	}

}
