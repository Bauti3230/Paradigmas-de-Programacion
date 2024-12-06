package org.example.EjerciciosTipoFinal.Ejercicio1;

import java.util.regex.Pattern;

public class ReglaNumero implements ReglasStrategy {
    @Override
    public Boolean validar(String contrasena) {
        return Pattern.compile("\\d").matcher(contrasena).find();

    }
}
