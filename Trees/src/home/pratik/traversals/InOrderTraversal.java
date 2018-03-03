package home.pratik.traversals;

import org.apache.log4j.Logger;

import com.sun.media.sound.InvalidDataException;

import home.pratik.datastructures.BinaryTree;
import home.pratik.datastructures.BinaryTreeNode;
import junit.framework.TestCase;

public class InOrderTraversal extends TestCase{

	private static final Logger LOG = Logger.getLogger(InOrderTraversal.class);
	
	public void testInOrderTraversal() throws InvalidDataException{
		BinaryTreeNode<Integer> intRootNode = new BinaryTreeNode<>(12);
		intRootNode.setLeftChild(new BinaryTreeNode<>(9));
		intRootNode.setRightChild(new BinaryTreeNode<>(14));
		intRootNode.getLeftChild().setLeftChild(new BinaryTreeNode<>(2));
		intRootNode.getLeftChild().setRightChild(new BinaryTreeNode<>(10));
		intRootNode.getRightChild().setLeftChild(new BinaryTreeNode<>(13));
		intRootNode.getRightChild().setRightChild(new BinaryTreeNode<>(16));
		intRootNode.getLeftChild().getLeftChild().setLeftChild(new BinaryTreeNode<>(1));
		intRootNode.getLeftChild().getLeftChild().setRightChild(new BinaryTreeNode<>(8));
		intRootNode.getLeftChild().getRightChild().setRightChild(new BinaryTreeNode<>(11));
		intRootNode.getRightChild().getRightChild().setLeftChild(new BinaryTreeNode<>(15));
		intRootNode.getRightChild().getRightChild().setRightChild(new BinaryTreeNode<>(18));
		intRootNode.getRightChild().getRightChild().getRightChild().setLeftChild(new BinaryTreeNode<>(17));
		intRootNode.getRightChild().getRightChild().getRightChild().setRightChild(new BinaryTreeNode<>(20));
		
		BinaryTree<Integer> intsTree = new BinaryTree<>();
		String traversalString = intsTree.inOrderTraversal(intRootNode);
		assertEquals("LinkedList [1, 2, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20]", traversalString);
		LOG.info("In-Order-Traversal String : " + traversalString);
		LOG.info("PASSED");
	}

}
