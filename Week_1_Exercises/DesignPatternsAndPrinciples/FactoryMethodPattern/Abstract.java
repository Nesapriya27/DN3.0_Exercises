// Abstract factory class for creating documents
public abstract class DocumentFactory {
    public abstract Document createDocument();

    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }

    public void saveDocument() {
        Document doc = createDocument();
        doc.save();
    }

    public void closeDocument() {
        Document doc = createDocument();
        doc.close();
    }
}
