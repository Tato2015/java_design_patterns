package proxy.internet_server;

public class RealInternetServer implements InternetServer {

	@Override
	public void access(String webPage) {
		System.out.println("Accessing to the webpage " + webPage);
		
	}

	
	
}
