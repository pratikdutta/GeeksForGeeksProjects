package home.linkedlist.implementations;

import com.sun.media.sound.InvalidDataException;

import home.pratik.linkedlist.LinkedList;
import home.pratik.linkedlist.Node;

public class ReverseLinkedListInSpecifiedSize {

	public static void main(String[] args) {
		LinkedList<Integer> intsList = new LinkedList<>();
		try {
			intsList.addAfterTail(1);
			intsList.addAfterTail(2);
			intsList.addAfterTail(3);
			intsList.addAfterTail(4);
			intsList.addAfterTail(5);
			intsList.addAfterTail(6);
			intsList.addAfterTail(7);
			intsList.addAfterTail(8);
			intsList.addAfterTail(9);
			intsList.addAfterTail(10);
			getReversedLinkedList(intsList, 3);
			System.out.println(intsList);
		} catch (InvalidDataException e) {
		}
	}
	
	private static void getReversedLinkedList(LinkedList<Integer> list, int reversingLength){
		Node<Integer> altFirst = null;
		for(int i=0; i<list.getSize(); i++){
			
		}
	}
}
