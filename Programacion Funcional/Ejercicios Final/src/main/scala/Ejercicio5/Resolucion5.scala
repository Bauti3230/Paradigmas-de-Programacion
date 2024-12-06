package Ejercicio5


def obtenerMayor(lista: List[Float]):Float ={
  _obtenerMayor(lista,-1)
}

def _obtenerMayor(lista: List[Float], mayor: Float):Float = lista match
  case Nil => mayor
  case f :: resto if f > mayor => _obtenerMayor(resto,f)
  case f :: resto => _obtenerMayor(resto,mayor)