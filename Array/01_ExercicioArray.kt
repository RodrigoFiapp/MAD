//Exercício 1: Soma dos Elementos

fun main () {

    //Array de ineiros
    val numbers = intArrayOf(5, 10, 15, 20, 25) //imutável
    var sum = 0 //variável para armazenar a soma // mutável

    //Loop para somar os elementos da Array
    for (number in numbers) {
        sum += number
    }

    //imprimindo o resultado
    println("A soma dos elementos é $sum")
}