
import java.util.*;
public class Launch2
{

	public static void main(String[] args) 
	{
		// To store and display marks of 5 students
		Scanner scan=new Scanner(System.in);
		
		
		
		int[] ar=new int[5];
		
		
		
		for(int i=0; i<ar.length;i++)
		{
			System.out.println("Please Enter marks of student "+ i);
			ar[i]=scan.nextInt();
		}
		
		System.out.println("The marks of students are as follows");
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+ " ");
		}
		

	}

}
