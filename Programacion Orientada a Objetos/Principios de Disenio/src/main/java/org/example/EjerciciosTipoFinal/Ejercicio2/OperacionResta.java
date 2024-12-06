package org.example.EjerciciosTipoFinal.Ejercicio2;

public class OperacionResta implements OperacionStrategy{
    @Override
    public double operar(double n1, double n2) {
        return n1 - n2;
    }
}
