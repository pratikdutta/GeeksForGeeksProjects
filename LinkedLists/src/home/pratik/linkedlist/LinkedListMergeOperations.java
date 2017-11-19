package home.pratik.linkedlist;

import com.sun.media.sound.InvalidDataException;

public class LinkedListMergeOperations {
	
	public LinkedList<Integer> mergeTwoIntegerLists(Node<Integer> n1, Node<Integer> n2) throws InvalidDataException{
		Node<Integer> firstListPointer = null;
		Node<Integer> secondListPointer = null;
		LinkedList<Integer> finalList = null;
		if(n1 != null && n2 != null){
			if(n1.data > n2.data){
				firstListPointer = n2;
				secondListPointer = n1;
			}else{
				firstListPointer = n1;
				secondListPointer = n2;
			}
			finalList = new LinkedList<>();
			finalList.addAfterTail(firstListPointer.data);
			firstListPointer = firstListPointer.next;
			while(firstListPointer != null && secondListPointer != null){
				if(firstListPointer.data > secondListPointer.data){
					finalList.addAfterTail(secondListPointer.data);
					secondListPointer = secondListPointer.next;
				}else if(firstListPointer.data < secondListPointer.data){
					finalList.addAfterTail(firstListPointer.data);
					firstListPointer = firstListPointer.next;
				}else{
					finalList.addAfterTail(firstListPointer.data);
					finalList.addAfterTail(secondListPointer.data);
					firstListPointer = firstListPointer.next;
					secondListPointer = secondListPointer.next;
				}
			}
			Node<Integer> longerListNode = null;
			if(firstListPointer == null){
				longerListNode = secondListPointer;
			}else{
				longerListNode = firstListPointer;
			}
			finalList.addNodeAfterTail(longerListNode);
			
		}
		return finalList;
	}
	
	public static void main(String[] args) throws InvalidDataException {
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		
		l1.addAfterTail(1);
		l1.addAfterTail(6);
		l1.addAfterTail(7);
		l1.addAfterTail(9);
		l1.addAfterTail(10);
		l1.addAfterTail(14);
		l1.addAfterTail(21);
		l1.addAfterTail(23);
		l1.addAfterTail(40);
		l1.addAfterTail(41);
		l1.addAfterTail(61);
		System.out.println("List1: "+l1);
		
		l2.addAfterTail(1);
		l2.addAfterTail(2);
		l2.addAfterTail(7);
		l2.addAfterTail(11);
		l2.addAfterTail(17);
		l2.addAfterTail(18);
		System.out.println("List2: "+l2);
		Node<Integer> head1 = l1.getHead();
		Node<Integer> head2 = l2.getHead();
		LinkedList<Integer> mergedList = new LinkedListMergeOperations().mergeTwoIntegerLists(head1, head2);
		System.out.println("Merged List: "+mergedList);
	}
}
