package builder.vehicle;

import java.util.LinkedList;

public abstract class Vehicle {

	private LinkedList<String> parts;

	public Vehicle() {
		parts = new LinkedList<String>();
	}

	public void add(String part) {
		parts.add(part);
	}

	public void showProduct() {
		System.out.println("These area the construction sequences");
		for( String part: parts ) {
			System.out.println(part);
		}
	}
	
}
