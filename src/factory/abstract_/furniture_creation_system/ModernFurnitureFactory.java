package factory.abstract_.furniture_creation_system;

public class ModernFurnitureFactory extends FurnitureFactory{

	@Override
	public Chair createChair() {
		return new ModernChair();
	}

	@Override
	public Sofa createSofa() {
		return new ModernSofa();
	}

	
	
}
