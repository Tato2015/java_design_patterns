package prototype.deep.employee_prototype;

public class EmpAddress implements Cloneable {

	String address;
	
	public EmpAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return this.address;
	}
	
	public EmpAddress cloneAddress() throws CloneNotSupportedException{
		//Shallow copy
		return (EmpAddress) this.clone();
		
	}
	
}
