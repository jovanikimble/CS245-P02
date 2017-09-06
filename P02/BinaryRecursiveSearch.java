package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "binary recursive";
	}

	@Override
	public int search(int[] arr, int target) {
		return search(arr, target, 0, arr.length - 1);
	}
	
	private int search(int[] arr, int target, int min, int max) {
		
		if (min > max) {
			return -1;
		}
				
		int mid = (min + max) / 2;
		
		if (target == arr[mid]) {
			return mid;
		}
		else if(target > arr[mid]) {
			return search(arr, target, mid + 1, max);
		} else {
			return search(arr, target, min, mid -1);
		}
	}
}
