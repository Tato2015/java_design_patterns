package singleton.db_connection;

public class Client {

	public static void main(String[] args) {
		
		System.out.println(" *** Singleton Pattern Demo *** ");
		System.out.println("Trying to make a db connection for you");
		DBConnection dbConnection = DBConnection.getDBConnection();
		System.out.println("Trying to make another db connection for you");
		DBConnection dbConnection2 = DBConnection.getDBConnection();
		if( dbConnection == dbConnection2 ) {
			System.out.println("Both dbConnection and dbConnection2 are the same");
		}
		
		
	}
	
}
