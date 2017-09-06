package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "binary iterative";
	}

	@Override
	public int search(int[] arr, int target) {
		int min = 0;
		int max = arr.length - 1;
		
		while (min < max) {
			int mid = (min + max) / 2;
			
			if (mid == target) {
				return mid;
			} else if(target > mid) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}	
		}
		return -1;		
	}
}
