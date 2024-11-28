//Escribir una función eliminarRepetidos(lista: List[Int]): List[Int] que retorne una nueva lista que contenga
//  los mismos elementos que la original pero sin elementos repetidos.

def eliminarRepetidos(lista: List[Int]): List[Int] ={
  lista
    .groupBy(x => x)
    .toList
    .map((k, v) => k)
}