package org.example.Ejemplo4;


/*Identificar y justificar todos los principios de diseño que se violan.
Proponer e implementar una posible solución que respete dichos principios.
Justificar por que el patrón elegido resuelve los problemas identificados.*/

//esto codigo viola uno de los principios SOLID, en especifico el principio
//Open Closed, ya que cada vez que querramos agregar un nuevo generador de reportes
//tendriamos que implementar toda la logica otra vez y como se puede ver el codigo
//es muy parecido en ambos casos.

//public class GeneradorDeReportes {
//    public void generarReporteExcel(String texto, Metadata metadata) {
//        // Crea el reporte en formato Excel en base al texto recibido
//        Excel excel = new Excel(texto);
//        // Agrega metadata al reporte
//        excel.agregarMetadata(metadata);
//        // Guarda el archivo en el sistema de archivos
//        excel.guardar();
//    }
//
//    public void generarReporteGoogleSheet(String texto, Metadata metadata) {
//        // Crea el reporte en formato GoogleSheets en base al texto recibido
//        GoogleSheet sheet = new GoogleSheet(texto);
//        // Agrega metadata al reporte
//        sheet.agregarMetadata(metadata);
//        // Guarda el archivo en Google Drive
//        sheet.guardar();
//    }
//}

//en este caso se reolvio utilizando un patron de disenio conocido como Strategy
//en caso de querer consultar la pagina utilizada fue "refactoring guru"
//Strategy es un patron de disenio que lo que hace es prmitirnos definir una familia
//de algoritmos, se pararlos en clases y hacerlos intercambiables dandonos una mayor una mayor
//ecalabilidad en este caso nuestro `ReportesStrategy` puede ser "cambiado" por
//el generador de Google o el de Excel.

public abstract class GeneradorDeReportes {
    final private ReportesStrategy generator;

    public GeneradorDeReportes(ReportesStrategy generator) {
        this.generator = generator;
    }

    public void generarReportes(String texto, Metadata metadata) {
        generator.generarReportesStrategy(texto, metadata);
    }
}
