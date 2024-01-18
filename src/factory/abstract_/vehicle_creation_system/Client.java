package factory.abstract_.vehicle_creation_system;

public class Client {

	public static void main(String[] args) {
		
		System.out.println(" ***** ABSTRACT FACTORY PATTERN ***** ");
		
		VehicleFactory factory;
		factory = new CityVehicleFactory();
		Car car = factory.createCar();
		Car suv = factory.createSUV();
		
		car.drive();
		car.stop();
		suv.drive();
		suv.stop();
		
		factory = new OffRoadVehicleFactory();
		car = factory.createCar();
		suv = factory.createSUV();
		
		car.drive();
		car.stop();
		suv.drive();
		suv.stop();

	}

}
