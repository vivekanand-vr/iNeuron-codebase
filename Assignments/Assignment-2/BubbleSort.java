package getitdone.com;

public class BubbleSort {
	static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

	public static void main(String[] args) {
		int[] arr= {4,2,5,2,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
			}
		}
	  for(int i=0;i<arr.length;i++) {
		  System.out.print(arr[i]+" ");
	  }

	}

}
