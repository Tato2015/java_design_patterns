package factory.simple.vehicle_creation_system;

public class Vehicle {
	
	protected String brand;
	protected int wheels;
	protected int seats;

	public Vehicle(String brand, int wheels, int seats) {
		this.brand = brand;
		this.wheels = wheels;
		this.seats = seats;
	}

	public void displayInformation() {
		System.out.println();
		System.out.println(" Brand : " + this.brand);
		System.out.println(" Wheels : " + this.wheels);
		System.out.println(" Seats : " + this.seats);
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWheels() {
		return this.wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeats() {
		return this.seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
}
