package org.example.OtrosEjercicios.Ejercicio4;

//a) Identificar y justificar todos los principios de diseño que se violan.
//b) Proponer e implementar una posible solución que respete dichos principios. Justificar por qué la solución elegida resuelve los problemas del punto (a).

//public class Reporte {
//    public void generarReporte(String datos) {
//        System.out.println("Generando reporte con: " + datos);
//    }
//
//    public void enviarPorEmail(String email, String contenido) {
//        System.out.println("Enviando reporte a: " + email);
//    }
//}

//a)
//
//En este caso se violaria el principio de Single Responsability ya que el reporte
//no tendria porque estar ocupado de generarse y enviarse
//Lo mejor seria tener dos entidades que se ocupen de generar el reporte y otra que lo envie


class GeneradorDeReporte {
    public void generarReporte(String datos) {
        System.out.println("Generando reporte con: " + datos);
    }
}

class EnviadorDeEmail {
    public void enviarPorEmail(String email, String contenido) {
        System.out.println("Enviando reporte a: " + email);
    }
}


