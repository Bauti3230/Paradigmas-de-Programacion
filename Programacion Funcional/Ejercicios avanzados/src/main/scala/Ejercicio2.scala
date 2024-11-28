//Escribir una función topK(numeros: List[Int], k: Int, f: (Int, Int) => Int): List[Int]
//que retorne una lista con los k elementos de números mas grandes según la función f.
//La respuesta debe estar ordenada según el criterio de la función f.

def topK(numeros: List[Int], k: Int, f: (Int, Int) => Int): List[Int] ={
  numeros
    .sortBy(x => f(x,x))
    .takeRight(k)
}