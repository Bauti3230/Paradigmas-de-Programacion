package org.example.GuiaCatedra.Ejemplo1;

public class Animal {
    private String nombre;
    private int edad;
    private String sexo;
    private String raza;

    public Animal(String nombre, int edad, String sexo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println("Hacer ruido de : " + raza);
    }
}
