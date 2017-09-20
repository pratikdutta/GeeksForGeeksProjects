package home.pratik.linkedlist;

import com.sun.media.sound.InvalidDataException;

public class LinkedList<E>{
	
	private Node head = null;
	private int size;
	public LinkedList() {
		size = 0;
	}
	
	public int getSize() {
		return this.size;
	}
	
	class Node<E>{
		E data;
		Node next;
		
		Node(E data, Node next){
			this.data = data;
			this.next = next;
		}
	}
	
	
	@SuppressWarnings("rawtypes")
	public void addBeforeHead(E e) throws InvalidDataException{
		if(e == null) {
			throw new InvalidDataException();
		}else {
			if(head == null) {
				head = new Node(e, null);
			}else {
				Node new_Node = new Node(e, head);
				head = new_Node;
			}
			size++;
		}
	}
	
	public void addAfterTail(E e) throws InvalidDataException{
		
		if(e == null) {
			throw new InvalidDataException();
		}else {
			if(head == null) {
				head = new Node(e, null);
			}else {
				Node new_Node = new Node(e, null);
				Node temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				if(temp.next == null) {
					temp.next = new_Node;
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuffer returnString = new StringBuffer("LinkedList [");
		if(head != null) {
			returnString.append(head.data);
			returnString.append(", ");
			while(head.next != null) {
				Node n = head.next;
				E e = (E) n.data;
				returnString.append(e);
				returnString.append(", ");
				head = n;
			}
			returnString.replace(returnString.lastIndexOf(","), returnString.length(), "]");
		}else {
			return null;
		}
		return returnString.toString();
	}
}
