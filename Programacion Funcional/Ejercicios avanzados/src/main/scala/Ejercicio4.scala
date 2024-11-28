//Definir la función uncurry, que dada una función currificada de dos argumentos,
//devuelve su versión no currificada equivalente. Es la inversa de la anterior.

def uncurry(f: Int => Int => Int): (Int,Int) => Int ={
  (x: Int, y: Int) => f(x)(y)
}