package home.linkedlist.implementations;

import org.apache.log4j.Logger;

import com.sun.media.sound.InvalidDataException;

import home.pratik.linkedlist.LinkedList;
import home.pratik.linkedlist.Node;

public class AlternatingSplitOfLinkedList {
	
	private static final Logger LOG = Logger.getLogger(AlternatingSplitOfLinkedList.class);
	
	private static class Lists<E> {
		LinkedList<E> firstList;
		LinkedList<E> secondList;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		try {
			list.addAfterTail(1);
			list.addAfterTail(4);
			list.addAfterTail(5);
			list.addAfterTail(7);
			list.addAfterTail(14);
			list.addAfterTail(17);
			list.addAfterTail(18);
			list.addAfterTail(14);
			list.addAfterTail(19);
			list.addAfterTail(21);
			list.addAfterTail(27);
			list.addAfterTail(30);
			LOG.info("Original List: "+list);
			AlternatingSplitOfLinkedList altSplit = new AlternatingSplitOfLinkedList();
//			Lists<Integer> lists = altSplit.getSplittedLists(list);getSplittedListsWithoutExtraSpace
			Lists<Integer> lists = altSplit.getSplittedListsWithoutExtraSpace(list);
			LOG.info("Odd/First: "+lists.firstList);
			LOG.info("Even/Second: "+lists.secondList);
		}catch (Exception e) {
			LOG.error("Eception", e);
		}
		
	}
	
	public <E> Lists<E> getSplittedLists(LinkedList<E> orgList) throws InvalidDataException{
		Lists<E> lists = new Lists<>();
		if(orgList != null){
			Node<E> current = orgList.getHead();
			LinkedList<E> oddList = new LinkedList<>();
			LinkedList<E> evenList = new LinkedList<>();
			lists.firstList = oddList;
			lists.secondList = evenList;
			while(current != null && current.getNext() != null){
				oddList.addAfterTail(current.getData());
				evenList.addAfterTail(current.getNext().getData());
				current = current.getNext().getNext();
			}
			if(current != null){
				oddList.addAfterTail(current.getData());
			}
			assert(evenList.getSize() == (orgList.getSize()/2));
		}
		return lists;
	}
	
	
	private <E> Lists<E> getSplittedListsWithoutExtraSpace(LinkedList<E> orgList) throws InvalidDataException{
		Lists<E> lists = new Lists<>();
		if(orgList != null){
			int orgListSize = orgList.getSize();
			Node<E> current = orgList.getHead();
			Node<E> next = null;
			LinkedList<E> newList = new LinkedList<>();
			lists.firstList = orgList;
			lists.secondList = newList; 
			while(current != null && current.getNext() != null){
				next = current.getNext();
				current.setNext(next.getNext());
				next.setNext(null);
				newList.addNodeAfterTail(next);
				current = current.getNext();
			}
			assert(newList.getSize() == (orgListSize/2));
		}
		return lists;
	}
}
