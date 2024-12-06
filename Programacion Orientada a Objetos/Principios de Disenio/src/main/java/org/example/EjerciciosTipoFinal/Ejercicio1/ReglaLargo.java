package org.example.EjerciciosTipoFinal.Ejercicio1;

public class ReglaLargo implements ReglasStrategy {
    @Override
    public Boolean validar(String contrasena) {
        return contrasena.length() > 8;
    }
}
