package org.example.Ejemplo1;

public class Jaula {
    private Animal habitante;

    public void setHabitante(Animal habitante) {
        this.habitante = habitante;
    }

    public Animal getHabitante() {
        return habitante;
    }

    public void hacerSonidoHabitante() {
        Animal habitante = getHabitante();
        habitante.hacerSonido();
    }
}
