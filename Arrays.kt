import java.util.Arrays     //  importando a classe 'Arrays' do pacote 'java.util'

fun main(args: Array<String>) {
    var hardskills = arrayOf("PHP", "JVASCRIPT", "HTML", "CSS", "KOTLIN", "LARAVEL", "SQL", "REACT", "aRDUINO", "PYTHON", "LARAVEL")        // lista de 'hardskill'
    println("Codificação foi feita ultilizando linguagem de programação de alto nivel: " + hardskills[3])       // imprimindo frase explicativa concatenada com item n° 3 da lista

    println("Conheço liguagens de programação e frameworks com: " + Arrays. toString(hardskills))        // método 'toString' lista todos os itens da lista

    println("Esta lista contém: " + hardskills. size + " itens")        // 'size' faz a contagem de quantos itens tem na lista
}