package factory.method.database_connection_system;

public class MysqlConnectionFactory extends DatabaseConnectionFactory{

	@Override
	protected IDatabaseConnection createDatabaseConnection(String user, String password) {
		return new MysqlConnection(user, password);
	}

	

	
	
}
