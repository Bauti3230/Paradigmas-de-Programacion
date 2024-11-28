package org.example.GuiaCatedra.Ejemplo1;

/*
Identificar y justificar todos los principios de diseño que se violan.
Proponer e implementar una posible solución que respete dichos principios.
Justificar por que el patrón elegido resuelve los problemas identificados.
*/

public class Zoologico {
    private Jaula jaula;

    public Zoologico(Jaula jaula) {
        this.jaula = jaula;
    }

    public void hacerSonidoAnimalEnJaula(){
        jaula.getHabitante().hacerSonido();
    }

/*    public void hacerSonidoAnimalEnJaula(){
        jaula.hacerSonidoHabitante();
    }*/
}
/*
Esta implementacion en conrecto viola el principio de minimo conocimiento, ya que en la funcion
`hacerSonidpAnimalEnJaula` utiliza la funcion `getHabitantes` que devuelve un objeto `Animal`
y utilza `hacerSonido` metodo de la clase `Animal`.
Esto no es correcto ya que Zoologico no sabe sobre el objeto `Animal`, por lo que `Zoologico` no
tiene porque saber sobre los metodos de la clase `Animal`.
Una posible resolcion es delegarle el hacer ruido a la jaula (Despues se podria hablar si es correcto)
que la jaula haga sonido o no pero de esta forma evitamos que se siga violando este principo de disenio.
*/


