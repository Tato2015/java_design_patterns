package singleton.captain;

public final class Captain {

	private static Captain captain;
	
	//Making the constructor private
	// to prevent the use of " new "
	private Captain() {}
	
	public static synchronized Captain getCaptain() {
		// Lazy inicialization
		if( captain == null ) {
			captain = new Captain();
			System.out.println("\t A new captain is elected for your team.");
		} else {
			System.out.println("\tYou already have a captain for your team.");
			System.out.println("\tSend him for the toss.");
		}
		return captain;
	}
	
}
