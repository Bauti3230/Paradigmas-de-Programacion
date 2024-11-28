package org.example.OtrosEjercicios.Ejercicio2;

//a) Identificar y justificar todos los principios de diseño que se violan.
//b) Proponer e implementar una posible solución que respete dichos principios. Justificar por qué la solución elegida resuelve los problemas del punto (a).

//public class Usuario {
//    private String nombre;
//    private int edad;
//
//    public Usuario(String nombre, int edad) {
//        this.nombre = nombre;
//        this.edad = edad;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public int getEdad() {
//        return edad;
//    }
//}
//
//public class GestorDeAcceso {
//    public void autorizar(Usuario usuario) {
//        if (usuario.getEdad() < 18) {
//            throw new RuntimeException("Acceso denegado. Usuario menor de edad.");
//        }
//        System.out.println("Acceso permitido a: " + usuario.getNombre());
//    }
//}

//a)
//
//Viola el principio de Tell Dont Ask, ya que se le esta preguntando a `Usuario` por un estado
//como es el de si su esas es mayor a edad.

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void validarEdad() {
        if (edad < 18) {
            System.out.println("La edad debe ser mayor de 18");
        }else {
            System.out.println("El usuario cumple con la edad");
        }
    }
}

class GestorDeAcceso {
    public void autorizar(Usuario usuario) {
        usuario.validarEdad();
    }
}

