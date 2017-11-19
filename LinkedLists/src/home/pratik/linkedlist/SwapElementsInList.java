package home.pratik.linkedlist;

import com.sun.media.sound.InvalidDataException;

public class SwapElementsInList {
	
	public <E> LinkedList<E> swapDataInElements(LinkedList<E> list){
		if(list != null){
			E tempData = null;
			Node<E> current = list.getHead();
			Node<E> next =  null;
			if(current != null){
				next = current.next;
				while(next != null){
					tempData = current.data;
					current.data = next.data;
					next.data = tempData;
					current = next;
					next = current.next;
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
