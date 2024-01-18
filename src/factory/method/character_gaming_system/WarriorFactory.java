package factory.method.character_gaming_system;

public class WarriorFactory extends CharacterFactory {

	@Override
	protected ICharacter createCharacter(String name, int level, int exp) {		
		return new Warrior(name, level, exp);
	}

	
	
}
