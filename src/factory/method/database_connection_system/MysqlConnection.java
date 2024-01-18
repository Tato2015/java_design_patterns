package factory.method.database_connection_system;

public class MysqlConnection extends DatabaseConnection implements IDatabaseConnection{

	public MysqlConnection(String user, String password) {
		super(user, password);
		System.out.println("\nMysql connection created!");
	}

	@Override
	public void showUser() {
		System.out.println("User : " + this.user);		
	}
	
	@Override
	public void connect() {
		System.out.println("Connection created!");
		
	}

	@Override
	public void query() {
		System.out.println("Executing query!");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting ....");
		
	}

	

	
	
}
