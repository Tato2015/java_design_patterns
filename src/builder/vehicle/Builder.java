package builder.vehicle;

public interface Builder {

	Builder addBrandName();
	Builder buildBody();
	Builder insertWheels();
	Vehicle getVehicle();
	
}
