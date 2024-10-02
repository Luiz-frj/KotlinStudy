/*
    =============== Main ====================
fun main() {
    //Linguagem FORTEMENTE tipada

    println("Hello World! Kotlin\n");

    //Variaveis
    println("=== VARIÁVEIS ===");

    //VAL - Variável que não muda (FINAL)
    //val count: Int = 10;
    val count = 10;

    //VAR - Variável que pode ser alterada
    var value: Int = 10;
    value += 1;

    println("Val ==> " + count);

    println("Var ==> " + value + "\n");

    //Strings
    println("=== STRING ===");

    val str1 = "francisco";
    val str2 = str1.uppercase();

    println(str1);
    println(str2 + "\n")

    //for (c in str2){
    //    println(c);
    //}

    val primeiro = "Luiz"
    val meio = "Francisco";
    val ultimo = "Junior";

    val completo  = "$primeiro $meio $ultimo \n".uppercase();

    println(completo);

    //Devido o NullSafety, o Kotlin não permite que uma variavel receba/seja Nula (NULL)
    var name: String?; //Ao colocar o '?', o Kotlin permite que uma variavel seja nula

    name = "Ednilson";
    println("Hora do café, $name");
    println("Name tem ==> ${name.length} letras");

    name = null;
    //if(name != null){
    //    println("Hora do café, ${name.length}");
    //}

    println("Hora do café, $name");
    //println("Hora do café, ${name?.length}\n");
    //println("Hora do café, ${name!!.length}");


    //Exception
    //val question: String;
    var answer: String;
    val question: String = "Palmeiras tem mundial?"; //Sacanagem isso em...

    println(question);
    answer = readln();

    val out: String;

    //val out = if(answer == "sim") {
    //"Mentiroso";
    //} else{
    //"ok";
    //}


    if(answer == "sim"){
        out = "Mentiroso";
    } else{
        out = "ok";
    }
    println(out);
}

================ 1 ===========================
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
===================== 2 =======================
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
===================== 3 ======================
//3. Desenvolva um programa que apresente os números de 1 a 100 na mesma linha, em ordem crescente. Uso obrigatório do
//FOR
fun main() {
    for (i in 1..100) print("$i ");
}
======================= 4 ======================
//4. Desenvolva um programa que apresente os números de 1 a 100 na mesma linha, em ordem decrescente. Uso obrigatório do
//FOR.
fun main() {
    for (i in 100 downTo 1) print("$i ");
}
=================== 5 =======================
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
===================== 7 ===================
//7. Faça um programa para ler N valores inteiros, sendo N fornecido pelo usuario.
//Calcule e mostre: O MAIOR valor negativo; O MENOR valor positivo.
fun main() {
    var min: Int = 0;
    var max: Int = 0;
    val number: Int;
    var aux: Int;
    var i: Int = 0;

    number = readln().toInt();

    while (i < number){
        aux = readln().toInt();

        if(i == 0){
            max = aux;
            min = aux;
        } else {
            if(aux > 0){
                if(max > aux){
                    max = aux;
                }
            } else if(aux < 0){
                if(min < aux){
                    min = aux;
                }
            }
        }

        i++;
    }

    println("MAIOR valor negativo ==> $max");
    println("MENOR valor positivo ==> $min");
}
===================== 8 ===========================
//8.Implemente um programa que calcule o fatorial de um número interio fornecido pelo usário
fun main() {
    val userNumber: Int;
    var i: Int = 2;
    var fat: Int = 1;

    print("Digite o Numero que deseja ver o fatorial");
    userNumber = readln().toInt();

    if(userNumber != 0 && userNumber != 1){
        while (i <= userNumber){
            fat *= i;
            i++;
        }
    }

    println("Numero do Usuario ==> $userNumber");
    println("Resultado ==> $fat");

}
*/