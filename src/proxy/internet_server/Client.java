package proxy.internet_server;

public class Client {

	public static void main(String[] args) {
		
		InternetServer internetServer = new ProxyInternetServer();
		internetServer.access("page1.com");
		internetServer.access("page4.com");

	}

}
