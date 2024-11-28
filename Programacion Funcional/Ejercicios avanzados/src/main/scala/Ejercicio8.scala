//Escribir una función que junte los números de una lista sin usar métodos de ordenamiento.
//  Ej: (1, 2, 3,4, 1, 3) => (2, 1, 1, 3, 3, 4).

def juntar(lista: List[Int]): List[Int] ={
  lista
    .groupBy(x => x)
    .values
    .flatten
    .toList
}