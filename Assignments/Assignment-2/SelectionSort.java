package getitdone.com;

import java.util.Scanner;

public class SelectionSort {
	static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
					
				}
				
			}
			swap(arr,i,minIndex);
		}
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println(" Enter the values");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(" This is the given array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}System.out.println();
	  selectionSort(arr);
      
	  System.out.println("This is the sorted array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
