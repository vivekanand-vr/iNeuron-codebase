
public class Launch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=11;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==n/4 && j>n/4 && j<(3*n)/4)||
						
						(i==(3*n)/4) && j>n/4 && j<(3*n)/4 || 
						(j==n/4 && i>n/4 && i<(3*n)/4) || 
						(j==(3*n)/4) && i>n/4 && i<(3*n)/4||
						(i==j) && i>n/2 && j>n/2)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
