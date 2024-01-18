package factory.method.database_connection_system;

public class Client {

	public static void main(String[] args) {

		System.out.println(" ***** Factory Method Pattern ***** ");
		
		DatabaseConnectionFactory factory;
		IDatabaseConnection iDatabaseConnection;
		
		factory = new MysqlConnectionFactory();
		iDatabaseConnection = factory.createDatabaseConnection("USER_A","****");
		iDatabaseConnection.showUser();
		iDatabaseConnection.connect();
		iDatabaseConnection.query();
		iDatabaseConnection.disconnect();
		
		factory = new PostgreConnectionFactory();
		iDatabaseConnection = factory.createDatabaseConnection("USER_B","****");
		iDatabaseConnection.showUser();
		iDatabaseConnection.connect();
		iDatabaseConnection.query();
		iDatabaseConnection.disconnect();

	}

}
