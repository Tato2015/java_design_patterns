package singleton.user;

public class UserRegister {
	
	private static UserRegister userRegister;
	
	private UserRegister() {
		
	}
	
	public static synchronized UserRegister getUserRegister() {
		if( userRegister == null ) {
			userRegister = new UserRegister();
			System.out.println("\tA new user register is elected.");
		} else {
			System.out.println("\tYou already have a user register.");
		}
		return userRegister;
	}

}
