package builder.person;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
		
		System.out.println(" *** Design Pattern Builder ");
		
		Builder builder = new EmployeeBuilder();
		Person employee = builder
						.id(1)
						.name("Tato")
						.yearsOld(32)
						.gender("male")
						.dateAdmission(LocalDate.now())
						.getPerson();
		System.out.println(employee.toString());
		
		builder = new EmployeeBuilder();
		Person anotherEmployee = builder
									.id(2)
									.getPerson();
		System.out.println(anotherEmployee.toString());
									
		
	}
	
}
