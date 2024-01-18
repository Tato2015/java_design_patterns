package factory.abstract_.vehicle_creation_system;

public class CitySUV implements Car{

	@Override
	public void drive() {
		System.out.println("Driving a city suv car.");		
	}

	@Override
	public void stop() {
		System.out.println("Stopping a city suv car.");		
	}

	
	
}
