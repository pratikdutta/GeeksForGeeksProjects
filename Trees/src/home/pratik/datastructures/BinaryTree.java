package home.pratik.datastructures;

import org.apache.log4j.Logger;

import com.sun.media.sound.InvalidDataException;

public class BinaryTree<E> {
	
	private static final Logger LOG = Logger.getLogger(BinaryTree.class);

	public String levelOrderTraversal(BinaryTreeNode<E> rootNode) throws InvalidDataException{
		LinkedList<E> levelOrderList = null;
		LinkedListedQueue<BinaryTreeNode<E>> queue = null;
		BinaryTreeNode<E> currentNode = null;
		if(rootNode != null){
			levelOrderList = new LinkedList<>();
			queue = new LinkedListedQueue<>();
			queue.add(rootNode);
			while(!queue.isEmpty()){
				currentNode = queue.poll();
				levelOrderList.addAfterTail(currentNode.data);
				queue.add(currentNode.leftChild);
				queue.add(currentNode.rightChild);
			}
			return levelOrderList.toString();
		}
		return null;
	}
	
	
	public String preOrderTraversal(BinaryTreeNode<E> rootNode){
		LinkedList<E> preOrderList = null;
		NodedStack<BinaryTreeNode<E>> stack = null;
		BinaryTreeNode<E> currentNode = null;
		if(rootNode != null){
			preOrderList = new LinkedList<>();
			stack = new NodedStack<>(rootNode);
			while(!stack.empty()){
				currentNode = stack.pop();
				try {
					if(currentNode != null){
						preOrderList.addAfterTail(currentNode.data);
						stack.push(currentNode.rightChild);
						stack.push(currentNode.leftChild);
					}
				} catch (InvalidDataException e) {
					LOG.error("Exception Occured : ", e);
				}
			}
		}
		if(preOrderList != null)
			return preOrderList.toString();
		return null;
	}
}
