package home.pratik.linkedlist;

import com.sun.media.sound.InvalidDataException;

public class LinkedListMergeSort {
	
	public LinkedList<Integer> mergeSortList(LinkedList<Integer> list){
		if(list == null){
			return new LinkedList<>();
		}
		Node<Integer> head = list.getHead();
		Node<Integer> finalNode = mergeSort(head);
		LinkedList<Integer> sortedList = new LinkedList<>();
		sortedList.addNodeAfterTail(finalNode);
		return sortedList;
	}
	
	private Node<Integer> mergeSort(Node<Integer> node) {
		if (node == null || node.next == null) {
			return node;
		}
		Node<Integer> middle = getMiddle(node);
		Node<Integer> nextToMiddle = middle.next;
		middle.next = null;
		Node<Integer> left = mergeSort(node);
		Node<Integer> right = mergeSort(nextToMiddle);

		return sortedMerge(left, right);
	}
	
	private Node<Integer> sortedMerge(Node<Integer> node1, Node<Integer> node2){
		Node<Integer> result = null;
		if(node1 == null){
			return node2;
		}
		if(node2 == null){
			return node1;
		}
		
		if(node1.data<=node2.data){
			result = node1;
			result.next = sortedMerge(node1.next, node2);
		}else{
			result = node2;
			result.next = sortedMerge(node1, node2.next);
		}
		return result;
	}
	
	
	private Node<Integer> getMiddleNode(Node<Integer> node) {
		Node<Integer> faster = node;
		Node<Integer> slower = node;
		int nodeCounter = 0;
		while (faster != null) {
			if (nodeCounter % 2 != 0) {
				slower = slower.next;
			}
			faster = faster.next;
			nodeCounter++;
		}
		return slower;
	}
	
	
	private Node<Integer> getMiddle(Node<Integer> node) {
		if (node == null)
			return node;
		Node<Integer> fastptr = node.next;
		Node<Integer> slowptr = node;
		while (fastptr != null) {
			fastptr = fastptr.next;
			if (fastptr != null) {
				slowptr = slowptr.next;
				fastptr = fastptr.next;
			}
		}
		return slowptr;
	}
	
	
	
	public static void main(String[] args) throws InvalidDataException {
		LinkedList<Integer> list = new LinkedList<>();
		list.addAfterTail(45);
		list.addAfterTail(25);
		list.addAfterTail(65);
		list.addAfterTail(85);
		list.addAfterTail(15);
		list.addAfterTail(5);
		list.addAfterTail(2);
		
		System.out.println("Unsorted: "+list);
		LinkedList<Integer> sortedList = new LinkedListMergeSort().mergeSortList(list);
		System.out.println("Sorted: "+sortedList);
	}
}
