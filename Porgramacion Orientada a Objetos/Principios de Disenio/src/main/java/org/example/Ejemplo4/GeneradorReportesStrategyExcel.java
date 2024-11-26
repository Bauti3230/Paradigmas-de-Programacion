package org.example.Ejemplo4;

public class GeneradorReportesStrategyExcel implements ReportesStrategy {
    @Override
    public void generarReportesStrategy(String texto, Metadata metadata) {
        // Crea el reporte en formato Excel en base al texto recibido
        Excel excel = new Excel(texto);
        // Agrega metadata al reporte
        excel.agregarMetadata(metadata);
        // Guarda el archivo en el sistema de archivos
        excel.guardar();
    }
}
