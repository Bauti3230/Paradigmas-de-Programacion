//Escribir una función que retorne el máximo de una lista (no es valido usar la función reverse)
//utilizando match y luego sin utilizarlo.

def mayorConMatch(lista: List[Int], n: Int): Int = lista match {
  case Nil => n
  case cabeza :: resto if cabeza > n => mayorConMatch(resto, cabeza)
  case _ :: resto => mayorConMatch(resto, n)
}