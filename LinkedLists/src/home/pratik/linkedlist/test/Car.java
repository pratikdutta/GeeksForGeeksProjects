package home.pratik.linkedlist.test;

import java.io.Serializable;

public class Car implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String number;
	private String make;
	private String model;
	
	public Car() {
		
	}

	public Car(String number, String make, String model) {
		this.number = number;
		this.make = make;
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Car: "+this.number;
	}
}
