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