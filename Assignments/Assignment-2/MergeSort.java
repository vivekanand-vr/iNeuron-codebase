package getitdone.com;

import java.util.Scanner;

public class MergeSort {
	static void merge(int[] arr,int l,int mid,int h) {
		int n1=mid-l+1;
		int n2=h-mid;
		int[] left=new int[mid-l+1];
		int[] right=new int[h-mid];
		for(int i=0;i<left.length;i++) {
			left[i]=arr[l+i];
		}
		for( int i=0;i<right.length;i++) {
			right[i]=arr[mid+i+1];
		}
		int i=0,j=0,k=l;
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				i++;
				k++;
			}
			else {
				arr[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			arr[k]=left[i];
			i++;
			k++;
			
		}
		while(j<n2) {
			arr[k]=right[j];
			j++;
			k++;
			
		}
		
	}
	
	public static void mergeSort(int arr[],int l,int h){
		
		
		if(l<h) {
			int mid=l+(h-l)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,h);
			merge(arr,l,mid,h);
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
		int start=0;
		int end=arr.length-1;
		mergeSort(arr,start,end);
		
		System.out.println("This is the sorted array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}

	}

}
