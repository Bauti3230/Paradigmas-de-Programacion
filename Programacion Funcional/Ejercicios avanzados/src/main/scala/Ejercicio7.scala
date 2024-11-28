//Escribir una función que reciba un entero n y una lista l y retorne una lista
//  con la diferencia de cada uno de la lista a n.
//  Solo debe tener en cuenta los números para los cuales la diferencia es mayor a 10, ignorar el resto.

def difMayorA10(n: Int, lista: List[Int]) ={
  lista
    .map(x => x-n)
    .filter(x => x > 10)
}