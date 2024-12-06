package Ejercicio1

//Identificar todas las líneas que no correspondan al paradigma funcional, explicando por qué. Luego escribir un
//código que haga exactamente lo mismo pero utilizando el paradigma funcional.

//La resolucion es en Scala, un lenguaje enfocado al paradigma funcional. En si el codigo viola que genera side efects
//ya que se modifica la variable suma, aparte de que se utiliza una if pero no como un guarda sino para controlar
//  el flujo del programa y por ultimo se itera cosa que no sea hace en el paradigma funcional

def sumarNumerosPares(numeros: List[Integer]): Integer ={
  numeros
    .filter(x => x % 2 == 0) // se filtran solo los numeros pares
    .reduce((x,y)=>x+y) // se hace la suma de todos los elementos
}
