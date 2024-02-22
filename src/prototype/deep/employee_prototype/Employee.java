package prototype.deep.employee_prototype;

public class Employee implements Cloneable {

	int id;
	String name;
	EmpAddress empAddress;
	
	public Employee(int id, String name, EmpAddress empAddress) {
		this.id = id;
		this.name = name;
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Emplpoyee [id=" + id + ", name=" + name + ", empAddress=" + empAddress + "]";
	}
	
	public Employee cloneEmployee() throws CloneNotSupportedException {
		Employee employee = (Employee) this.clone();
		employee.empAddress = (EmpAddress) this.empAddress.cloneAddress();
		return employee;
		
	} 
	
	
}
