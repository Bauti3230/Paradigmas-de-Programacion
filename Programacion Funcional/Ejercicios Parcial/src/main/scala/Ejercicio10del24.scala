//Escribir una funcion en Scala def apariciones(frase: String,n: Int): Int que retorne la suma
//de la cantidad de letras de las palabras que tiene una logitud mayor a n.
//  Cada plabra con longitud mayor a n debe contabilizarse una sola vez.
//
//Aclaracion: No es valido usar las funciones(ni ninguna alternativa): sum, order, toSet y unique

def apariciones(frase: String, n: Int): Int={
  frase
    .split(" ")
    .groupBy(x => x)
    .toList
    .map((k,v) => k)
    .filter(x => x.length > n)
    .map(x => x.length)
    .sum
}