package getitdone.com;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int arr[]= {3,1,4,6,7};
		if(isDuplicatePresent(arr)) {
			System.out.println("Duplicate elements are present ");
		}else {
			System.out.println("No duplicates are present");
		}

	}

	private static boolean isDuplicatePresent(int[] arr) {
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				return true;
			}
		}
		
		return false;
	}

}
