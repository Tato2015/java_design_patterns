package factory.method.document_creation_system;

public class WordFactory extends DocumentFactory{

	@Override
	protected IDocument createDocument() {
		return new Word();
	}

}
