package builder.register_form;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
		
		Builder builder = new RegisterFormBuilder();
		Form registerForm = builder
							.id(1)
							.createAt(LocalDate.now())
							.name("Tato")
							.email("xd@gmail.com")
							.user("Tato")
							.password("***")
							.getForm();
		System.out.println(registerForm.toString());
		
		
	}
	
}
