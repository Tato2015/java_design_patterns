package factory.method.database_connection_system;

public class PostgreConnectionFactory extends DatabaseConnectionFactory{

	@Override
	protected IDatabaseConnection createDatabaseConnection(String user, String password) {
		return new PostgreConnection(user, password);
	}

	
	
}
