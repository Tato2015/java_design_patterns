package factory.method.database_connection_system;

public class DatabaseConnection {

	protected String user;
	protected String password;

	public DatabaseConnection(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
