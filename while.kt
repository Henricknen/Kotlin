fun main(args: Array<String>) {

    var hardskills = arrayOf("PHP", "JVASCRIPT", "HTML", "CSS", "KOTLIN", "LARAVEL", "SQL", "REACT", "ARDUINO", "PYTHON", "LARAVEL")

    var indice = 0      // variável 'indice' iniçiando em 0

    while (indice <= hardskills. size - 1) {     // enquanto 'while' condição '(indice < )' for verdadeira, '. size' pega todos os itens da lista mais um indiçe vazio por issi é necessario inseri '-1'
        println(hardskills[indice])
        indice++        // a cada 'loop' o indiçe será incrementado até chegar ao 'limite' da codição do while
    }
}