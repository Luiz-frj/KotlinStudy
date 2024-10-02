//Desenvolva um programa em Kotlin que leia três valores do tipo Double e verifique se esses valores formam ou não um
//triângulo. Caso formem triângulo, o programa deve informar o tipo do triângulo (equilátero, isósceles ou escaleno).
fun main() {
    val l1: Double;
    val l2: Double;
    val l3: Double;
    val tipo: String;

    println("Informe os lados do Triângulo");
    l1 = readln().toDouble();
    l2 = readln().toDouble();
    l3 = readln().toDouble();

    if(l1 == l2 && l1 == l3){
        tipo = "Equilátero";
    } else if(l1 == l2 || l1 == l3 || l2 == l3 ){
        tipo = "Isósceles";
    } else{
        tipo = "Escaleno";
    }

    println("O tipo do Triângulo é $tipo");
    println("Lado 1 ==> $l1\nLado 2 ==> $l2\nLado 3 ==> $l3\n");
}