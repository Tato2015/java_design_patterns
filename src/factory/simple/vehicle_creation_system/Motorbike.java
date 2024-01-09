package factory.simple.vehicle_creation_system;

public class Motorbike extends Vehicle implements IVehicle {
	
	public Motorbike(String brand, int wheels, int seats) {
		super(brand, wheels, seats);
		System.out.println("\n Motorbike was created! ");
	}

	public void speedUp() {
		System.out.println(" This motorbike ( " + this.brand + " ) " + " is speeding up.");
	}

	public void brake() {
		System.out.println(" This motorbike ( " + this.brand + " ) " + " is braking.");
	}
}
