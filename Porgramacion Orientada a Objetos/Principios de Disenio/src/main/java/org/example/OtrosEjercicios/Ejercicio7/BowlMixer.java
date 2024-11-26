package org.example.OtrosEjercicios.Ejercicio7;

//public class BowlMixer {
//    public Bowl preparar(Proteina proteina){
//        if (proteina == Proteina.ANIMAL) cocinarCarne();
//        if (proteina == Proteina.VEGETAL) cocinarCarne();
//        if (proteina == Proteina.GRANO) cocinarCarne();
//        this.agregarVerduras();
//        this.agregarAderezos();
//    }
//}

public class BowlMixer {
    public Bowl preparar(Proteina proteina){
        proteina.
        this.agregarVerduras();
        this.agregarAderezos();
    }
}

class ProteinaAnimal extends Proteina implements Bowl {
    public void cocinarProteina(){
        System.out.println("Cocinar proteina");
    }
}

class ProteinaGrano implements Bowl {
    public void cocinarProteina(){
        System.out.println("Cocinar legumbres");
    }
}

class ProteinaVegetal implements Bowl {
    public void cocinarProteina(){
        System.out.println("Cocinar vegetales");
    }
}

interface Bowl {
    void cocinarProteina();
}
