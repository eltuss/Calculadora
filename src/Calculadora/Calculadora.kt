package Calculadora

fun main(){

    //Aqui ele recebe os valores digitados no teclado
    println("Digite o primeiro valor: ")
    val num1 = readLine()!!.toDouble()
    println("Digite o segundo valor: ")
    val num2 = readLine()!!.toDouble()
    println("Digite o numero escolhido (1)Soma - (2)multiplicação - (3)divisão - (4)subtração")
    val digito = readLine()!!.toInt()
    var escolha = digito

    if (escolha == 1){
        val soma = Soma(num1,num2){a,b -> a.plus(b)}
        println("$num1 + $num2 = $soma")
    }else if (escolha == 2){
        val multiplicacao = Multiplicacao(num1,num2){a,b -> a.times(b)}
        println("$num1 x $num2 = $multiplicacao")
    }else if (escolha == 3){
        val divisao = Divisao(num1,num2){a,b -> a.div(b)}
        println("$num1 / $num2 = $divisao")
    }else if (escolha == 4){
        val subtracao = Subtracao(num1,num2){a,b -> a.minus(b)}
        println("$num1 - $num2 = $subtracao")
    }else {
        println("Numero digitado para a escolha da operação é invalido")

    }

}

fun Soma( num1:Double, num2:Double, soma:(Double, Double) -> Double):Double{ val result = soma (num1,num2); return result}
fun Multiplicacao( num1:Double, num2:Double, multiplicacao:(Double, Double) -> Double):Double{ val result = multiplicacao (num1,num2); return result}
fun Divisao( num1:Double, num2:Double, divisao:(Double, Double) -> Double):Double{ val result = divisao (num1,num2); return result}
fun Subtracao( num1:Double, num2:Double, subtracao:(Double, Double) -> Double):Double{ val result = subtracao (num1,num2); return result}
