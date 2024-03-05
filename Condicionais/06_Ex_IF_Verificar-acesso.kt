fun main () {

    // val usuario = "Vinicius" //usuário pré-definido
    print("Usuario:  ")
    val usuarioInput = readLine()
    // val senha = "senha123" //senha pré-definido
    print("Senha:  ")
    val senhaInput = readLine()

    val usuario = "Vinicius"
    val senha = "senha123"


// Verificando se o usuário é válido
    if(usuarioInput == usuario && senhaInput == senha){
        println("Acesso Permitido")
    }else {
        println("Acesso inválido, pois a senha ou usuario esta incorreto")
    }
}