
public class BBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {7,5,2,3,1,4,6};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int tempVar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempVar;
				}
			}
		}
		
		for(int el:a)
		{
			System.out.print(el+" ");
		}
	}

}
