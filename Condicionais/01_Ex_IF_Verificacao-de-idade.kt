// Exercício - menor ou maior de idade

// fun main () {

//     val idade = 19

//     if( idade >= 18) {
//         println("Maior de idade já pode dirigir")
//     } else {
//         println("Menor de idade não pode dirigir ainda")
//     }
// }


//================================Recebendo parametros do usuário===================================================
fun main () {

    //Solicitando ao usuário para digitar a sua idade
    print("Digite sua idade :")
    val idadeInput = readLine() //LÊ a entrada do usuário como string

    //Verificar se a entrada de idade é nula
    if(idadeInput == null) {
        println("Entrada inválida")
        return //saí da função main se a entrada for nula
    }
    
    //Tenta converter a entrada de idade para um valor númerico
    val idade = idadeInput.toIntOrNull()

    //Verificar se a conversão foi sucesso ou se a entrada é inválida
    if(idade == null){
        println("Entrada Inválida! ESTA VAZIA")
        return // saí da função main se a conversão não for sucesso
    }

    //Verificar se a idade é maior ou igual a 18
    if (idade >= 18){
        println("Você é maior de idade")
    }else {
        println("Você é menor de idade")
    }
}