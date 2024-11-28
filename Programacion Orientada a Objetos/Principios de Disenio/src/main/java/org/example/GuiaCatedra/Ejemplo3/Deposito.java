package org.example.Ejemplo3;

/*Identificar y justificar todos los principios de diseño que se violan.
Proponer e implementar una posible solución que respete dichos principios.
Justificar por que el patrón elegido resuelve los problemas identificados.*/

//En este caso se viola el principio de tell dont ask, ya que se le pregunta
//a el `Inventario` si tiene stock para poder retirarlo. Propongo que el `Inventario`
//determine si puede o no sacar el stock

public class Deposito {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(2000);

        int requerido= 50;
        if (!inventario.hayStock(requerido)) {
            throws new StockInsuficienteException("No se puede retirar. Stock insuficiente.");
        }
        inventario.retirar(requerido);

        //      Nuevo algoritmo
//        try {
//            inventario.retirar(requerido);
//        }catch (StockInsuficienteException e) {
//            System.out.println(e.getMessage());
//        }
    }
}

class Inventario {
    private int stock;

    public Inventario(int stockInicial) { this.stock = stockInicial; }

    public Boolean hayStock(int requerido) { return requerido <= stock; }

    public void retirar(int requerido) { stock -= requerido;}

//    public void retirar(int requerdio) {
//        if (!hayStock(requerdio)) {
//            throw new StockInsuficienteException("No se puede retirar. Stock insuficiente.");
//            return;
//        }
//        stock -= requerdio;
//    }
}


