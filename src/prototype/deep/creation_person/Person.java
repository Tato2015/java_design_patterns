package prototype.deep.creation_person;

public class Person implements Cloneable {

	private String name;
	private int yearsOld;
	private Address address;

	public Person(String name, int yearsOld, Address address) {
		super();
		this.name = name;
		this.yearsOld = yearsOld;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", yearsOld=" + yearsOld + ", address=" + address + "]";
	}

	@Override
	public Person clone() throws CloneNotSupportedException{
		Person person = ( Person ) super.clone();
		person.address =  this.address.clone();
		return person;
	}
	
}
