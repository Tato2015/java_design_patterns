package singleton.user;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println(" *** Singleton Pattern Demo *** ");
		System.out.println("Trying to make a user register for you");
		UserRegister userRegister = UserRegister.getUserRegister();
		System.out.println("Trying to make another user register for you");
		UserRegister userRegister2 = UserRegister.getUserRegister();
		if( userRegister == userRegister2 ) {
			System.out.println("Both userRegister and userRegister2 are the same.");
		}
		
	}

}
