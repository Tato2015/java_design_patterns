package factory.method.character_gaming_system;

public class Warrior extends Character implements ICharacter {

	public Warrior(String name, int level, int exp) {
		super(name, level, exp);
		System.out.println("\nWarrior created!");
	}

	@Override
	public void attack() {
		System.out.println("Warrior is attacking!");
	}

	@Override
	public void defend() {
		System.out.println("Warrior is defending!");
	}

}
