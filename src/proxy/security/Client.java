package proxy.security;

public class Client {

	public static void main(String[] args) {

		File file = new ProxyFile("document.pdf", "admin");
		file.access();
		
		//Trying access with an user who doesn't has permission
		File fileNotAuthorize = new ProxyFile("document.pff", "user");
		fileNotAuthorize.access();

	}

}
