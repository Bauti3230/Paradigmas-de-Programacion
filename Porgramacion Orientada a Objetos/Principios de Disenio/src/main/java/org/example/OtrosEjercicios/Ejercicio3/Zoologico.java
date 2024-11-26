package org.example.OtrosEjercicios.Ejercicio3;

//a) Identificar y justificar todos los principios de diseño que se violan.
//b) Proponer e implementar una posible solución que respete dichos principios. Justificar por qué la solución elegida resuelve los problemas del punto (a).

//public class Animal {
//    public void hacerSonido() {
//        System.out.println("Sonido genérico");
//    }
//}
//
//public class Perro extends Animal {
//    @Override
//    public void hacerSonido() {
//        System.out.println("Ladrido");
//    }
//}
//
//public class Gato extends Animal {
//    @Override
//    public void hacerSonido() {
//        System.out.println("Maullido");
//    }
//}
//
//public class Zoologico {
//    private Animal animal;
//
//    public Zoologico(Animal animal) {
//        this.animal = animal;
//    }
//
//    public void ejecutarSonido() {
//        if (animal instanceof Perro) {
//            System.out.println("Ejecutando ladrido...");
//            animal.hacerSonido();
//        } else if (animal instanceof Gato) {
//            System.out.println("Ejecutando maullido...");
//            animal.hacerSonido();
//        }
//    }
//}

//a)
//
//El principio que se viola es de Open Closed ya que si nostros qusieramos agregar otro animal
//tendriamos que modificar el codigo que ya tenemos y no escribir nuevo codigo

//b)

abstract class Animal {
    public abstract  void hacerSonido();
}

class Perro extends Animal {
    public void hacerSonido() {
        System.out.println("Wow");
    }
}

class Gato extends Animal {
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

public class Zoologico {
    private Animal animal;

    public Zoologico(Animal animal) {
        this.animal = animal;
    }

    public void hacerSonido() {
        animal.hacerSonido();
    }
}



