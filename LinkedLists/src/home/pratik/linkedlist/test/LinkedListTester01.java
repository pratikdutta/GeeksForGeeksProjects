package home.pratik.linkedlist.test;

import com.sun.media.sound.InvalidDataException;

import home.pratik.linkedlist.LinkedList;

public class LinkedListTester01 {

	public static void main(String[] args) {
		LinkedList<Car> cars = new LinkedList<>();
		System.out.println("cars_01: "+cars);
		try {
			cars.addBeforeHead(new Car("123", "MK1", "MDL1"));
			cars.addBeforeHead(new Car("456", "MK2", "MDL2"));
			cars.addBeforeHead(new Car("789", "MK3", "MDL3"));
			
			cars.addAfterTail(new Car("981", "MK4", "MDL4"));
			
			cars.addBeforeHead(new Car("234", "MK5", "MDL5"));
			
		} catch (InvalidDataException e) {
			e.printStackTrace();
		}
		System.out.println("cars_02: "+cars);
	}

}
