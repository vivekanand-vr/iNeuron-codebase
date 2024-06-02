
public class LaunchA {

	public static void main(String[] args) {
		//int[] a= {10,20,30,40,50};
		
		int[][] a= {{10,20},{30,40,50},{60,70,80,90}};
		
		for(int ar[]:a)
		{
			for(int elem:ar)
			{
				System.out.print(elem +" ");
			}
			System.out.println();
		}
		
	}

}
