//Escribir una función que reciba un string y retorne un booleano mostrando capicua o no.

def esCapicupa(palabra: String): Boolean={
  palabra == palabra.reverse
}