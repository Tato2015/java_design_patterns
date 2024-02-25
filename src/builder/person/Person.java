package builder.person;

public abstract class Person {

	int id;
	String name;
	int yearsOld;
	String gender;

	public Person() {
		super();
	}

	public Person(int id, String name, int yearsOld, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.yearsOld = yearsOld;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", yearsOld=" + yearsOld + ", gender=" + gender + "]";
	}

}
