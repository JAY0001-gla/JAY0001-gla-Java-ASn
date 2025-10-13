package Interfaces;

interface ReportExporter {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting report to JSON");
    }
}

class CSVExporter implements ReportExporter {
    public void exportToCSV() { 
        System.out.println("Exported to CSV"); 
    }
    public void exportToPDF() { 
        System.out.println("Exported to PDF"); 
    }
}

public class ExportDemo {
    public static void main(String[] args) {
        CSVExporter exporter = new CSVExporter();
        exporter.exportToJSON();
    }
}

