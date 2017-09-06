package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "linear";
	}

	@Override
	public int search(int[] arr, int target) {
		for(int i: arr) {
			if(i == target) {
				return i;
			}
		}
		return -1;
	}

}
