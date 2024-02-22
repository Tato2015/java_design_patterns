package prototype.deep.creation_person;

public class Address implements Cloneable {

	private String street;
	private int number;

	public Address(String street, int number) {
		super();
		this.street = street;
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + "]";
	}

	@Override
	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}

}
