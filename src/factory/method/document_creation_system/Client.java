package factory.method.document_creation_system;

public class Client {

	public static void main(String[] args) {
		
		System.out.println(" ***** Factory Method Pattern ***** ");
		
		DocumentFactory factory;
		IDocument iDocument;
		factory = new PdfFactory();
		iDocument = factory.createDocument();
		iDocument.createHeader();
		iDocument.createBody();
		
		factory = new WordFactory();
		iDocument = factory.createDocument();
		iDocument.createHeader();
		iDocument.createBody();
		
		factory = new HtmlFactory();
		iDocument = factory.createDocument();
		iDocument.createHeader();
		iDocument.createBody();

	}

}
