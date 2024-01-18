package factory.method.character_gaming_system;

public class Magician extends Character implements ICharacter {

	public Magician(String name, int level, int exp) {
		super(name, level, exp);
		System.out.println("\nMagician created!");
	}

	@Override
	public void attack() {
		System.out.println("Magician is attacking!");
		
	}

	@Override
	public void defend() {
		System.out.println("Magician is defending!");
		
	}
	
}
