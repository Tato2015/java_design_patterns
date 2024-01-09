package factory.simple.vehicle_creation_system;

import factory.simple.vehicle_creation_system.VehicleFactory.Type;

public class Client {
	public static void main(String[] args) {
		System.out.println(" ***** Simple Factory Pattern ***** ");
		VehicleFactory factory = new VehicleFactory();
		IVehicle iVehicle = factory.createVehicle(Type.CAR, "Jetour", 4, 6);
		((Car) iVehicle).displayInformation();
		useVehicle(iVehicle);
		
		iVehicle = factory.createVehicle(Type.MOTORBIKE, "Ducati", 2, 1);
		((Motorbike) iVehicle).displayInformation();
		useVehicle(iVehicle);
		
		iVehicle = factory.createVehicle(Type.BICYCLE, "Giant", 2, 1);
		((Bicycle) iVehicle).displayInformation();
		useVehicle(iVehicle);
	}

	public static void useVehicle(IVehicle iVehicle) {
		iVehicle.speedUp();
		iVehicle.brake();
	}
}
