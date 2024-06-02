
public class Launch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=28;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==(n-1)/2 || i-j==(n-1)/2 || 
						j-i==(n-1)/2 ||i +j == n -1+ (n-1)/2||
						
						i==j || i+j ==n-1
						|| i==0 || j==0 || i==n-1 || j==n-1)
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
