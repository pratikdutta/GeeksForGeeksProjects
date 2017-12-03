package home.pratik.datastructures;

import org.apache.log4j.Logger;

import com.sun.media.sound.InvalidDataException;

public class BinaryTree<E> {

	private static final Logger LOG = Logger.getLogger(BinaryTree.class);
	
	public String levelOrderTraversal(BinaryTreeNode<E> rootNode) throws InvalidDataException{
		LinkedList<E> list = null;
		LinkedListedQueue<BinaryTreeNode<E>> queue = null;
		BinaryTreeNode<E> currentNode = null;
		if(rootNode != null){
			list = new LinkedList<>();
			queue = new LinkedListedQueue<>();
			queue.add(rootNode);
			while(!queue.isEmpty()){
				currentNode = queue.poll();
				list.addAfterTail(currentNode.data);
				queue.add(currentNode.leftChild);
				queue.add(currentNode.rightChild);
			}
			return list.toString();
		}
		return null;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> intRootNode = new BinaryTreeNode<>(12);
		intRootNode.leftChild = new BinaryTreeNode<>(9);
		intRootNode.rightChild = new BinaryTreeNode<>(14);
		intRootNode.leftChild.leftChild = new BinaryTreeNode<>(2);
		intRootNode.leftChild.rightChild = new BinaryTreeNode<>(10);
		intRootNode.rightChild.leftChild = new BinaryTreeNode<>(13);
		intRootNode.rightChild.rightChild = new BinaryTreeNode<>(16);
		intRootNode.leftChild.leftChild.leftChild = new BinaryTreeNode<>(1);
		intRootNode.leftChild.rightChild.leftChild = new BinaryTreeNode<>(8);
		intRootNode.leftChild.rightChild.rightChild = new BinaryTreeNode<>(11);
		intRootNode.rightChild.rightChild.leftChild = new BinaryTreeNode<>(15);
		intRootNode.rightChild.rightChild.rightChild = new BinaryTreeNode<>(18);
		intRootNode.rightChild.rightChild.rightChild.leftChild = new BinaryTreeNode<>(17);
		intRootNode.rightChild.rightChild.rightChild.rightChild = new BinaryTreeNode<>(20);
		
		BinaryTree<Integer> intsTree = new BinaryTree<>();
		try {
			String traversalString = intsTree.levelOrderTraversal(intRootNode);
			LOG.info("Traversal String : " + traversalString);
		} catch (InvalidDataException e) {
			LOG.error("Exception encountered : ",e);
		}
		
		
	}
}
