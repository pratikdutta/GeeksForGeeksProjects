package home.pratik.datastructures;

public class BinaryTreeNode<E> extends Node<E>{

	BinaryTreeNode<E> leftChild;
	BinaryTreeNode<E> rightChild;
	
	public BinaryTreeNode(E data){
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	@Override
	public String toString(){
		return this.data.toString();
	}
}
