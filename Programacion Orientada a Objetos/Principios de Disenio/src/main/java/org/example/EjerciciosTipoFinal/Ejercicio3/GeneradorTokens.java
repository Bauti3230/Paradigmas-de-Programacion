package org.example.EjerciciosTipoFinal.Ejercicio3;

import org.example.OtrosEjercicios.Ejercicio2.Usuario;

public interface GeneradorTokens {
    String generadorTokenMobile(Banco banco, Usuario usuario, Token tipoToken);
}
