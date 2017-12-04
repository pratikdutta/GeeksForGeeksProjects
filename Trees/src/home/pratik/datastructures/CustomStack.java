package home.pratik.datastructures;

public interface CustomStack<E> {
	
	E push(E item) ;
	
	E pop();
	
	E peek();
	
	boolean empty();
	
	int search(E e);
}
