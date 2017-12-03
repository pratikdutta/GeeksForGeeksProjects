package home.pratik.datastructures;

import java.util.NoSuchElementException;

public class LinkedListedQueue<E> implements CustomQueue<E>{
	
	private Node<E> head;
	private int size;
	
	public LinkedListedQueue() {
		size = 0;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	

	@Override
	public boolean add(E e) {
		if(e != null) {
			return add(new Node<E>(e));
		}
		return false;
	}
	
	
	public boolean add(Node<E> n) {
		if(n != null) {
			if (head == null)
				head = n;
			else {
				Node<E> current = head;
				while(current.next != null ) {
					current = current.next;
				}
				current.next = n;
			}
			size++;
			return true;
		}
		return false;
	}

	
	@Override
	public boolean offer(E e) {
		return add(e);
	}

	@Override
	public E remove() {
		E eObject = poll();
		if(eObject == null) 
			throw new NoSuchElementException();
		return eObject;
	}

	@Override
	public E poll() {
		E eObject = null;
		if(head != null) {
			eObject = head.data;
			head = head.next;
			size--;
		}
		return eObject;
	}

	@Override
	public E element() {
		E eObject = poll();
		if(eObject == null) {
			throw new NoSuchElementException();
		}
		return eObject;
	}

	@Override
	public E peek() {
		if(head != null) {
			return head.data;
		}
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder returnString = new StringBuilder("LinkedListedQueue [");
		if(head != null) {
			returnString.append(head.data);
			returnString.append(", ");
			Node<E> n = head.next;
			while(n != null) {
				E e = (E) n.data;
				returnString.append(e);
				returnString.append(", ");
				n = n.next;
			}
			returnString.replace(returnString.lastIndexOf(","), returnString.length(), "]");
		}else {
			return null;
		}
		return returnString.toString();
	}
}
