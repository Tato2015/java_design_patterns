package proxy.internet_server;

import java.util.Arrays;
import java.util.List;

public class ProxyInternetServer implements InternetServer {

	private RealInternetServer realInternetServer;
	private List<String> blockedPages = Arrays.asList("page1.com","page2.com","page3.com");
	
	@Override
	public void access(String webPage) {
		if( blockedPages.contains(webPage) ) {
			System.out.println("Access to " + webPage + " blocked. ");
		}else {
			if( realInternetServer == null ) {
				realInternetServer = new RealInternetServer();
			}
			realInternetServer.access(webPage);
		}
		
	}

}
