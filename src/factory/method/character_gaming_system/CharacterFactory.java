package factory.method.character_gaming_system;

public abstract class CharacterFactory {
	
	protected abstract ICharacter createCharacter(String name, int level, int exp);

}
