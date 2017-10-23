package home.pratik.linkedlist;

import javax.activity.InvalidActivityException;

import com.sun.media.sound.InvalidDataException;

public class LinkedList<E>{
	
	private Node<E> head = null;
	private int size;
	public LinkedList() {
		size = 0;
	}
	
	public int getSize() {
		return this.size;
	}
	
	class Node<M>{
		M data;
		Node<M> next;
		
		Node(M data, Node<M> next){
			this.data = data;
			this.next = next;
		}
	}
	
	
	public void addBeforeHead(E e) throws InvalidDataException{
		if(e == null) {
			throw new InvalidDataException();
		}else {
			if(head == null) {
				head = new Node<E>(e, null);
			}else {
				Node<E> new_Node = new Node<E>(e, head);
				head = new_Node;
			}
			size++;
		}
	}
	
	
	protected void insertAfterSpecifiedNode(Node<E> specifiedNode, Node<E> dataNode) throws InvalidDataException {
		if(specifiedNode == null || dataNode == null) {
			throw new InvalidDataException();
		}else {
			if(specifiedNode.next != null) {
				Node<E> tempNode = specifiedNode.next;
				specifiedNode.next = dataNode;
				dataNode.next = tempNode;
			}else {
				specifiedNode.next = dataNode;
			}
		}
	}
	
	public void deleteNode(E data) throws InvalidDataException, InvalidActivityException {
		if(data == null) {
			throw new InvalidDataException();
		}else {
			if(head == null) {
				throw new InvalidActivityException();
			}else {
				Node<E> currentNode = head;
				Node<E> prevNode = null;
				while(currentNode != null) {
					if(currentNode.data == data) {
						break;
					}else {
						prevNode = currentNode;
						Node<E> tempNode = currentNode;
						currentNode = tempNode.next;
					}
				}
				if(prevNode!= null && currentNode!= null) {
					prevNode.next = currentNode.next;
					size--;
				}else if(prevNode== null){
					head = head.next;
					size--;
				}
			}
		}
	}
	
	
	public int getCount() {
		int counter = 0;
		if(head == null) {
			return 0;
		}else {
			Node<E> tempNode = head;
			while(tempNode != null) {
				tempNode = tempNode.next;
				counter++;
			}
		}
		return counter;
	}
	
	private int getCountRecursiveImplementation(Node<E> node) {
		if(node == null) {
			return 0;
		}else {
			return 1+getCountRecursiveImplementation(node.next);
		}
	}
	
	public int getCountRec() {
		return getCountRecursiveImplementation(head);
	}
	
	
	public void addAfterTail(E e) throws InvalidDataException{
		if(e == null) {
			throw new InvalidDataException();
		}else {
			if(head == null) {
				head = new Node<E>(e, null);
				size++;
			}else {
				Node<E> new_Node = new Node<E>(e, null);
				Node<E> temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				if(temp.next == null) {
					temp.next = new_Node;
					size++;
				}
			}
		}
	}
	
	public void swapNodesWithoutValues(E eX, E eY) throws InvalidDataException {
		if(head == null || eX == null || eY == null) {
			throw new InvalidDataException();
		}else if(eX == eY){
			return;
		}else {
			Node<E> currentNode = head;
			Node<E> prevNode = null;
			Node<E> prevXNode = null;
			Node<E> prevYNode = null;
			Node<E> xNode = null;
			Node<E> yNode = null;
			Node<E> tempNode = null;
			boolean xNodeFound = false;
			boolean yNodeFound = false;
			while(currentNode!= null) {
				if(currentNode.data.equals(eX) && xNodeFound!= true) {
					xNode = currentNode;
					prevXNode = prevNode;
					xNodeFound = true;
				}
				if(currentNode.data.equals(eY) && yNodeFound!= true) {
					yNode = currentNode;
					prevYNode = prevNode;
					yNodeFound = true;
				}
				if(xNode != null && yNode != null) {
					break;
				}
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
			if(xNode ==null || yNode == null) {
				return;
			}else {
				if(prevXNode != null) {
					prevXNode.next = yNode;
				}else {
					head = yNode;
				}
				if(prevYNode != null) {
					prevYNode.next = xNode;
				}else {
					head = xNode;
				}
				tempNode = xNode.next;
				xNode.next = yNode.next;
				yNode.next = tempNode;
			}
		}
	}
	
	
	public E get(int n) {
		Node<E> tempNode = head;
		int counter = 0;
		while(tempNode.next != null) {
			if(counter == n) {
				return tempNode.data;
			}
			tempNode = tempNode.next;
			counter++;
		}
		return null;
	}
	
	public E getMiddleElement() {
		Node<E> element = head;
		Node<E> mid = head;
		int counter = 0;
		while(element != null) {
			if(counter%2!=0) {
				mid = mid.next;
			}
			element = element.next;
			counter++;
		}
		return mid.data;
	}
	
	
	public E getNthNodeFromEnd(int n) {
		Node<E> mainElement = head;
		Node<E> referenceElement = head;
		int refCounter = 0;
		while(refCounter < n && referenceElement != null) {
			referenceElement = referenceElement.next;
			refCounter++;
		}		
		while(referenceElement != null) {
			mainElement = mainElement.next;
			referenceElement = referenceElement.next;
		}		
		return mainElement.data;
	}
	
	public void reverse() {
		Node<E> current = head;
		Node<E> prev = null;
		Node<E> next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public void reverseInGroups(int groupLength) {
		Node<E> current = head;
		
		while(current != null) {
			
		}
	}

	@Override
	public String toString() {
		StringBuffer returnString = new StringBuffer("LinkedList [");
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
