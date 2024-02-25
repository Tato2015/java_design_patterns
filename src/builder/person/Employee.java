package builder.person;

import java.time.LocalDate;

public class Employee extends Person{

	LocalDate dateAdmission;

	public Employee() {
		super();
	}

	public Employee(LocalDate dateAdmission) {
		super();
		this.dateAdmission = dateAdmission;
	}

	public LocalDate getDateAdmission() {
		return dateAdmission;
	}

	public void setDateAdmission(LocalDate dateAdmission) {
		this.dateAdmission = dateAdmission;
	}

	@Override
	public String toString() {
		return "Employee [dateAdmission=" + dateAdmission + ", id=" + id + ", name=" + name + ", yearsOld=" + yearsOld
				+ ", gender=" + gender + "]";
	}


	
	
	

}
