package org.example.OtrosEjercicios.Ejercicio6;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//a) Identificar y justificar todos los principios de diseño que se violan.
//b) Proponer e implementar una posible solución que respete dichos principios. Justificar por qué la solución elegida resuelve los problemas del punto (a).


//public class Auto {
//    private List<Rueda> ruedas;
//    private Color color;
//    private String modelo;
//
//    public Auto() {
//        this.ruedas = new ArrayList<>();
//    }
//
//    public Boolean cambiarRueda() {
//        for (Rueda rueda : ruedas)
//            if (rueda.getDesgaste() >= rueda.getLimiteDeDesgaste())
//                return true;
//        return false;
//    }
//}
//class Rueda {
//    private int desgaste;
//    private int limiteDeDesgaste;
//
//    public Rueda(int desgaste, int limiteDeDesgaste) {
//        this.desgaste = desgaste;
//        this.limiteDeDesgaste = limiteDeDesgaste;
//    }
//
//    public int getDesgaste() {
//        return desgaste;
//    }
//
//    public int getLimiteDeDesgaste() {
//        return limiteDeDesgaste;
//    }
//}

public class Auto {
    private List<Rueda> ruedas;
    private Color color;
    private String modelo;

    public Auto() {
        this.ruedas = new ArrayList<>();
    }

    public Boolean cambiarRueda() {
        for (Rueda rueda : ruedas)
            if (rueda.limiteDesgasteAlcanzado())
                return true;
        return false;
    }
}
class Rueda {
    private int desgaste;
    private int limiteDeDesgaste;

    public Rueda(int desgaste, int limiteDeDesgaste) {
        this.desgaste = desgaste;
        this.limiteDeDesgaste = limiteDeDesgaste;
    }

    public int getDesgaste() {
        return desgaste;
    }

    public int getLimiteDeDesgaste() {
        return limiteDeDesgaste;
    }

    public Boolean limiteDesgasteAlcanzado() {
        return limiteDeDesgaste >= limiteDeDesgaste;
    }
}