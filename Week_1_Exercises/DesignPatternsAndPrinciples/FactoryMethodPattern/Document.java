public interface Document {
    void open();
    void save();
    void close();
}

// WordDocument interface extending Document
public interface WordDocument extends Document { }

// PdfDocument interface extending Document
public interface PdfDocument extends Document { }

// ExcelDocument interface extending Document
public interface ExcelDocument extends Document { }
