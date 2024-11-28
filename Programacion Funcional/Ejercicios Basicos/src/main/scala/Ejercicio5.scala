//Escribir una función sumar(lista: List[Int]): Int que retorne la suma de todos los elementos de la lista.

def sumar(lista: List[Int]): Int ={
  lista
    .reduce((x,y) => x+y)
}