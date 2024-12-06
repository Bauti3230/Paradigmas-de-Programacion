package Ejercicio4


def calcularPromedio(numeros: List[Double]): Double ={
  numeros
    .map(x => x/numeros.length)
    .sum
}