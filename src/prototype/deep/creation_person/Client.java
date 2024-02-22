package prototype.deep.creation_person;

public class Client {

	public static void main(String[] args) {
		
		Person person = new Person("Geraldo", 31, new Address("Av X", 1));
		
		try {
			
			Person personClone = person.clone();
			personClone.setName("Tato tato");
			personClone.setAddress(new Address("Av Y", 2));
			
			
			System.out.println(" Original Person ");
			System.out.println( person.toString() );

			System.out.println(" Clone Person ");
			System.out.println( personClone.toString() );
			
			
		} catch ( CloneNotSupportedException e ) {
			e.printStackTrace();
		}

	}

}
