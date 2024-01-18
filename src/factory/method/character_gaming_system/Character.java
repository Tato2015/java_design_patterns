package factory.method.character_gaming_system;

public class Character {

	protected String name;
	protected int level;
	protected int exp;

	public Character(String name, int level, int exp) {
		super();
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	protected void displayInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Level : " + this.level);
		System.out.println("Exp : " + this.exp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}
