package factory.abstract_.vehicle_creation_system;

public class OffRoadCar implements Car {

	@Override
	public void drive() {
		System.out.println("Driving off road car.");
	}

	@Override
	public void stop() {
		System.out.println("Stopping off road car.");		
	}

	
	
}
