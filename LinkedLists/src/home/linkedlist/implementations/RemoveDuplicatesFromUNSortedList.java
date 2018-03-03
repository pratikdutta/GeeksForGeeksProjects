package home.linkedlist.implementations;

import com.sun.media.sound.InvalidDataException;

import home.pratik.linkedlist.LinkedList;
import home.pratik.linkedlist.LinkedListMergeSort;

public class RemoveDuplicatesFromUNSortedList {

	public LinkedList<Integer> removeDuplicatesFromUnSortedList(LinkedList<Integer> list){
		if(list != null && list.getSize() != 0){
			LinkedList<Integer> sortedList = new LinkedListMergeSort().mergeSortList(list);
			return new RemoveDuplicatesFromSortedList().removeDuplicatesFromSorted(sortedList);
		}
		return null;
	}
	
	
	public static void main(String[] args) throws InvalidDataException {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.addAfterTail(46);
		list1.addAfterTail(39);
		list1.addAfterTail(9);
		list1.addAfterTail(0);
		list1.addAfterTail(67);
		list1.addAfterTail(23);
		list1.addAfterTail(46);
		list1.addAfterTail(78);
		list1.addAfterTail(39);
		list1.addAfterTail(34);
		list1.addAfterTail(67);
		list1.addAfterTail(46);
		System.out.println("Provided List: "+list1);
		System.out.println("Final List: " + new RemoveDuplicatesFromUNSortedList()
				.removeDuplicatesFromUnSortedList(list1));
	}

}
