package factory.simple.messages_generator_system;

import java.util.ArrayList;
import java.util.List;

public class MessageFactory {
	
	List<IMessage> messages;
	
	public enum Type { GREETING }
	
	public MessageFactory() {
		this.messages = new ArrayList<>();
	}
	
	public IMessage createMessage(Type type,String format, String content) {
		
		IMessage iMessage;
		
		if(type.equals(Type.GREETING)) {
			iMessage = new Greeting(format, content);
		} else {
			System.out.println("Unknown message ");
			throw new IllegalArgumentException("Unknown message cannot be instantiated.");
		}
		
		return iMessage;
	}
	
	public void addMessage(IMessage iMessage) {
		this.messages.add(iMessage);
	}
	
	public void printMessages() {
		System.out.println("\n");
		for(IMessage msg : messages) {
			msg.displayMessage();
		}
	}

}
