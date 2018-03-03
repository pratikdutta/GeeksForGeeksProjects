package home.pratik.datastructures;

import java.io.Serializable;
import java.util.NoSuchElementException;

public class NodedStack<E> implements Serializable, CustomStack<E>{
	
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	private transient Node<E> top;
	private transient int size;
	
	public NodedStack() {
		
	}
	
	public NodedStack(Node<E> node) {
		if (node != null) {
			node.next = top;
			top = node;
			size++;
		}
	}
	
	public NodedStack(E data){
		if(top == null){
			top = new Node<>();
			top.data = data;
		}else{
			Node<E> newNode = new Node<>(data);
			newNode.next = top;
			top = newNode;
		}
		size++;
	}

	@Override
	public E push(E e) {
		if(e != null){
			Node<E> newNode = new Node<>(e);
			if(top == null)
				top = newNode;
			else{
				newNode.next = top;
				top = newNode;
			}
			size++;
		}
		return e;
	}

	@Override
	public E pop() {
		if (top == null)
			throw new NoSuchElementException();
		Node<E> topNode = top;
		top = topNode.next;
		topNode.next = null;
		size--;
		return topNode.data;
	}

	@Override
	public E peek() {
		if(top != null)
			return top.data;
		return null;
	}

	@Override
	public boolean empty() {
		return (size == 0);
	}

	@Override
	public synchronized int search(E e) {
		Node<E> currentNode = top;
		while(currentNode != null){
			if(currentNode.data.equals(e))
				return 1;
			currentNode = currentNode.next;
		}
		return 0;
	}
	
	@Override
	public String toString(){
		StringBuilder builder = null;
		String seperator=", ";
		String delemiter = "";
		builder = new StringBuilder("NodedStack: [");
		Node<E> currentNode = top;
		while(currentNode != null){
			builder.append(delemiter).append(currentNode.data);
			delemiter = seperator;
			currentNode = currentNode.next;
		}
		builder.append("]");
		return builder.toString();
	}
	
	

}
