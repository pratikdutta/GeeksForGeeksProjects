package home.pratik.datastructures;

public final class Node<E> {

	E data;
	Node<E> next;

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
