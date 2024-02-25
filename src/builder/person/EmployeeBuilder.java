package builder.person;

import java.time.LocalDate;

public class EmployeeBuilder implements Builder {

	Employee employee;

	public EmployeeBuilder() {
		this.employee = new Employee();
	}
	
	@Override
	public Builder id(int id) {
		this.employee.setId(id);
		return this;
	}

	@Override
	public Builder name(String name) {
		this.employee.setName(name);
		return this;
	}

	@Override
	public Builder yearsOld(int yearsOld) {
		this.employee.setYearsOld(yearsOld);
		return this;
	}

	@Override
	public Builder gender(String gender) {
		this.employee.setGender(gender);
		return this;
	}

	@Override
	public Builder dateAdmission(LocalDate dateAdmission) {
		this.employee.setDateAdmission(dateAdmission);
		return this;
	}

	@Override
	public Person getPerson() {
		return this.employee;
	}

}
