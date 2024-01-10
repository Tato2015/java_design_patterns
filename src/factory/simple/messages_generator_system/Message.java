package factory.simple.messages_generator_system;

public class Message {

	protected String format;
	protected String content;
	
	public Message(String format, String content) {
		super();
		this.format = format;
		this.content = content;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
