package home.pratik.linkedlist;

import com.sun.media.sound.InvalidDataException;

public class LinkedListTester03 {

	public static void main(String[] args)  throws InvalidDataException{
		Car car1 = new Car("123", "MK1", "MDL1");
		Car car2 = new Car("456", "MK2", "MDL2");
		Car car3 = new Car("789", "MK3", "MDL3");
		Car car4 = new Car("981", "MK4", "MDL4");
		Car car5 = new Car("234", "MK5", "MDL5");
		Car car6 = new Car("990", "MK5", "MDL5");
		LinkedList<Car> cars = new LinkedList<>();
		cars.addBeforeHead(car1);
		cars.addAfterTail(car2);
		cars.addAfterTail(car3);
		cars.addBeforeHead(car4);
		cars.addAfterTail(car5);
		cars.addAfterTail(car6);
		System.out.println("Cars: "+ cars);
		
		System.out.println("3rd Node data: "+cars.get(2));
		System.out.println("Middle Element: "+cars.getMiddleElement());
		System.out.println("2nd Element from the end : "+cars.getNthNodeFromEnd(2));
		cars.reverse();
		System.out.println("Reversed Linked List: " +cars);
	}

}
