//Definir la función curry, que dada una función de dos argumentos, devuelve su equivalente currificada.

def curry(f: (Int,Int) => Int): Int => Int => Int ={
  (x: Int) => (y: Int) => f(x,y)
}