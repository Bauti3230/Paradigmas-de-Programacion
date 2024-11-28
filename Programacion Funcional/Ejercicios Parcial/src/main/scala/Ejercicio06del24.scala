//Escribir una funcion en Scala def juegos(numeros: List[String]):List[String] que retorne
//la lista original pero reemplazando "1" por "algo", los "4"  por "ritmos" y los "10" por "elUltimo".
//  Los "7" deben eliminarse por ser de mala suerte.

def juego(numeros: List[String]):List[String] = numeros match
  case Nil => Nil
  case c :: resto if c == "1" => "algo" :: juego(resto)
  case c :: resto if c == "4" => "ritmos" :: juego(resto)
  case c :: resto if c == "10" => "elUltimo" :: juego(resto)
  case c :: resto if c == "7" => juego(resto)
  case c :: resto => c :: juego(resto)