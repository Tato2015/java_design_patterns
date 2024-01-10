package factory.method.document_creation_system;

public class Pdf implements IDocument{
	
	public Pdf() {
		System.out.println("\nPdf created! ");
	}

	@Override
	public void createHeader() {
		System.out.println("Header created in pdf.");
		
	}

	@Override
	public void createBody() {
		System.out.println("Body created in pdf.");
	}

}
