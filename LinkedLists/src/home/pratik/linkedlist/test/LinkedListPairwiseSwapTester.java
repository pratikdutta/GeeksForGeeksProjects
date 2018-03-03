package home.pratik.linkedlist.test;

import home.pratik.linkedlist.LinkedList;

public class LinkedListPairwiseSwapTester {

	public static void main(String[] args) {
		
		LinkedList<String> strings = new LinkedList<String>();
		try {
			/*strings.addAfterTail("S");
			strings.addAfterTail("W");
			strings.addAfterTail("A");
			strings.addAfterTail("R");
			strings.addAfterTail("N");
			strings.addAfterTail("A");
			strings.addAfterTail("M");
			strings.addAfterTail("E");
			strings.addAfterTail("E");
			strings.addAfterTail("T");
			strings.addAfterTail("A");*/
			
			strings.addAfterTail("A");
			strings.addAfterTail("B");
			strings.addAfterTail("C");
			strings.addAfterTail("D");
			strings.addAfterTail("E");
			strings.addAfterTail("F");
			strings.addAfterTail("G");
			strings.addAfterTail("H");
			strings.addAfterTail("I");
			strings.addAfterTail("J");
			strings.addAfterTail("K");
			
			System.out.println("VALUES_Original : " + strings.toString());
			String org = strings.toString();
			strings.pairWiseSwapValues();
			String valMod = strings.toString();
			System.out.println("VALUES_Modified : " +valMod);
			strings.pairWiseSwapNodes();
			String nodeMod = strings.toString();
			System.out.println("NODES_Modified : " +nodeMod);
			if(org.equalsIgnoreCase(nodeMod)){
				System.out.println("WORKING CORRECT");
			}else{
				System.out.println("ERROR");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
