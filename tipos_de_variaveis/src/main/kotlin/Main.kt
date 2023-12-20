fun main(args: Array<String>) {
    println("Tipos de varáveis")

    val nome = "Luis Henrique Silva Ferreira"       // tipo 'string'
    val idade = 32      // o Kotlin já reconheçe o 'tipo' atráves do valor da variável
    val ano = 2023          // tipo 'int'
    val formacao = "Análise e Desenvolvimento de Sistemas";
    val quant: Byte = 2     // kotlin não consegue reconhecer o tipo 'Byte' de forma automatica, sendo necessário defini-lo
    val numero_long = 1413121110987654321          // tipo 'long'
    val dinheiro = 2.00f        // variável do tipo 'float' é necessário colocar um 'f' no final


    println("Me chamo: " + nome + " tenho " + idade + " anos");
    println("Sou formando em: " + formacao);
    println("Além desta formação tenho " + quant + " cursos técnicos")
    println("estou no final do ano: " + ano);
    println("sequênçia de numeros inteiros em ordem decrescente ultilizando o tipo 'long': " + numero_long);
    println("O valor aleatório 'float' é: " + dinheiro);
}


