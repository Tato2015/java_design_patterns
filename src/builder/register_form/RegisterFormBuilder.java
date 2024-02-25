package builder.register_form;

import java.time.LocalDate;

public class RegisterFormBuilder implements Builder {

	RegisterForm registerForm;

	public RegisterFormBuilder() {
		this.registerForm = new RegisterForm();
	}

	@Override
	public Builder id(int id) {
		this.registerForm.setId(id);
		return this;
	}
	
	@Override
	public Builder createAt(LocalDate localDate) {
		this.registerForm.setCreateAt(localDate);
		return this;
	}

	@Override
	public Builder name(String name) {
		this.registerForm.setName(name);
		return this;
	}

	@Override
	public Builder email(String email) {
		this.registerForm.setEmail(email);
		return this;
	}

	@Override
	public Builder user(String user) {
		this.registerForm.setUser(user);
		return this;
	}

	@Override
	public Builder password(String password) {
		this.registerForm.setPassword(password);
		return this;
	}

	@Override
	public Form getForm() {
		return this.registerForm;
	}

	

}
