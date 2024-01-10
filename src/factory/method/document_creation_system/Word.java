package factory.method.document_creation_system;

public class Word implements IDocument{

	public Word() {
		System.out.println("\nWord created! ");
	}
	
	@Override
	public void createHeader() {
		System.out.println("Header created in word.");
		
	}

	@Override
	public void createBody() {
		System.out.println("Body created in word.");
		
	}

}
