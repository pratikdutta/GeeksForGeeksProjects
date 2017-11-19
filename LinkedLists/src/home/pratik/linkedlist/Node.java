package home.pratik.linkedlist;


class Node<M>{
	M data;
	Node<M> next;
	
	Node(M data, Node<M> next){
		this.data = data;
		this.next = next;
	}
}