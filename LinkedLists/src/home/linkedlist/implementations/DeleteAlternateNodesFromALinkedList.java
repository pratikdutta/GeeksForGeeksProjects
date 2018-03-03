package home.linkedlist.implementations;

import javax.activity.InvalidActivityException;

import org.apache.log4j.Logger;

import com.sun.media.sound.InvalidDataException;

import home.pratik.linkedlist.LinkedList;
import home.pratik.linkedlist.Node;

public class DeleteAlternateNodesFromALinkedList {
	
	private static final Logger LOG = Logger.getLogger(DeleteAlternateNodesFromALinkedList.class);
	
	public <E> void getAlternateDeletedNodesList(LinkedList<E> list){
		if(list != null){
			Node<E> current = list.getHead();
			Node<E> next = null;
			while(current != null && current.getNext() != null){
				next = current.getNext();
				current.setNext(current.getNext().getNext());
				next.setNext(null);
				current = current.getNext();
			}
		}
	}
	
	public <E> void getAlternateDeletedNodesUsingLLMethods(LinkedList<E> list) throws InvalidActivityException, InvalidDataException{
		if(list != null){
			Node<E> current = list.getHead();
			while(current != null){
				if(current.getNext() != null){
					list.deleteNode(current.getNext().getData());
				}
				current = current.getNext();
			}
		}
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
			LOG.info("List_01: "+list);
			DeleteAlternateNodesFromALinkedList delNodes = new DeleteAlternateNodesFromALinkedList();
//			delNodes.getAlternateDeletedNodesList(list);
			delNodes.getAlternateDeletedNodesUsingLLMethods(list);
			LOG.info("List After Deletions: "+list);
			LOG.info("List Size After Deletions: "+list.getSize());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
