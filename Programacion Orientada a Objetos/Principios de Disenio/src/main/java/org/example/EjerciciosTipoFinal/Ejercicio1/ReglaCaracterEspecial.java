package org.example.EjerciciosTipoFinal.Ejercicio1;

import java.util.regex.Pattern;

public class ReglaCaracterEspecial implements ReglasStrategy {
    @Override
    public Boolean validar(String contrasena) {
        return Pattern.compile("[^a-zA-Z0-9]").matcher(contrasena).find();
    }
}
