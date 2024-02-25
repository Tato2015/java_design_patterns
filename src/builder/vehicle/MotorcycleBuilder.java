package builder.vehicle;

public class MotorcycleBuilder implements Builder {

	Motorcycle motorcycle;
	
	public MotorcycleBuilder() {
		motorcycle = new Motorcycle("Yoshida");
	}
	
	@Override
	public Builder addBrandName() {
		motorcycle.add("Adding the brand name : " + motorcycle.brandName);
		return this;
	}

	@Override
	public Builder buildBody() {
		motorcycle.add("Making the motorcycle body.");
		return this;
	}

	@Override
	public Builder insertWheels() {
		motorcycle.add("2 wheels are added to the motorcycle.");
		return this;
	}

	@Override
	public Vehicle getVehicle() {
		return motorcycle;
	}

	
	
}
