import java.util.Scanner;

public class Launch5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int [][] ar=new int[3][];//array declaration
		ar[0]=new int[3];
		ar[1]=new int[4];
		ar[2]=new int[2];
		
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0; j<ar[i].length;j++)
			{
				System.out.println("Enter marks of class "+i +" Student "+j);
				ar[i][j]=scan.nextInt();
			}
			
		}
		System.out.println("The marks of Students are");
		
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0; j<ar[i].length;j++)
			{
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
			
		}
		
		

	}

}
