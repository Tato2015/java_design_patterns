package factory.method.document_creation_system;

public class PdfFactory extends DocumentFactory{

	@Override
	protected IDocument createDocument() {
		return new Pdf();
	}

}
