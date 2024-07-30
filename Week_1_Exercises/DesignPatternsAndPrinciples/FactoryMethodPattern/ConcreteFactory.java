// Concrete factory for creating Word documents
public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocumentImpl();
    }
}

// Concrete factory for creating PDF documents
public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocumentImpl();
    }
}

// Concrete factory for creating Excel documents
public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocumentImpl();
    }
}
