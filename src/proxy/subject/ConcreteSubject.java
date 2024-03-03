package proxy.subject;

class ConcreteSubject extends Subject {

	@Override
	public void doSomeWork(String user) {

		System.out.println(user + " invokes the method-doSomeWork(). ");

	}

}
