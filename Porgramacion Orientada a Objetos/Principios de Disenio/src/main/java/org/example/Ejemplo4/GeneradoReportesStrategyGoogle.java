package org.example.Ejemplo4;

public class GeneradoReportesStrategyGoogle implements ReportesStrategy{
    @Override
    public void generarReportesStrategy(String texto, Metadata metadata) {
        // Crea el reporte en formato GoogleSheets en base al texto recibido
        GoogleSheet sheet = new GoogleSheet(texto);
        // Agrega metadata al reporte
        sheet.agregarMetadata(metadata);
        // Guarda el archivo en Google Drive
        sheet.guardar();
    }
}
