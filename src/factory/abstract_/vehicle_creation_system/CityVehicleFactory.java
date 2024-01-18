package factory.abstract_.vehicle_creation_system;

public class CityVehicleFactory implements VehicleFactory{

	@Override
	public Car createCar() {
		return new CityCar();
	}

	@Override
	public Car createSUV() {
		return new CitySUV();
	}

	
	
}
