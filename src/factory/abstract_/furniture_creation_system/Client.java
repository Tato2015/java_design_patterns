package factory.abstract_.furniture_creation_system;

public class Client {

	public static void main(String[] args) {

		System.out.println(" ***** ABSTRACT FACTORY PATTERN ***** ");
		
		FurnitureFactory factory;
		factory = new ModernFurnitureFactory();
		
		Chair chair = factory.createChair();
		Sofa sofa = factory.createSofa();		
		chair.sit();
		sofa.lieDown();
		
		factory = new VictorianFurnitureFactory();		
		chair = factory.createChair();
		sofa = factory.createSofa();
		chair.sit();
		sofa.lieDown();
		

	}

}
