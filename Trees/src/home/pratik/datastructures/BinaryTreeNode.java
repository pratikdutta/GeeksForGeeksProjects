package home.pratik.datastructures;

public class BinaryTreeNode<E> extends Node<E>{

	protected BinaryTreeNode<E> leftChild;
	protected BinaryTreeNode<E> rightChild;
	
	public BinaryTreeNode(E data){
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	@Override
	public String toString(){
		return this.data.toString();
	}

	public BinaryTreeNode<E> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTreeNode<E> leftChild) {
		this.leftChild = leftChild;
	}

	public BinaryTreeNode<E> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTreeNode<E> rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
