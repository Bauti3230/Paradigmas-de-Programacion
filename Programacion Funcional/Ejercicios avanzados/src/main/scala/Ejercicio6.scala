//Dado un texto, crear una función que tome el texto como entrada y devuelva un mapa
//que muestre la frecuencia de cada palabra en el texto. Los espacios no deben ser considerados

def frecuencias(texto: String): Map[String,Int] ={
  texto
    .split(' ')
    .groupBy(x => x)
    .map((k,v) => (k,v.length))
}