package singleton.db_connection;

public class DBConnection {
	
	private static DBConnection dbConnection;
	
	private DBConnection() {
		
	}
	
	
	public static synchronized DBConnection getDBConnection() {
		if( dbConnection == null ) {
			dbConnection = new DBConnection();
			System.out.println("\tA new db connection is elected");
		} else {
			System.out.println("\tYou already have a db connection");
		}
		return dbConnection;
	}

}
