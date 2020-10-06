package com.example.acts12_08

fun main (){
    var again = true
    println("CALCULADORA. INTRODUSCA UN NUMERO: ")
    var numGuardado = readLine()!!.toDouble()
    do {
        println("ESCOJA UNA OPERACION A REALIZAR: ")
        println("+.- SUMA.")
        println("-.- RESTA.")
        println("*.- MULTIPLICACION.")
        println("/.- DIVISION.")
        println("A.- APAGAR CALCULADORA.")
        print("RESPUESTA: ")
        var op = readLine()!!.toString()
        while (op != "+" && op != "-" && op != "*" && op != "/" && op != "A") {
            print("INGRESE UN OPERADOR VALIDO: ")
            op = readLine()!!.toString()
        }
        when (op) {
            "+" -> {
                numGuardado=suma(numGuardado)
                println("$numGuardado")

            }
            "-" -> {
                numGuardado=resta(numGuardado)
                println("$numGuardado")
            }
            "*" -> {
                numGuardado=mult(numGuardado)
                println("$numGuardado")
            }
            "/" -> {
                numGuardado=division(numGuardado)
                println("$numGuardado")
            }
            "A" ->{
                again=false
            }
        }
    }while (again==true)

}
//Funcion para la suma.
fun suma (num:Double): Double {
    println("SUMA")
    var valor1 = num
    println("INGRESE EL SEGUNDO VALOR: ")
    var valor2 = readLine()!!.toDouble()
    return (valor1+valor2)
}
//FUNCION DE RESTA
fun resta (num:Double): Double{
    println("RESTA")
    var valor1 = num
    println("INGRESE LA CANTIDAD A RESTAR: ")
    var valor2 = readLine()!!.toDouble()
    return ((valor1 - valor2))
}
//FUNCION DE MULTIPLICACION
fun mult (num:Double):Double{
    println("MULTIPLICACION")
    var valor1 = num
    println("INGRESE EL VALOR POR EL CUAL SE MULTIPLICARA: ")
    var valor2 = readLine()!!.toDouble()
    return (valor1 * valor2)
}
//FUNCION DE DIVISION
fun division (num: Double):Double{
    println("DIVISION")
    var valor1 = num
    println("INGRESE EL VALOR POR EL CUAL DIVIDIRA: ")
    var valor2 = readLine()!!.toDouble()
    return (valor1 / valor2)
}
