fun main ()  {
    var opcao : Char

    println("O que vc deseja comprar?")

    do {
        println("/t[1] iPad")
        println("/t[2] iPhone")
        println("/t[3] iPod")
        println("/t[4 Sair]")
        println("----->")

        opcao = readLine()?.get(0)?.toUpperCase() ?: ''

        while (opcao) {
            '1' -> println("iPad")
            '2' -> println("iPad")
            '3' -> println("iPad")
            '4' -> {
                println("Saindo")
        }

    }
}