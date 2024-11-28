package org.example.OtrosEjercicios.Ejercicio8;

import java.util.List;

//public class AplicadorDeDescuento {
//    public int aplicar(CuponDeDescuento descuento, List<Articulo> articulos, int topeDeDescuento) {
//        return descuento.caclularDescuento(articulos, topeDeDescuento)
//    }
//}
//
//class CuponDeDescuento {
//    private int porcentajeDescuento;
//
//    public int caclularDescuento(List<Articulo> articulos, int topeDeDescuento) {
//        int descuento = 0;
//        for (Articulo articulo : articulos)
//            descuento += articulo.precio * this.porcentajeDescuento;
//        return descuento > topeDeDescuento ? descuento : topeDeDescuento;
//    }
//}
//
//class CuponDeDescuentoDeClientes extends CuponDeDescuento {
//    public int calcularDescuento(List<Articulo> articulos, int topeDescuento) {
//        return cliente.membresia() == "Platinum" ? 3000  : 500;
//    }
//}

//En ese caso violamos el principio de Liskove ya que vemos que la clase `CuponDeDescuentoDeCliente`
//extiende a la clase `CuponDeDescuento`, pero sobreescribe el metodo `calcularDescuento`
//Esto es un problema ya que esto rompe con que la subclase `CuponDeDescuentoCliente` no deberia ser
//una clase hija de `AplicadorDescuento`.

interface Cupon {
    int calcularDescuento(List<Articulo> articulos, int topeDescuento);
}

public class CuponPorcentaje implements Cupon {
    private int porcentajeDescuento;

    public CuponPorcentaje(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public int calcularDescuento(List<Articulo> articulos, int topeDeDescuento) {
        int descuento = 0;
        for (Articulo articulo : articulos) {
            descuento += articulo.getPrecio() * this.porcentajeDescuento / 100;
        }
        return Math.min(descuento, topeDeDescuento);
    }
}

public class CuponClientes implements Cupon {
    private Cliente cliente;

    public CuponClientes(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int calcularDescuento(List<Articulo> articulos, int topeDeDescuento) {
        return cliente.getMembresia().equals("Platinum") ? 3000 : 500;
    }
}

public class AplicadorDeDescuento {
    public int aplicar(Cupon cupon, List<Articulo> articulos, int topeDeDescuento) {
        return cupon.calcularDescuento(articulos, topeDeDescuento);
    }
}