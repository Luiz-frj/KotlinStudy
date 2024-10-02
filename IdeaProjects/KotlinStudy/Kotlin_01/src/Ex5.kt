//5. Escreva um programa que leia um valor inteiro N. Este N indica a quantidade de linhas de saída que serão apresentadas na
//execução do programa. Observando a tela de saída, apresentada abaixo, descubra a lógica da brincadeira e elabore o programa
fun main() {
    val num: Int;
    var linha: Int = 0;
    var aux: Int = 1;
    var i: Int = 0;

    num = readln().toInt();

    while(linha < num){
        if(i != 3){
            print("$aux ");
            aux++;
            i++;
        } else{
            print("PUM\n");
            aux++;
            i = 0;
            linha++;
        }
    }

}