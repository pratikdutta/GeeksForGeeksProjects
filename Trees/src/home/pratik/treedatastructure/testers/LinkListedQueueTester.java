package home.pratik.treedatastructure.testers;

import java.util.ArrayList;
import java.util.List;

import home.pratik.datastructures.LinledListedQueue;
import home.pratik.domainobjects.Car;

public class LinkListedQueueTester {

	public static void main(String[] args) {

		List<Car> cars= new ArrayList<>();
		for(int i=5678; i<5700; i++) {
			Car car = new Car(i);
			cars.add(car);
		}
		LinledListedQueue<Car> queue = new LinledListedQueue<>();
		System.out.println("Queue Empty?: "+queue.isEmpty());
		for(int k = 0; k<5; k++) {
			queue.add(cars.get(k));
		}
		System.out.println("Queue: "+queue.toString());
		System.out.println("Queue Empty?: "+queue.isEmpty());
		queue.remove();
		System.out.println("Queue: "+queue.toString());
		System.out.println("Queue Size: "+queue.size());
		queue.poll();
		for(int k = 6; k<12; k++) {
			queue.offer(cars.get(k));
		}
		System.out.println("Queue: "+queue.toString());
		System.out.println("Queue Size: "+queue.size());
		queue.remove();
		System.out.println("Queue: "+queue.toString());
		System.out.println("Queue Size: "+queue.size());
		for(int k = 13; k<18; k++) {
			queue.offer(cars.get(k));
		}
		System.out.println("Queue: "+queue.toString());
		System.out.println("Queue Size: "+queue.size());
		int size = queue.size();
		for(int p = 0; p<size; p++) {
			queue.remove();
		}
		
		System.out.println("Queue: "+queue.toString());
		System.out.println("Queue Size: "+queue.size());
		System.out.println("Queue Empty?: "+queue.isEmpty());
	}

}
