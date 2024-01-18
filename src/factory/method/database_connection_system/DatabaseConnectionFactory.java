package factory.method.database_connection_system;

public abstract class DatabaseConnectionFactory {

	protected abstract IDatabaseConnection createDatabaseConnection(String user,String password);
	
}
