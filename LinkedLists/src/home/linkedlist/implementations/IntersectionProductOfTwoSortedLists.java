package home.linkedlist.implementations;

import org.apache.log4j.Logger;

import com.sun.media.sound.InvalidDataException;

import home.pratik.linkedlist.LinkedList;
import home.pratik.linkedlist.Node;

public class IntersectionProductOfTwoSortedLists {
	
	private static final Logger LOG = Logger.getLogger(IntersectionProductOfTwoSortedLists.class);
	
	public <E> LinkedList<E> getIntersectionList(LinkedList<E> list01, LinkedList<E> list02) throws InvalidDataException{
		LinkedList<E> intersections = null;
		if(list01 != null && list02 != null){
			Node<E> current1 = list01.getHead();
			Node<E> current2 = list02.getHead();
			intersections = new LinkedList<>();
			while(current1 != null){
				if(current2 != null && current1.getData().equals(current2.getData())){
					intersections.addAfterTail(current1.getData());
					current1 = current1.getNext();
					current2 = current2.getNext();
				}else if(current2 != null && (int)current1.getData() < (int)current2.getData()){
					current1 = current1.getNext();
				}else if(current2 != null && (int)current1.getData() > (int)current2.getData()){
					current2 = current2.getNext();
				}
				if(current2 == null){
					break;
				}
			}
		}
		return intersections;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		try {
			list1.addAfterTail(1);
			list1.addAfterTail(4);
			list1.addAfterTail(5);
			list1.addAfterTail(7);
			list1.addAfterTail(14);
			list1.addAfterTail(17);
			list1.addAfterTail(18);
			list1.addAfterTail(19);
			list1.addAfterTail(21);
			list2.addAfterTail(2);
			list2.addAfterTail(3);
			list2.addAfterTail(6);
			list2.addAfterTail(12);
			list2.addAfterTail(18);
			list2.addAfterTail(21);
			LOG.info("List_01: "+list1);
			LOG.info("List_02: "+list2);
			IntersectionProductOfTwoSortedLists ints = new IntersectionProductOfTwoSortedLists();
			LOG.info("Intersections: "+ints.getIntersectionList(list2, list1));
			
		} catch (InvalidDataException e) {
			e.printStackTrace();
		}
	}

}
