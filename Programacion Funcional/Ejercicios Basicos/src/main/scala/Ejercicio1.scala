//Escribir una función entreNumeros(inicio: Int, fin: Int): List[Int] que retorne una lista
//que incluya todos los números enteros entre inicio y fin incluyéndolos.

def entreNumeros(inicio: Int, fin: Int): List[Int] = fin match
  case f if f == inicio => List(inicio)
  case _ if inicio < fin => inicio :: entreNumeros(inicio + 1, fin)
  case _ => inicio :: entreNumeros(inicio - 1, fin)