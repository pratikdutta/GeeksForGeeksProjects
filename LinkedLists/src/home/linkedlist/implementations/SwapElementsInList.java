package home.linkedlist.implementations;

import com.sun.media.sound.InvalidDataException;

import home.pratik.linkedlist.LinkedList;
import home.pratik.linkedlist.Node;

public class SwapElementsInList {
	
	public <E> LinkedList<E> swapDataInElements(LinkedList<E> list){
		if(list != null){
			E tempData = null;
			Node<E> current = list.getHead();
			Node<E> next =  null;
			if(current != null){
				next = current.getNext();
				while(next != null){
					tempData = current.getData();
					current.setData(next.getData());
					next.setData(tempData);
					current = next;
					next = current.getNext();
				}
			}
		}
		return list;
	}
	
	public <E> LinkedList<E> swapElementsInList(LinkedList<E> list){
		
		return null;
	}

	public static void main(String[] args) throws InvalidDataException {
		LinkedList<Integer> list = new LinkedList<>();
		list.addAfterTail(45);
		list.addAfterTail(25);
		list.addAfterTail(65);
		list.addAfterTail(85);
		list.addAfterTail(15);
		list.addAfterTail(5);
		list.addAfterTail(2);
		
		System.out.println("Provided List For DATA SWAP: "+list);
		list = new SwapElementsInList().swapDataInElements(list);
		System.out.println("Final List For DATA SWAP: "+list);
	}

}
