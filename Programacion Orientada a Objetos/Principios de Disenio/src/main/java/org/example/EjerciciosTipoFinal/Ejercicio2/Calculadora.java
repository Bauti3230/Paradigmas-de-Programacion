package org.example.EjerciciosTipoFinal.Ejercicio2;

public class Calculadora {
    public static double calcular(OperacionStrategy operacion, double n1, double n2) {
        return operacion.operar(n1,n2);
    }
}
