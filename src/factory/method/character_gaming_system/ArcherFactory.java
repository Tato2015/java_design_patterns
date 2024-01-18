package factory.method.character_gaming_system;

public class ArcherFactory extends CharacterFactory{

	@Override
	protected ICharacter createCharacter(String name, int level, int exp) {
		return new Archer(name, level, exp);
	}

}
