package home.pratik.datastructures;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayedQueue<E> implements CustomQueue<E> {

	private static final int FIRST_POSITION = 0;
	private int last = -1;
	private static final int INITIAL_SIZE = 12;
	private int size = 0;
	private E[] dataArray;
	private static final int EXPANSION_SIZE = INITIAL_SIZE;

	@SuppressWarnings("unchecked")
	public ArrayedQueue() {
		dataArray = (E[]) new Object[INITIAL_SIZE];
	}

	@SuppressWarnings("unchecked")
	public ArrayedQueue(int initialSize) {
		dataArray = (E[]) new Object[initialSize];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (FIRST_POSITION > last);
	}

	public boolean contains(E e) {
		return indexOf(e) != -1;
	}

	private int indexOf(E e) {
		if (e != null) {
			for (int i = 0; i < size; i++)
				if (e.equals(dataArray[i]))
					return i;
		}
		return -1;
	}

	@Override
	public boolean add(E e) {
		if ((last + 1) == (dataArray.length)) {
			expandArray();
		}
		if (e != null) {
			dataArray[++last] = e;
			size++;
			return true;
		}
		return false;
	}

	private void expandArray() {
		dataArray = Arrays.copyOf(dataArray, (dataArray.length + EXPANSION_SIZE));
	}

	@Override
	public boolean offer(E e) {
		return add(e);
	}

	@Override
	public E poll() {
		if (last == -1)
			return null;
		else
			return dataArray[FIRST_POSITION];
	}

	@Override
	public E remove() {
		E eObject = poll();
		if (eObject == null) {
			throw new NoSuchElementException();
		} else {
			for (int i = FIRST_POSITION; i < last; i++) {
				dataArray[i] = dataArray[i + 1];
				if (dataArray[i + 1] == null) {
					break;
				}
			}
			dataArray[last] = null;
			last--;
			size--;
		}
		return eObject;
	}

	@Override
	public E peek() {
		E eObject = poll();
		if (eObject == null) {
			throw new NoSuchElementException();
		}
		return eObject;
	}

	@Override
	public String toString() {
		int i = 0;
		StringBuilder builder = new StringBuilder();
		String seperator = ", ";
		String delemeter = "";
		while (dataArray[i] != null) {
			builder.append(delemeter).append(dataArray[i]);
			delemeter = seperator;
			i++;
		}
		return builder.toString();
	}

	@Override
	public E element() {
		return dataArray[FIRST_POSITION];
	}

	public E get(int position) {
		if(position<=dataArray.length) {
			return dataArray[position];
		}
		return null;
	}
}
