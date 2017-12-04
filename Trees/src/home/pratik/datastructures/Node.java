package home.pratik.datastructures;

public class Node<E> {

	protected E data;
	protected Node<E> next;

	public Node() {
	}

	public Node(E data) {
		this.data = data;
	}

	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
}
