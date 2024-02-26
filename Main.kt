//import java.util.Scanner
//
//    fun main() {
//        val scanner = Scanner(System.`in`)
//
//        println("Simulador de Calculadora TESTE:")
//
//        while (true) {
//            println("\nEscolha a operação:")
//            println("1. Adição")
//            println("2. Subtração")
//            println("3. Multiplicação")
//            println("4. Divisão")
//            println("0. Sair")
//
//            print("Digite o número da operação desejada: ")
//            val escolha = scanner.nextInt()
//
//            if (escolha == 0) {
//                break
//            }
//
//            print("Digite o primeiro número: ")
//            val numero1 = scanner.nextDouble()
//
//            print("Digite o segundo número: ")
//            val numero2 = scanner.nextDouble()
//
//            when (escolha) {
//                1 -> println("Resultado: ${numero1 + numero2}")
//                2 -> println("Resultado: ${numero1 - numero2}")
//                3 -> println("Resultado: ${numero1 * numero2}")
//                4 -> {
//                    if (numero2 != 0.0) {
//                        println("Resultado: ${numero1 / numero2}")
//                    } else {
//                        println("Erro: Divisão por zero não permitida.")
//                    }
//                }
//                else -> println("Opção inválida. Tente novamente.")
//            }
//        }
//
//        println("Calculadora encerrada.")
//    }
//
//
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////
///// WHEN STATEMENT
/////
//
//fun Main(){
//    choice(1);
//    choice(2);
//    choice("STRING");
//    choice(" ");
//
//}
//
//fun choice (obj: Any){
//    when (obj){
//        1 -> println("opção 1 escolhida com sucesso");
//        2 -> println("opção 2 escolhida com sucesso");
//        is String -> println("opção invalida");
//        else -> println("UNKNOW");
//
//    }
//
//}
//
//fun Main (){
//    println(whenAssing("helo"))
//    println(whenAssing(3.4))
//    println(whenAssing(1))
//}
//
//fun whenAssing (obj:Any): Any{
//    val result = when(obj){
//        1 -> "one"
//        "hello" -> 1
//        is  long -> false
//        else -> 42
//    }
//    return result
//}
//
//fun estruturaRepeticao(){
//    val cakes = listOf("carrot","cheese","cake") //criei uma var args cakes que tem uma lista de string para rodar no for
//    for (cake in cakes){  //tradução >>> dentro do for eu quero que minha var cakes seja atribuida a  var (cake)
//        println("yummy, its a $cake cake")// ou seja, a cada iteração, a string vai ser atribuida a cake;
//
//    }
//}
//fun roleta(){
//    val roleta = listOf(1,2,3,4,5,6,7,8,9,10)
//    for (rodar in  roleta){
//        rodar++
//        println("$rodar")
//    }
//}
//
//fun eatCake = println ("Eat a cake")
//fun bakeAcake = println("bakea cake")
//
//fun main(){
//    var cakesEaten 0
//    var cakesBaked = 0
//
//    while (cakesEaten < 5){
//        eatCake()
//        cakesEaten++
//    }
//}
//
//fun contagemregressiva() = println("faltam")
//fun main(){
//}
//
//fun eatCake() = println("Eat a cake")
//fun bakeAcake() = println("bake a cake")
//
//fun main(){
//    var cakesEaten = 0
//    var cakesBaked = 0
//
//    while (cakesEaten < 5){
//        eatCake();
//        cakesEaten++;
//    }
//
//    do{
//        bakeAcake()
//        cakesBaked++
//    }
//    while(cakesEaten > cakesBaked)
//}
//
//var handson = 1
//fun contarDedos(){
//    println("olá, vamos contar seus dedos da  mão, o primeiro dedo vale =  $handson")
//}
//fun main(){
//    while (handson < 11) {
//        contarDedos();
//        handson++;
//    }
//}


open class Dogkt{                  //CRIANDO UMA CLASS CACHORRO DO TIPO "OPEN CLASS" >> PODE SER USADO O EXTENDS
    open fun sayHello(){         // CRIANDO UMA FUNÇÃO ABERTA
        println("wow wow")
    }
}

class Pitbull : Dogkt(){          // CRIANDO UMA CLASS PITBULL DO TIPO CACHORRO, OU SEJA, UM PIT BULL É UM CACHORRO, O OVERRIDE SOBRESCREVE O METODO SAYHELO, O QUE SERIA ALGO PARECIDO COM POLIMORFISMO
    override fun sayHello() {      // CRIANDO UMA HERANÇA DE CLASSES, ONDE O PITBULL HERDA TODAS AS CARACTERISTAS DE CACHORRO;
        println("RUF RUF!")
    }
}

fun main1(){
    val dog : Dogkt = Pitbull()
    dog.sayHello()
}


//AGORA MOSTRANDO VARIAÇÃO DE UM TIPO DE HERANÇA, A PARAMETRIZADA
open class Tiger(val origin: String){
    fun sayHello(){
        println("A TIGER FORM $origin SAYS: GRRRHHHH")
    }
    fun Run(){
        println("the tiger is run fast!")
    }
}
class TigerOfBrazil : Tiger("PINTADO"){

}
class SiberianTiger : Tiger("SIBERIA")
fun main(){
    val tiger : Tiger = SiberianTiger()
    val tiger1 : Tiger = TigerOfBrazil()
tiger.sayHello()
tiger1.sayHello()
    tiger.Run()
    tiger1.Run()
}




