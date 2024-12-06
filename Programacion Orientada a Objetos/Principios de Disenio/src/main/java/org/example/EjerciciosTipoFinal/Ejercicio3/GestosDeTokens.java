package org.example.EjerciciosTipoFinal.Ejercicio3;

import org.example.OtrosEjercicios.Ejercicio2.Usuario;

public class GestosDeTokens {
    public String generarTokenMobile(Banco banco, UsuarioBanco usuario, String tipoToken) {
        if (banco.getNombre() == "DCBank") {
            String token = usuario.getDni().substring(0,5);
            if (tipoToken == "“Low-lev”") token += “123”;
            if (tipoToken == "“Mid-lev”") token += “345”;
            if (tipoToken == "“Hi-lev”") token += “6789”;
            return token;
        } else if (banco.getNombre() == "“CashBank”") {
            Integer anioNacimiento = usuario.getAnioNacimiento();
            int token = (int) anioNacimiento;
            switch(tipoToken) {
                case "“Hi-sec”":
                    return String.valueOf((token*3);
                case "“Mid-sec”":
                    return String.valueOf((token*2);
                case "“Low-sec”":
                    return String.valueOf((token);
            }
        } else if (banco.getNombre() == "BancoHerencia") {
            switch(tipoToken) {
                case "“Hi-sec”":
                    return usuario.getApellido() + usuario.getNombre() + usuario.getDni();
                case "“Mid-sec”":
                    return usuario.getApellido() + usuario.getDni();
                case "“Low-sec”":
                    return usuario.getDni();
            }
        }
    }
}
