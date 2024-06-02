import java.util.Scanner;

public class Launch6 {

	public static void main(String[] args)
	{
	  Scanner scan=new Scanner(System.in);
	  
	  int [][][] hyder=new int[2][3][3];
	  
	  for(int i=0;i<hyder.length;i++)
	  {
		  for(int j=0; j<hyder[i].length;j++)
		  {
			  for(int k=0;k<hyder[i][j].length;k++)
			  {
				  System.out.println("Enter marks of College "+ i+ " Class "+ j + " Student "+k);
				  hyder[i][j][k]=scan.nextInt();
			  }
		  }
	  }
	  System.out.println("Marks stored are as follows");
	  for(int i=0;i<hyder.length;i++)
	  {
		  for(int j=0; j<hyder[i].length;j++)
		  {
			  for(int k=0;k<hyder[i][j].length;k++)
			  {
				  System.out.print(hyder[i][j][k] +" ");
			  }
			  System.out.println();
		  }
	  }

	}

}
