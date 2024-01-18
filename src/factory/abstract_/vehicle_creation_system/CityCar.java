package factory.abstract_.vehicle_creation_system;

public class CityCar implements Car {

	@Override
	public void drive() {
		System.out.println("Driving a city car.");		
	}

	@Override
	public void stop() {
		System.out.println("Stopping a city car.");
		
	}

	
	
}
