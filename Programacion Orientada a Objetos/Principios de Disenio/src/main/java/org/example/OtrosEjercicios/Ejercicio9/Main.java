package org.example.OtrosEjercicios.Ejercicio9;

class Vehiculo {
    public void conducir() {
        System.out.println("Conduciendo el vehículo...");
    }

    public void llenarTanque() {
        System.out.println("Llenando el tanque de combustible...");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void llenarTanque() {
        // Implementación vacía o inapropiada
        throw new UnsupportedOperationException("Las bicicletas no tienen tanque de combustible.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.conducir();
        vehiculo.llenarTanque();

        Vehiculo bicicleta = new Bicicleta(); // Sustitución problemática
        bicicleta.conducir();
        bicicleta.llenarTanque(); // Rompe el programa
    }
}

