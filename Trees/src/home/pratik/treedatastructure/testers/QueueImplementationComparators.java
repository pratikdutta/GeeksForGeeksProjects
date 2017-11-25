package home.pratik.treedatastructure.testers;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplementationComparators {

	public static void main(String[] args) {

		Queue<Integer> qLL = new LinkedList<>();
		Queue<Integer> qPQ = new PriorityQueue<>();
		
		qLL.add(1);qPQ.add(1);
		qLL.add(2);qPQ.add(2);
		qLL.add(3);qPQ.add(3);
		qLL.add(4);qPQ.add(4);
		qLL.add(5);qPQ.add(5);
		qLL.poll();qPQ.poll();
		qLL.peek();qPQ.peek();
		qLL.add(6);qPQ.add(6);
		qLL.add(7);qPQ.add(7);
		qLL.poll();qPQ.poll();
		qLL.add(8);qPQ.add(8);
		qLL.add(9);qPQ.add(9);
		qLL.add(10);qPQ.add(10);
	}
}
