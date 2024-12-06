package org.example.EjerciciosTipoFinal.Ejercicio1;

import java.util.regex.Pattern;

public class ReglaLetra implements ReglasStrategy {
    @Override
    public Boolean validar(String contrasena) {
        return Pattern.compile("[a-zA-Z]").matcher(contrasena).find();
    }
}
