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
}
