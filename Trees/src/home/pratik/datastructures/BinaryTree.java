package home.pratik.datastructures;

import com.sun.media.sound.InvalidDataException;

public class BinaryTree<E> {

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
	
	
	public String preOrderTraversal(BinaryTreeNode<E> rootNode){
		
		
		
		return null;
	}
	
}
