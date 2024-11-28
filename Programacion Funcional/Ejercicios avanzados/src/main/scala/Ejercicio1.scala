//Escribir una función contar(palabras: List[String]): Map[String, Int] retorne un mapa 
//  donde las claves sean las palabras de la lista pasada por parámetro y los valores 
//la cantidad de apariciones que tiene dicha palabra en la lista

def contar(palabras: List[String]): Map[String, Int] ={
  palabras
    .groupBy(x => x)
    .map((k,v) => (k,v.length))
}