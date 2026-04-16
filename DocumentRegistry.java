public class DocumentRegistry {
    private PdfDocument pdfDocumentPrototype = new PdfDocument("default.pdf", "Default", 0, "Default Name");
    private TextDocument textDocumentPrototype = new TextDocument("default.txt", "UTF-8", 0);
    private SpreadsheetDocument spreadsheetDocumentPrototype = new SpreadsheetDocument("default.xlsx", 0, 0);
    
public Document createPdf(String fileName, String author, int pageCount, String name) {
        PdfDocument newPdf = pdfDocumentPrototype.clone();
        newPdf.setFileName(fileName);
        newPdf.setAuthor(author);
        newPdf.setPageCount(pageCount);
        newPdf.setName(name);
        return newPdf;
    }

    public Document createText(String filePath, String encoding, int wordCount) {
        TextDocument newText = textDocumentPrototype.clone();
        newText.setFilePath(filePath);
        newText.setEncoding(encoding);
        newText.setWordCount(wordCount);
        return newText;
    }

    public Document createSpreadsheet(String name, int rows, int cols) {
        SpreadsheetDocument newSpreadsheet = spreadsheetDocumentPrototype.clone();
        newSpreadsheet.setSpreadsheetName(name);
        newSpreadsheet.setRowCount(rows);
        newSpreadsheet.setColumnCount(cols);
        return newSpreadsheet;
    }
}
