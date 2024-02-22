package factory.abstract_.animal_creation;

public abstract class AnimalFactory {
	
	protected abstract Tiger createTiger(String color);
	
	protected abstract Dog createDog(String color);

}
