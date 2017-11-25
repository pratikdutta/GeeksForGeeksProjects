package home.pratik.domainobjects;

import java.io.Serializable;

public class Car implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String number;
	private String make;
	private String model;
	
	public Car() {
		
	}
	
	public Car(int number) {
		this.number = ((Integer)number).toString();
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
