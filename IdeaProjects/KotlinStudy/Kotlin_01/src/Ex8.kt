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