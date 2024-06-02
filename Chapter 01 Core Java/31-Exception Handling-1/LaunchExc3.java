import java.util.Scanner;

public class LaunchExc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connection to Calc app is established");
		Scanner scan=new Scanner(System.in);
		try
		{
		
		System.out.println("Enter the first num to divide");
		int num1=scan.nextInt();
		System.out.println("Enter the 2nd num to divide");
		int num2=scan.nextInt();
		
		 int res=num1/num2;
		
		System.out.println("The res is "+ res);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please provide non zero denominator");
		}
		
		
		try
		{
		System.out.println("Enter the size of an array");
		int size=scan.nextInt();
		
		int[] a=new int[size];
		
		
		
		System.out.println("Enter the elem to be inserted in that array");
		int elem=scan.nextInt();
		
		System.out.println("Enter the pos at which elem has to be inserted");
		int pos=scan.nextInt();
		
		a[pos]=elem;
		System.out.println("Element "+ elem + " Inserted at "+ pos +" succeesfully");
		
		}
		 catch(NegativeArraySizeException nae)
		{
			 System.out.println("be positive");
		}
	
		catch(ArrayIndexOutOfBoundsException aa)
		{
			System.out.println("Be in your limits, Don't cross it");
		}
		catch(Exception e)
		{
			System.out.println("Wrong input!");
		}
		
		
		System.out.println("Connection is terminated");
	}

}
