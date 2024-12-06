package org.example.EjerciciosTipoFinal.Ejercicio1;


import java.util.List;

public class Contrasena {
    private final String constrasena;
    private List<ReglasStrategy> reglas;

    public Contrasena(String constrasena,List<ReglasStrategy>  reglas) {
        this.constrasena = constrasena;
        this.reglas = reglas;
    }

    public Boolean esValida(){
        return reglas.stream().allMatch(regla -> regla.validar(this.constrasena));
    }
}
