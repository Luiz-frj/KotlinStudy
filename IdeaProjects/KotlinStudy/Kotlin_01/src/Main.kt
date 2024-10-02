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