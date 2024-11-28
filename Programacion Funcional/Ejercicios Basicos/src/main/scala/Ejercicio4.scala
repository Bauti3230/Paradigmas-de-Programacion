//Escribir una función aplicar(lista: List[Int], f: (Int, Int) =¿Int): List[Int] que retorne una nueva lista
//  que contenga los resultados de aplicar f a cada elemento de lista

def aplicar(lista: List[Int], f: (Int, Int) => Int): List[Int] ={
  lista
    .map(x => f(x,x))
}