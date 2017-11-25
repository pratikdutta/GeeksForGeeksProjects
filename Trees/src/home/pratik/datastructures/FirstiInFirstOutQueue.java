package home.pratik.datastructures;

public class FirstiInFirstOutQueue {

	int front; 
	int rear; 
	int size;
	int capacity;
	int array[] = null;

	public FirstiInFirstOutQueue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}
	
	private boolean isFull(FirstiInFirstOutQueue queue) {
		return (queue.size == queue.capacity);
	}

	private boolean isEmpty(FirstiInFirstOutQueue queue) {
		return (queue.size == 0);
	}

	public void enqueue(int item) {
		if (isFull(this))
			return;
		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " enqueued to queue");
	}

	public int dequeue() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return item;
	}

	private int front() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.front];
	}

	private int rear() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.rear];
	}

}
