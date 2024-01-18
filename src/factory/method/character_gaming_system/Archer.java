package factory.method.character_gaming_system;

public class Archer extends Character implements ICharacter {

	public Archer(String name, int level, int exp) {
		super(name, level, exp);
		System.out.println("\nArcher created!");
	}

	@Override
	public void attack() {
		System.out.println("Archer is attacking!");

	}

	@Override
	public void defend() {
		System.out.println("Archer is defending!");

	}

}
