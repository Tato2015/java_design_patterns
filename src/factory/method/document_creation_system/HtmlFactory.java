package factory.method.document_creation_system;

public class HtmlFactory extends DocumentFactory{

	@Override
	protected IDocument createDocument() {
		return new Html();
	}

}
