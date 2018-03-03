package home.pratik.traversals;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.sun.media.sound.InvalidDataException;

import home.pratik.datastructures.BinaryTree;
import home.pratik.datastructures.BinaryTreeNode;
import junit.framework.TestCase;

public class PostOrderTraversalTester extends TestCase {

	private static final Logger LOG = Logger.getLogger(PostOrderTraversalTester.class);

//	@Test
	public void xtestPostOrderTraversal() throws InvalidDataException {
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
		String traversalString = intsTree.postOrdertraversal(intRootNode);
		assertEquals("LinkedList [1, 8, 2, 10, 9, 14, 12, 11, 13, 16, 15, 18, 17, 20]", traversalString);
		LOG.info("Post-Order-Traversal String : " + traversalString);
	}
	
	@Test
	public void testPostOrderTraversalWithSetTWO() throws InvalidDataException {
		BinaryTreeNode<Integer> intRootNode = new BinaryTreeNode<>(1);
		intRootNode.setLeftChild(new BinaryTreeNode<>(2));
		intRootNode.setRightChild(new BinaryTreeNode<>(3));
		intRootNode.getLeftChild().setLeftChild(new BinaryTreeNode<>(4));
		intRootNode.getLeftChild().setRightChild(new BinaryTreeNode<>(5));
		intRootNode.getRightChild().setLeftChild(new BinaryTreeNode<>(6));
		intRootNode.getRightChild().setRightChild(new BinaryTreeNode<>(7));
		

		BinaryTree<Integer> intsTree = new BinaryTree<>();
		intsTree.postOrdertraversal(intRootNode);
		String traversalString = intsTree.postOrdertraversal(intRootNode);
		assertEquals("LinkedList [4, 5, 2, 6, 7, 3, 1]", traversalString);
		LOG.info("Post-Order-Traversal String : " + traversalString);
	}

}
