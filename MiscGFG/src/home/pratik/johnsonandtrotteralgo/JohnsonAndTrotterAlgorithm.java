package home.pratik.johnsonandtrotteralgo;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class JohnsonAndTrotterAlgorithm {
	
	private static final Logger LOG = Logger.getLogger(JohnsonAndTrotterAlgorithm.class);
	private static String[] allCombinations;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LOG.info("Enter Number(n) : ");
		String str = sc.next();
		LOG.info("Enter Combination(r) : ");
		int comb = sc.nextInt();
		char[] chArr = new char[str.length()];
		for(int q=0; q<str.length(); q++){
			chArr[q] = str.charAt(q);
		}
		sc.close();
		int noOfComb = 0;
		JohnsonAndTrotterAlgorithm jat = new JohnsonAndTrotterAlgorithm();
		if(comb>0 && str.length()>comb){
			noOfComb = factorial(str.length()) 
					/ ((factorial(comb)) * factorial(str.length() - comb));
			allCombinations = new String[noOfComb];
			try{
				jat.johnsonTrotterAlgorithm(chArr);
			}catch(Exception e){
				LOG.error("Exception Occured: ",e);
			}
		}else if(comb>0 && str.length() == comb){
			allCombinations = new String[]{str};
		}else if(comb == 0){
			throw new UnsupportedOperationException();
		}
		if(allCombinations != null && allCombinations.length >0){
			jat.printArray(allCombinations);
		}
	}
	
	private void johnsonTrotterAlgorithm(char[] array)throws ArithmeticException{
		for(int p = 0; p<array.length; p++){
			
		}
	}
	
	private void getCombinations(){
		
	}
	
	
	public static int factorial(int n){
		int factorial = 0;
		while(n != 0)
			factorial = factorial * ((n--)-1);
		return factorial;
	}
	
	private void printArray(String[] arr){
		for (String s : arr){
			LOG.info(s);
		}
	}
}
