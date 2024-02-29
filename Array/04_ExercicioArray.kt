// Exercício 4 : Buscando elementos do array

fun main () {

    //Array das strings

    val names = arrayOf("Mariana", "Beatriz", "Rodrigo", "Danilo")
    val searchName = "Rodrigo" // Elemento a ser encontrado
    var found = false // Variável para verificar se o elemento foi encontrado

    //Loop p verificar se o elemento esta presente

    for(name in names) {
        if(name == searchName){
            found = true
            break
        }
    }

    if(found){
        println("$searchName foi encontrado no array")
    } else {
        println("$searchName não foi encontrado no array")
    }
}