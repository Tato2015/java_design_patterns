package factory.abstract_.furniture_creation_system;

public class VictorianFurnitureFactory extends FurnitureFactory {

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}

	
	
}
