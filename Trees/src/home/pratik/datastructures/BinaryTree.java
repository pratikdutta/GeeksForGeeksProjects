package home.pratik.datastructures;

import com.sun.media.sound.InvalidDataException;

public class BinaryTree<E> {
	
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
	
	
	public String preOrderTraversal(BinaryTreeNode<E> rootNode) throws InvalidDataException{
		LinkedList<E> preOrderList = null;
		NodedStack<BinaryTreeNode<E>> stack = null;
		BinaryTreeNode<E> currentNode = null;
		if(rootNode != null){
			preOrderList = new LinkedList<>();
			stack = new NodedStack<>(rootNode);
			while (!stack.empty()) {
				currentNode = stack.pop();
				if (currentNode != null) {
					preOrderList.addAfterTail(currentNode.data);
					stack.push(currentNode.rightChild);
					stack.push(currentNode.leftChild);
				}
			}
		}
		if(preOrderList != null)
			return preOrderList.toString();
		return null;
	}
	
	
	public String morrisPreOrderTraversal(BinaryTreeNode<E> rootNode){
		
		
		return null;
	}
	
	
	public String inOrderTraversal(BinaryTreeNode<E> rootNode) throws InvalidDataException{
		LinkedList<E> publishableList = null;
		NodedStack<BinaryTreeNode<E>> stack = null;
		BinaryTreeNode<E> currentNode = null;
		if(rootNode != null){
			publishableList = new LinkedList<>();
			stack = new NodedStack<>();
			currentNode = rootNode;
			while(currentNode != null){
				stack.push(currentNode);
				currentNode = currentNode.leftChild;
			}
			while (!stack.empty()) {
				publishableList.addAfterTail(stack.peek().data);
				currentNode = stack.pop().rightChild;
				while (currentNode != null) {
					stack.push(currentNode);
					currentNode = currentNode.leftChild;
				}
			}
		}
		if(publishableList != null)
			return publishableList.toString();
		return null;
	}
	
	public String postOrdertraversal(BinaryTreeNode<E> rootNode) throws InvalidDataException{
		LinkedList<E> publishableList = null;
		NodedStack<BinaryTreeNode<E>> stack = null;
		BinaryTreeNode<E> currentNode = null;
		if(rootNode != null){
			currentNode = rootNode;
			stack = new NodedStack<>();
			publishableList = new LinkedList<>();
			while (currentNode != null) {
				stack.push(currentNode.rightChild);
				stack.push(currentNode);
				currentNode = currentNode.leftChild;
			}
			while (!stack.empty()) {
				currentNode = stack.pop();
				while (currentNode != null && currentNode.rightChild != null
						&& stack.peek().equals(currentNode.rightChild)) {
					BinaryTreeNode<E> currNodeRC = stack.pop();
					stack.push(currentNode);
					currentNode = currNodeRC;
					while (currentNode != null) {
						stack.push(currentNode.rightChild);
						stack.push(currentNode);
						currentNode = currentNode.leftChild;
					}
				}
				if(currentNode != null)
					publishableList.addAfterTail(currentNode.data);

			}
		}
		return publishableList.toString();
	}
}
