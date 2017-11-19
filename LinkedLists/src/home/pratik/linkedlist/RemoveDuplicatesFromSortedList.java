package home.pratik.linkedlist;

import com.sun.media.sound.InvalidDataException;

public class RemoveDuplicatesFromSortedList {
	
	
	public LinkedList<Integer> removeDuplicatesFromSorted(LinkedList<Integer> list){
		if(list != null){
			Node<Integer> current = list.getHead();
			while(current != null && current.next != null){
				if(current.data == current.next.data){
					current.next = current.next.next;
					continue;
				}
				current = current.next;
			}
		}
		return list;
	}

	public static void main(String[] args) throws InvalidDataException {
		LinkedList<Integer> l1 = new LinkedList<>();
		
		l1.addAfterTail(3);
		l1.addAfterTail(5);
		l1.addAfterTail(6);
		l1.addAfterTail(6);
		l1.addAfterTail(6);
		l1.addAfterTail(8);
		l1.addAfterTail(9);
		l1.addAfterTail(9);
		l1.addAfterTail(11);
		l1.addAfterTail(11);
		l1.addAfterTail(11);
		l1.addAfterTail(12);
		System.out.println("Initial List: "+l1);
		LinkedList<Integer> finalList = new RemoveDuplicatesFromSortedList().removeDuplicatesFromSorted(l1);
		System.out.println("Final List: "+finalList);
	}

}
