fun main () {
    println("Qual menu vc quer acessar : 1, 2 , 3 ou 4 ?")
    val opcao = readLine()?.toIntOrNull()

    when(opcao) {
        1 -> println("Menu 1 - Iphone")
        2 -> println("Menu 2 - iPad")
        3 -> println("Menu 3 - Mac")
        4 -> println("Menu 4 - iMac")
        else -> println("Opção inválida. Tente Novamente.")
    }
}