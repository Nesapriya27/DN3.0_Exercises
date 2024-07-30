public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        // Create factory instances for each document type
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        // Use the factories to create and operate on documents
        System.out.println("Testing Word Document:");
        wordFactory.openDocument();
        wordFactory.saveDocument();
        wordFactory.closeDocument();

        System.out.println("\nTesting PDF Document:");
        pdfFactory.openDocument();
        pdfFactory.saveDocument();
        pdfFactory.closeDocument();

        System.out.println("\nTesting Excel Document:");
        excelFactory.openDocument();
        excelFactory.saveDocument();
        excelFactory.closeDocument();
    }
}
