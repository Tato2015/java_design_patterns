package factory.method.character_gaming_system;

public class Client {

	public static void main(String[] args) {
		System.out.println(" ***** Factory Method Pattern ***** ");
		
		CharacterFactory factory;
		ICharacter iCharacter;
		
		factory = new WarriorFactory();
		iCharacter = factory.createCharacter("Davion", 1, 1000);
		((Warrior) iCharacter).displayInfo();
		showSkills(iCharacter);
		
		factory = new MagicianFactory();
		iCharacter = factory.createCharacter("Dark Magician", 2, 3000);
		((Magician) iCharacter).displayInfo();
		showSkills(iCharacter);

		factory = new ArcherFactory();
		iCharacter = factory.createCharacter("Archer One", 5, 7000);
		((Archer) iCharacter).displayInfo();
		showSkills(iCharacter);
	}
	
	public static void showSkills(ICharacter iCharacter) {
		iCharacter.attack();
		iCharacter.defend();
	}

}
