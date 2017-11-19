package home.pratik.linkedlist;

import com.sun.media.sound.InvalidDataException;

public class LinkedListTester04 {

	public static void main(String[] args) throws InvalidDataException {
		
		LinkedList<String> strings = new LinkedList<>();
		strings.addAfterTail("R");
		strings.addAfterTail("A");
		strings.addAfterTail("M");
		strings.addAfterTail("A");
		strings.addAfterTail("K");
		strings.addAfterTail("A");
		strings.addAfterTail("N");
		strings.addAfterTail("T");
		strings.addAfterTail("N");
		strings.addAfterTail("A");
		strings.addAfterTail("K");
		strings.addAfterTail("A");
		strings.addAfterTail("M");
		strings.addAfterTail("A");
		strings.addAfterTail("R");
		
		System.out.println("Strings: "+ strings);
		Boolean palindrome = strings.checkPalindrome();
		System.out.println("Palindrome: " +palindrome.toString());
	}

}
