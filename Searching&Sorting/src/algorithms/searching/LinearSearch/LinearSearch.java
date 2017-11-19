package algorithms.searching.LinearSearch;

public class LinearSearch {
	
	public int linearSearch(int[] a, int n){
		if(a != null && a.length>1){
			for(int k=0; k<a.length; k++){
				if(a[k] == n){
					return (k+1);
				}
			}
		}
		return -1;
	}
}
