//Escribir una función repetidos(lista1: List[Int], lista2: List[Int]): List[Int] que retorne una nueva lista 
//  que contenga los elementos que están presentes en ambas listas.

def repetidos(lista1: List[Int], lista2: List[Int]): List[Int] ={
  lista1.filter(lista2.contains)
}
