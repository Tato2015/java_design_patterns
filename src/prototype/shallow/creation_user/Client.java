package prototype.shallow.creation_user;

public class Client {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		User user = new User("Geraldo", 31, "gtato@gmail.com");
		System.out.println( user.toString() );
		
		User otherUser = user.clone();
		otherUser.setName("Tato");
		otherUser.setYearsOld(32);
		System.out.println( otherUser.toString() );
		
		
	}
	
}
