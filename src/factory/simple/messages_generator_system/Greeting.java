package factory.simple.messages_generator_system;

public class Greeting extends Message implements IMessage{

	public Greeting(String format, String content) {
		super(format, content);
		System.out.println("\nGreeting created!");
	}

	@Override
	public void displayMessage() {
		System.out.println("Format : " + this.format);
		System.out.println("Content : " + this.content);
	}

}
