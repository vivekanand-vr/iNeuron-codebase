package getitdone.com;

import java.util.Arrays;

public class CheckIfAnArrayIsSubsetOfAnotherArray {
	static boolean isSubset(int arr1[],int arr2[],int m,int n) {
       int i=0;
       int j=0;
        if (m < n)
            return false;
 
        Arrays.sort(arr1); // sorts arr1
        Arrays.sort(arr2); // sorts arr2
 
        while (i < n && j < m) {
            if (arr1[j] < arr2[i])
                j++;
            else if (arr1[j] == arr2[i]) {
                j++;
                i++;
            }
            else if (arr1[j] > arr2[i])
                return false;
        }
 
        if (i < n)
            return false;
        else
            return true;
		
	}

	public static void main(String[] args) {
		 int arr1[] = { 11, 1, 13, 21, 3, 7 };
	        int arr2[] = { 11, 7, 1 };
	 
	        int m = arr1.length;
	        int n = arr2.length;
	 
	        if (isSubset(arr1, arr2, m, n))
	            System.out.println("arr2 is a subset of arr1");
	        else
	            System.out.println(
	                "arr2 is not a subset of arr1");

	}

}
