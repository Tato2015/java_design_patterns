package factory.simple.vehicle_creation_system;

public class Car extends Vehicle implements IVehicle {
	
	public Car(String brand, int wheels, int seats) {
		super(brand, wheels, seats);
		System.out.println("\n Car was created! ");
	}

	public void speedUp() {
		System.out.println(" This car ( " + this.brand + " ) " + " is speeding up.");
	}

	public void brake() {
		System.out.println(" This car ( " + this.brand + " ) " + " is braking.");
	}
}
