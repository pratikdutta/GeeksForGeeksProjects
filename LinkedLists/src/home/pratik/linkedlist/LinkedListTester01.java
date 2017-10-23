package home.pratik.linkedlist;

import javax.activity.InvalidActivityException;

import com.sun.media.sound.InvalidDataException;

import home.pratik.linkedlist.LinkedList;

public class LinkedListTester01 {

	public static void main(String[] args) {
		LinkedList<Car> cars = new LinkedList<>();
		try {
			Car car1 = new Car("123", "MK1", "MDL1");
			Car car2 = new Car("456", "MK2", "MDL2");
			Car car3 = new Car("789", "MK3", "MDL3");
			Car car4 = new Car("981", "MK4", "MDL4");
			Car car5 = new Car("234", "MK5", "MDL5");
			Car car6 = new Car("990", "MK5", "MDL5");
			cars.addBeforeHead(car1);
			cars.addAfterTail(car2);
			cars.addBeforeHead(car3);
			System.out.println("Cars Size: "+cars.getSize());
			try {
				cars.deleteNode(car3);
				System.out.println("Cars_01: "+cars);
				System.out.println("Cars Size After Deletion: "+cars.getSize());
				System.out.println("Cars Count After Deletion: "+cars.getCount());
				System.out.println("Cars Count_Rec After Deletion: "+cars.getCountRec());
				cars.addAfterTail(car4);
				System.out.println("Cars_02: "+cars);
				System.out.println("Cars Size After Second Addition: "+cars.getSize());
				System.out.println("Cars Count After Second Addition: "+cars.getCount());
				System.out.println("Cars Count_Rec After Second Addition: "+cars.getCountRec());
				cars.addBeforeHead(car5);
				System.out.println("Cars_03: "+cars);
				System.out.println("Cars Size After Third Addition: "+cars.getSize());
				System.out.println("Cars Count After Third Addition: "+cars.getCount());
				System.out.println("Cars Count_Rec After Third Addition: "+cars.getCountRec());
				cars.deleteNode(car2);
				System.out.println("Cars_04: "+cars);
				System.out.println("Cars Size After Second Deletion: "+cars.getSize());
				System.out.println("Cars Count After Second Deletion: "+cars.getCount());
				System.out.println("Cars Count_Rec After Second Deletion: "+cars.getCountRec());
				cars.addBeforeHead(car6);
				System.out.println("Cars_05: "+cars);
			} catch (InvalidActivityException e) {
				e.printStackTrace();
			}
		} catch (InvalidDataException e) {
			e.printStackTrace();
		}
		System.out.println("Cars: "+cars);
	}

}
