package org.example.OtrosEjercicios.Ejercicio1;


//a) Identificar y justificar todos los principios de diseño que se violan.
//b) Proponer e implementar una posible solución que respete dichos principios. Justificar por qué la solución elegida resuelve los problemas del punto (a).

//public class Envio {
//    private String direccion;
//
//    public Envio(String direccion) {
//        this.direccion = direccion;
//    }
//
//    public boolean validarDireccion() {
//        return !direccion.isEmpty() && direccion.contains(" ");
//    }
//
//    public String getDireccion() {
//        return direccion;
//    }
//}
//
//public class ProcesadorDeEnvios {
//    private Envio envio;
//    public void procesar(Envio envio) {
//        if (!envio.validarDireccion()) {
//            throw new RuntimeException("Dirección inválida.");
//        }
//        System.out.println("Envío procesado a la dirección: " + envio.getDireccion());
//    }
//}

//Respuestas :
//a)
//  El principio que se viola en este caso es el de Tell Dont Ask, ya que `ProcesadoDeEnvios` le esta
//  preguntado a `Envio` si la direccion es valida a no. Cuando lo optimo seria enviar el envio
//  y que este ultimo determine si la direccion es valida o no

public class Envio {
    private String direccion;

    public Envio(String direccion) {
        this.direccion = direccion;
    }

    public boolean validarDireccion() {
        return !direccion.isEmpty() && direccion.contains(" ");
    }

    public String getDireccion() {
        return direccion;
    }

    public void validarEnvio() {
        if (!validarDireccion()) {
            System.out.println("El direccion no es valido");
        }else{
            System.out.println("El direccion es valido");
        }
    }
}

class ProcesadorDeEnvios {
    public void procesar(Envio envio) {
        envio.validarEnvio();
    }
}

