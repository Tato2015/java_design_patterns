package factory.method.database_connection_system;

public interface IDatabaseConnection {
	
	void showUser();
	void connect();
	void query();
	void disconnect();

}
