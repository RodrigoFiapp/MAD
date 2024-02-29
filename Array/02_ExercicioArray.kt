// Exercício 2: Maior e Menor Elemento

fun main () {

    val numbers = intArrayOf(8,3,12,6,20)
    var max = numbers[0] //variável para armazenar o maior elemento
    var min = numbers[0] //variável para armazenar o menor elemento

    // Loop para encontrar o menor e maior elemento
    for (number in numbers) {
        if (number < min) {
            min = number
        }
        if(number > max) {
            max = number
        }
    }

    println("O menor elemento é : $min")
    println("O maior elemento é : $max")
}