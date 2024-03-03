package proxy.subject;

public class Client {

	public static void main(String[] args) {

		System.out.println("*** Proxy Pattern Demonstration ***");
		Subject proxy = new ProxySubject();
		proxy.doSomeWork("Admin");
		proxy.doSomeWork("Robin");

	}

}
