package org.example.OtrosEjercicios.Ejercicio5;

class Motor {
    public void encender() {
        System.out.println("Motor encendido");
    }
}

class Auto {
    private Motor motor;

    public Motor getMotor() {
        return motor;
    }

    public void encender() {
        motor.encender();
    }
}

public class Conductor {
    public void encenderAuto(Auto auto) {
        auto.encender();
    }
}

