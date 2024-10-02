//2. Desenvolva um programa em Kotlin que leia três valores do tipo Double e verifique se esses valores formam ou não um
//triângulo. Caso formem triângulo, o programa deve informar o tipo do triângulo (equilátero, isósceles ou escaleno).

fun main() {
    println("Informe os valores de X e Y")
    val x = readln().toInt();
    val y = readln().toInt();

    var tipo: String;

    if(x == y){
        tipo = "Quadrado";
    } else{
        tipo = "Retângulo";
    }

    println("Valor de X ==> $x");
    println("Valor de Y ==> $y");
    println("A figura é um $tipo");
}