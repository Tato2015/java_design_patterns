package builder.register_form;

public class RegisterForm extends Form {

	String name;
	String email;
	String user;
	String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "RegisterForm [name=" + name + ", email=" + email + ", user=" + user + ", password=" + password + ", id="
				+ id + ", createAt=" + createAt + "]";
	}

}
