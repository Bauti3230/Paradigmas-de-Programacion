package Ejercicio3


def buscarUltimaOcurrencia(numeros: List[Integer] ,buscado: Integer): Integer ={
//  numeros
//    .lastIndexWhere(x => x == buscado)
// podemos tambien usar la funcion lasIndexWhere pero depende del profesor.
  _buscarUltimaOcurrencia(numeros,buscado,-1,0)
}

//Usamos pattern matching para cada caso, si llegamos al final (Nil) devolvemos la ultima posicion.
//Si encontramos que el primer numero de nuestro arreglo es igual al que buscamos hacemos la llamada 
// recursiva pero no guardamos la posicion actual como la ultima ocurrencia y aumentamos la posicon actual
//si no es el numero vamos a la siguiente posicion
def _buscarUltimaOcurrencia(numeros: List[Integer] ,buscado: Integer, ultimaPos: Integer, posActual: Integer): Integer = numeros match
  case Nil => ultimaPos
  case i :: resto if i == buscado => _buscarUltimaOcurrencia(resto,buscado,posActual,posActual+1)
  case i :: resto => _buscarUltimaOcurrencia(resto,buscado,ultimaPos,posActual+1)