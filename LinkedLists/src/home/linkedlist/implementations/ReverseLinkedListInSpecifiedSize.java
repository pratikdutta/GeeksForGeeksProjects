package home.linkedlist.implementations;

import home.pratik.linkedlist.LinkedList;
import home.pratik.linkedlist.Node;

public class ReverseLinkedListInSpecifiedSize {

	public static void main(String[] args) {
		
	}
	
	private <E> void getReversedLinkedList(LinkedList<E> list, int reversingLength){
		LinkedList<E> tempList = null; 
		if(list != null && reversingLength > 0){
			int iterration = 0;
			Node<E> current = list.getHead();
			while(current != null){
				tempList = new LinkedList<>(); 
				Node<E> lenNode = current;
				while(lenNode != null && iterration < reversingLength){
					lenNode = lenNode.getNext();
					tempList.addNodeAfterTail(lenNode);
					iterration++;
				}
				reverse(tempList);
				current = lenNode.getNext();
				
				lenNode.setNext(null);
			}
		}
	}
	
	private <E> void reverse(LinkedList<E> subList){
		if(subList != null){
			subList.reverse();
		}
	}
}
