package factory.method.document_creation_system;

public class Html implements IDocument {

	public Html() {
		System.out.println("\nHtml created! ");
	}
	
	@Override
	public void createHeader() {
		System.out.println("Header created in html.");
		
	}

	@Override
	public void createBody() {
		System.out.println("Body created in html.");
		
	}

}
