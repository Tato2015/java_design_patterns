package factory.abstract_.animal_creation;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println(" *** Abstract Factory Pattern Demo . *** \n");
		AnimalFactory animalFactory;
		animalFactory = new WildAnimalFactory();
		Dog dog = animalFactory.createDog("white");
		Tiger tiger = animalFactory.createTiger("golden and cinnamon");
		dog.displayMe();
		tiger.aboutMe();
		tiger.inviteDog(dog);
		System.out.println("\n ******** \n");
		
		animalFactory = new PetAnimalFactory();
		dog = animalFactory.createDog("black");
		tiger = animalFactory.createTiger("yellow");
		dog.displayMe();
		tiger.aboutMe();
		tiger.inviteDog(dog);
		
		
	}
	

}
