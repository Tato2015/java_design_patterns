package factory.abstract_.vehicle_creation_system;

public class OffRoadVehicleFactory implements VehicleFactory {

	@Override
	public Car createCar() {
		return new OffRoadCar();
	}

	@Override
	public Car createSUV() {
		return new OffRoadSUV();
	}

	
	
}
