package home.linkedlist.implementations;

import com.sun.media.sound.InvalidDataException;

import home.pratik.linkedlist.LinkedList;
import home.pratik.linkedlist.Node;

public class YInTwoLinkedLists {
	
	public Node<Integer> detectYPointInLinkedlists(LinkedList<Integer> l1, LinkedList<Integer> l2){
		int len1 = 0;
		int len2 = 0;
		int lenDiff = 0;
		Node<Integer> bigger = null;
		Node<Integer> smaller = null;
		if(null != l1 && null != l2){
			len1 = l1.getSize();
			len2 = l2.getSize();
			lenDiff = Math.abs(len2-len1);
			if(len1>=len2){
				bigger = l1.getHead();
				smaller = l2.getHead();
			}
			else{
				bigger = l2.getHead();
				smaller = l1.getHead();
			}
			while (bigger != null && lenDiff > 0) {
				bigger = bigger.getNext();
				lenDiff--;
			}
			while(bigger != null){
				if(bigger.getData() == smaller.getData()){
					return bigger;
				}
				bigger = bigger.getNext();
				smaller = smaller.getNext();
			}
		}
		return null;
	}

	public static void main(String[] args) throws InvalidDataException {
		Integer b1 = 11;
		Integer b2 = 12;
		Integer b3 = 13;
		Integer b4 = 14;
		Integer s1 = 18;
		Integer s2 = 19;
		Integer s3 = 20;
		Integer s4 = 21;
		
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.addAfterTail(b1);
		l1.addAfterTail(b2);
		l1.addAfterTail(b3);
		l1.addAfterTail(b4);
		
		LinkedList<Integer> l2 = new LinkedList<>();
		l2.addAfterTail(s1);
		l2.addAfterTail(s2);
		l2.addAfterTail(s3);
		l2.addAfterTail(s4);
		
		Node<Integer> yPoint = new YInTwoLinkedLists().detectYPointInLinkedlists(l1, l2);
		System.out.println("Y Point is at: "+((yPoint != null)? yPoint.getData() : "Absent"));
	}

}
