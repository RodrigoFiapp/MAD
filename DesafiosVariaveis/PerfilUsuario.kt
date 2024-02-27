// Crie um Perfil de Usuário em Kotlin, vamos plicar os conceitos aprendidos sobre variáveis em
// Kotlin para criar um programa simples que simule o armazenamento e exibição de informações
// de um perfil de usuário.
// Crie um arquivo Kotlin (com extensão .kt )
// Declare variáveis para armazenar informações de um perfil de usuário, como nome , idade ,
// email e se o usuário está ativo ou inativo .
// Atribua valores às variáveis de acordo com os dados que você escolher.
// Utilize println() para exibir as informações do perfil do usuário no console.


fun main () {
    val nomeUsuario : String = "Roger"
    val idadeUsuario : Int = 30
    val emailUsuario : String = "rogerguedes123@fiap.com.br"
    val statusUsuario : Boolean = true // se true o status é ativo se falso é inativo(0 ou 1)

    println("O nome do usuário : $nomeUsuario")
    println("A idade do usuário : $idadeUsuario")
    println("O email do usuário : $emailUsuario")
    println("O status atual do usuário : $statusUsuario")
}