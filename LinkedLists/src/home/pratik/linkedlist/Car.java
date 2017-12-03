package home.pratik.linkedlist;

import java.io.Serializable;

public class Car implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String number;
	String make;
	String model;
	
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}else if(obj instanceof Car) {
			Car obj2 = (Car)obj;
			if(this.number.equals(obj2.number)) {
				return this.number.equals(obj2.number);
			}return false;
		}
		return false;
	}
	
	/**
	 * Dummy Implementation, Not to be used
	 */
	@Override
	public int hashCode(){
		return 0;
	}
	
	
}
