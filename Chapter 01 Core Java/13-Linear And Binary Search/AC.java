import java.util.Arrays;

public class AC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= new int[4];
		
		for(int elem:a)
		{
			System.out.print(elem);
		}
		System.out.println();
		Arrays.fill(a,5);
		for(int elem:a)
		{
			System.out.print(elem);
		}
		System.out.println();
		
		int[] ar= {1,2,0,0,0,4,5};
		Arrays.fill(ar, 2, 5, 10);
		for(int elem:ar)
		{
			System.out.print(elem + " ");
		}
		System.out.println();
		
		int[] arr= {20,30,50,10,25,60};
		
		Arrays.sort(arr);
		for(int elem:arr)
		{
			System.out.print(elem + " ");
		}
		System.out.println();
		
		int res=Arrays.binarySearch(arr, 35);
		System.out.println(res);
		
		
	}

}
