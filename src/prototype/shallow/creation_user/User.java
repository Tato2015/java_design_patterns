package prototype.shallow.creation_user;

public class User implements Cloneable {

	private String name;

	private Integer yearsOld;

	private String email;

	public User() {
		super();
	}

	public User(String name, Integer yearsOld, String email) {
		super();
		this.name = name;
		this.yearsOld = yearsOld;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(Integer yearsOld) {
		this.yearsOld = yearsOld;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public User clone() throws CloneNotSupportedException {
		return (User) super.clone();
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", yearsOld=" + yearsOld + ", email=" + email + "]";
	}

}
