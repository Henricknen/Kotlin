fun main(args: Array<String>) {
    
    var nome_completo = arrayOf("Luis", "Henrique", "Silva", "Ferreira")

    var indice = 0

    for(indice in 0.. 4) {      // 'in' intervalo que serão imprimidos
        println(nome_completo[indice])      // exibe os itens da lista
    }
}