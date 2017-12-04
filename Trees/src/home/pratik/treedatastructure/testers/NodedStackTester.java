package home.pratik.treedatastructure.testers;

import org.apache.log4j.Logger;

import home.pratik.datastructures.NodedStack;

public class NodedStackTester {
	
	private static final Logger LOG = Logger.getLogger(NodedStackTester.class);
	private static final String STACK_STATUS = "STACK STATUS : ";

	public static void main(String[] args) {
		NodedStack<Integer> stack = new NodedStack<>(null);
		LOG.info(stack.toString());
		
		NodedStack<Integer> stack01 = new NodedStack<>(12);
		LOG.info(STACK_STATUS+stack01.toString());
		stack01.push(9);
		stack01.push(14);
		stack01.push(2);
		stack01.push(10);
		stack01.push(13);
		stack01.push(16);
		LOG.info(STACK_STATUS+stack01.toString());
		LOG.info(stack01.peek());
		LOG.info(STACK_STATUS+stack01.toString());
		LOG.info(stack01.pop());
		LOG.info(STACK_STATUS+stack01.toString());
	}

}
