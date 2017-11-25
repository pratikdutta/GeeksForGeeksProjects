package home.pratik.datastructures;

public class BinaryTree<E> {

	E data;
	Node<E> leftChild;
	Node<E> rightChild;

	public BinaryTree() {

	}

	public BinaryTree(Node<E> leftChild, Node<E> rightChild, E data) {
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.data = data;
	}
}
