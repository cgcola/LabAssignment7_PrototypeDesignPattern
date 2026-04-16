public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        //PDF Document 1
        Document pdf1 = registry.createPdf("annual_report_2024.pdf", "Acme Corp", 150, "Annual Report");
        pdf1.open();
        System.out.println("Type: " + pdf1.getType() + ", File: " + ((PdfDocument) pdf1).getFileName() + ", Author: " + ((PdfDocument) pdf1).getAuthor() + ", Pages: " + ((PdfDocument) pdf1).getPageCount());

        //Text Document
        Document textDoc = registry.createText("meeting_notes.txt", "UTF-8", 250);
        textDoc.open();
        System.out.println("Type: " + textDoc.getType() + ", Path: " + ((TextDocument) textDoc).getFilePath() + ", Encoding: " + ((TextDocument) textDoc).getEncoding() + ", Words: " + ((TextDocument) textDoc).getWordCount());

        //Spreadsheet Document
        Document sheet = registry.createSpreadsheet("sales_data_q1.xlsx", 1000, 20);
        sheet.open();
        System.out.println("Type: " + sheet.getType() + ", Name: " + ((SpreadsheetDocument) sheet).getSpreadsheetName() + ", Rows: " + ((SpreadsheetDocument) sheet).getRowCount() + ", Columns: " + ((SpreadsheetDocument) sheet).getColumnCount());

        //PDF Document 2
        Document pdf2 = registry.createPdf("summary_report.pdf", "Acme Corp", 30, "Summary Report");
        pdf2.open();
    }
    
}
