package factory.simple.vehicle_creation_system;

public class VehicleFactory {

	public enum Type {
		CAR, MOTORBIKE, BICYCLE
	};

	public IVehicle createVehicle(Type vehicleType, String brand, int wheels, int seats) {
		
		IVehicle vehicle;
		
		if (vehicleType.equals(Type.CAR)) {
			vehicle = new Car(brand, wheels, seats);
		} else if (vehicleType.equals(Type.MOTORBIKE)) {
			vehicle = new Motorbike(brand, wheels, seats);
		} else if (vehicleType.equals(Type.BICYCLE)) {
			vehicle = new Bicycle(brand, wheels, seats);
		} else {
			System.out.println("Unknown vehicle ");
			throw new IllegalArgumentException("Unknown vehicle cannot be instantiated.");
		}
		return vehicle;
	}
}
