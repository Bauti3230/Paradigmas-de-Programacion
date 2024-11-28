//Escribir una función que retorne el n-esimo número de la sucesión de Fibonacci a partir de un número n.

def fibonacci(n: Int): Int = n match
  case i if i <= 0 => 0
  case i if i == 1 => 1 
  case _ => fibonacci(n-1) + fibonacci(n-2)