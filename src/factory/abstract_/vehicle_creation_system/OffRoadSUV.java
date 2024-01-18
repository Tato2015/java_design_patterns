package factory.abstract_.vehicle_creation_system;

public class OffRoadSUV implements Car {

	@Override
	public void drive() {
		System.out.println("Driving off road suv car.");		
	}

	@Override
	public void stop() {
		System.out.println("Stopping off road suv car.");
	}

	
	
}
