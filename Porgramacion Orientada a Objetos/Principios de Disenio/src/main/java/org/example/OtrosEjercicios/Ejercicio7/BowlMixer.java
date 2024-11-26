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

public abstract class BowlMixer {
    public final Bowl preparar() {
        Proteina proteina = crearProteina();
        proteina.cocinarProteina();
        this.agregarVerduras();
        this.agregarAderezos();
        return new Bowl();
    }

    protected abstract Proteina crearProteina();

    private void agregarVerduras() {
        System.out.println("Agregando verduras");
    }

    private void agregarAderezos() {
        System.out.println("Agregando aderezos");
    }
}

class BowlMixerProteinaAnimal extends BowlMixer {
    protected Proteina crearProteina() {
        return new ProteinaAnimal();
    }
}

class BowlMixerVerduras extends BowlMixer {
    protected Proteina crearProteina() {
        return new ProteinaVegetal();
    }
}

class BowlMixerGrano extends BowlMixer {
    protected Proteina crearProteina() {
        return new ProteinaGrano();
    }
}

interface Proteina {
    void cocinarProteina();
}

class ProteinaAnimal implements Proteina {
    public void cocinarProteina() {
        System.out.println("Cocinado carne");
    }
}

class ProteinaVegetal implements Proteina {
    public void cocinarProteina() {
        System.out.println("Cocinado vegetal");
    }
}

class ProteinaGrano implements Proteina {
    public void cocinarProteina() {
        System.out.println("Cocinado grano");
    }
}
