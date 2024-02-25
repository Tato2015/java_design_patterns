package builder.vehicle;

public class Client {

	public static void main(String[] args) {

		System.out.println(" *** Builder Pattern Design *** ");
		
		//Making a car
		Builder builder = new CarBuilder();
		//Construction steps
		//Make body -> add wheels -> the add the brand name
		Vehicle vehicle = builder
							.buildBody()
							.insertWheels()
							.addBrandName()
							.getVehicle();
		vehicle.showProduct();
		
		
		//Making a motorcycle
		builder = new MotorcycleBuilder();
		//Add brand name -> make body -> inset wheels
		vehicle = builder
					.addBrandName()
					.buildBody()
					.insertWheels()
					.getVehicle();
		vehicle.showProduct();
		
	}

}
