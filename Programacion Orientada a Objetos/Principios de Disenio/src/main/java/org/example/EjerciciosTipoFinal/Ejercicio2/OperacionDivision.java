package org.example.EjerciciosTipoFinal.Ejercicio2;

public class OperacionDivision implements OperacionStrategy{
    @Override
    public double operar(double n1, double n2){
        if (n2 == 0)
            throw new ArithmeticException("No se puede dividir por cero");
        return n1 / n2;
    }
}
