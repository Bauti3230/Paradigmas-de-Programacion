package Ejercicio2

def eliminarRepetidos(lista: List[Any]): List[Any] ={
  lista
    .groupBy(x => x) //Se agrupa en un has por cada elemeto es decir 1 : [1,1,1] o Hola : [Hola, Hola].
    .toList //Se transforma el has en un lista de tuplas, donde el primer elemnto es la clave y el segundo la veces
            // que aparece en forma de lista. [(1,[1,1,1]),...]
    .map((k,v) => k) // La funcion map aplica una funcion (en este caso (k,v) => k) a la lista.
                    // Nuestra funcion nos deja solo con las claves
}