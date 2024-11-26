package org.example.Ejemplo2;

/*Identificar y justificar todos los principios de diseño que se violan.
Proponer e implementar una posible solución que respete dichos principios.
Justificar por que el patrón elegido resuelve los problemas identificados.*/

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) { this.saldo = saldoInicial; }

    public Boolean tieneSaldoSuficiente(double monto) { return monto <= saldo; }

    public void retirar(double monto) {saldo -= monto;}

//    public void retirar(double monto) {
//        if (!tieneSaldoSuficiente(monto)) {
//            Cliente.MontoInsuficienteException("No se puede retirar. Fondos insuficientes.");
//        }
//        saldo -= monto;
//    }
}

public class Cliente {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        double montoSolicitado = 500;
        if (!cuenta.tieneSaldoSuficiente(montoSolicitado)) {
            MontoInsuficienteException("No se puede retirar. Fondos insuficientes.");
            return;
        }
        cuenta.retirar(montoSolicitado);

//        llamamos a la nueva funcion `retitar`
//        retirar(monto)
    }

    private static void MontoInsuficienteException(String s) {
        System.out.println(s);
    }
}

/*
En este caso estariamos violada el principio Tell Dont Ask (Hace no Preguntes), ya que el objeto `Cliente`
Le esta preguntadno al objeto `Cuenta` si tiene saldo suficiente para retirar un monto solucitado.
Una de las razones de porque no es una buena idea violar este principio de disenio es porque se rompe con
uno de los pilare de POO que es el encapsuilaminto, violando Tell Dont Ask estamos exponiendo implementacion
de nuestro codigo que podrias ocultar.
Una posible resolcion es que el objeto `Cuenta` determine por si mismo si es capaz de realizar o no la transaccion
depues el objeto `Cliente` puede decidir como manejar este situacion.

*/
