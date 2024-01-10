package factory.simple.messages_generator_system;

import factory.simple.messages_generator_system.MessageFactory.Type;

public class Client {

	public static void main(String[] args) {
		MessageFactory factory = new MessageFactory();
		IMessage iMessage = factory.createMessage(Type.GREETING, "Test fornat", "Hello this is a greeting from somewhere");
		factory.addMessage(iMessage);
		
		factory.printMessages();
	}

}
