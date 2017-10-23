package home.pratik.rotatearray;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		System.out.println("Enter 1st line: ");
		Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int r = in.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Enter Array: ");
        for(int a_m=0; a_m < m; a_m++){
        	for (int a_n=0; a_n < n; a_n++) {
        		a[a_m][a_n] = in.nextInt();
        	}
        }
        for(int a_m=0; a_m < m; a_m++){
        	for (int a_n=0; a_n < n; a_n++) {
        		System.out.print(a[a_m][a_n]);
        	}
        	System.out.print("\n");
        }
        in.close();
        System.out.println(a.length);
        RotateArray ra = new RotateArray();
        ra.solution(a, m, n, r);
	}
	
	public void solution(int a[][], int m_max, int n_max, int r) {
		int layer = (Math.min(m_max, n_max))%2;
		int arrPerimeter = 2*(m_max + n_max);
		int layerCounter = 0;
		int m_min = 0;
		int n_min = 0;
		int [][] finalArray = new int[m_max][n_max];
		for(int q=layer; q>=layer; q--) {
			int tempR = r;
			m_max = m_max - layerCounter;
			m_min = m_min + layerCounter;
			n_max = n_max - layerCounter;
			n_min = n_min + layerCounter;
			if(tempR>(2*m_max + 2*n_max)) {
				tempR = tempR % (arrPerimeter - 4);
			}
			Location loc = locate(m_max,n_max,m_max,n_max,tempR);
			finalArray = prepareNewArray(arrPerimeter, a, finalArray, new Location(m_min,n_min), loc);
			layerCounter++;
		}
		 for(int a_m=0; a_m < m_max; a_m++){
	        	for (int a_n=0; a_n < n_max; a_n++) {
	        		System.out.print(finalArray[a_m][a_n]);
	        	}
	        	System.out.print("\n");
	     }
	}
	
	private Location locate(int m_max, int n_max, int m_min, int n_min, int r) {
		int oppEnd = ((m_max+n_max)-2);
		if(r==oppEnd) {
			return new Location(m_max,n_max);
		}else if(r>oppEnd) {
			r = r - oppEnd;
			if(r>(m_max-1)) {
				r = r - (m_max-1);
				return new Location(m_min, (n_max-1-r));
			}else if(r==(m_max-1)){
				return new Location(m_min, n_max);
			}else {
				return new Location(m_max-r, n_max);
			}
		}else {
			if(r<(m_max-1)) {
				return new Location(r, n_min);
			}else if(r==(m_max-1)) {
				return new Location(m_max, n_min);
			}else {
				r = r - m_max;
				return new Location(m_max, r);
			}
		}
	}
	
	class Location{
		int x;
		int y;
		public Location(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	private int[][] prepareNewArray(int arrPerimeter, int [][] existingArray, int [][] finalArray, Location existingLoc, Location newLoc){
		
		int existingX = existingLoc.x;
		int existingY = existingLoc.y;
		int arraySides = 4;
		int newX = newLoc.x;
		int newY = newLoc.y;
		
		for(int k=0; k<=(arraySides + 1); k++) {
			while(true) {
				
			}
		}
		
		return finalArray;
	}
}
