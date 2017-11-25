package home.pratik.datastructures;

public interface CustomQueue<E> {
	
	boolean add(E e);
	
	boolean offer(E e);
	
	E remove();
	
	E poll();
	
	E element();
	
	E peek();
	
	int size();
}
