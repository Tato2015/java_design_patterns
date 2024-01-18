package factory.method.character_gaming_system;

public class MagicianFactory extends CharacterFactory{

	@Override
	protected ICharacter createCharacter(String name, int level, int exp) {
		return new Magician(name, level, exp);
	}

	
	
}
