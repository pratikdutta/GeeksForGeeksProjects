package algorithms.searching.LinearSearch;

public class LinearSearchTester01 {

	public static void main(String[] args) {
		
		int[] ar = {5,4,8,12,3,24,9};
		System.out.println("1. In 5,4,8,12,3,24,9; 12's position is at : "
				+new LinearSearch().linearSearch(ar, 12));
		
		System.out.println("2. In 5,4,8,12,3,24,9; 36's position is at : "
				+new LinearSearch().linearSearch(ar, 36));
	}
}
