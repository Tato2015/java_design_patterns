package prototype.shallow.basic_car_prototype;

public class Client {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		System.out.println(" *** Prototype Pattern Demo *** ");
		
		//Working with a nano car
		BasicCar nano = new Nano("Nano X624 cc");
		System.out.println(nano);
		System.out.println("--------");
		
		//Getting a cloneod version of Nano
		BasicCar clonedCar;
		clonedCar = nano.clone();
		//Working with the cloned Nano
		printCarDetail(clonedCar);
		
		System.out.println("--------");
		
		//Working with a Ford car copy
		BasicCar ford = new Ford("Ford Aspire");
		System.out.println(ford);
		System.out.println("--------");
		
		//Getting a cloned version of ford
		clonedCar = ford.clone();
		//Working with the cloned Ford
		printCarDetail(clonedCar);
		System.out.println("--------");
		
		
		
	} 
	
	
	private static void printCarDetail(BasicCar car) {
		System.out.println("Editing a cloned model : ");
		System.out.println("Model : " + car.modelName);
		//Editing the on road price of a car
		//This is an optional step
		car.onRoadPrice += 100;
		System.out.println("It's on-road price : $ " + car.onRoadPrice);
	}


}
