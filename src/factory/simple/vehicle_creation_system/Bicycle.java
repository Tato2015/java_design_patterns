package factory.simple.vehicle_creation_system;

public class Bicycle extends Vehicle implements IVehicle {
	
	public Bicycle(String brand, int wheels, int seats) {
		super(brand, wheels, seats);
		System.out.println("\n Bicycle was created! ");
	}

	public void speedUp() {
		System.out.println(" This bicycle ( " + this.brand + " ) " + " is speeding up.");
	}

	public void brake() {
		System.out.println(" This bicycle ( " + this.brand + " ) " + " is braking.");
	}
}