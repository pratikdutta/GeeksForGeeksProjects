package home.pratik.linkedlist;

public class Node<M>{
	M data;
	Node<M> next;
	
	Node(M data, Node<M> next){
		this.data = data;
		this.next = next;
	}
	
	public M getData() {
		return data;
	}

	public void setData(M data) {
		this.data = data;
	}

	public Node<M> getNext() {
		return next;
	}

	public void setNext(Node<M> next) {
		this.next = next;
	}

	@Override
	public String toString(){
		return data.toString();
	}
}