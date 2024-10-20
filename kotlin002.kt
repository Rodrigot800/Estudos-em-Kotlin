fun main () {
    var ListaCompras = arrayOf("arroz", "feijao", "batata", "banana", "leite")
	var indice = 0 
	// Estrutura de Repeticdo - while (enquanto) 
	while (indice < ListaCompras.size) { 

	println(ListaCompras[indice]) 

	indice++

		}
    
    println("\n ------------------------------------------------\n")
    
    for(indice in 0..4){
        println(ListaCompras[indice]) 
    }
    
    for(i in 0..4){
        println("$i ") 
    }
  
    val str:String = "kotlin é show"
    
    for(letra in str){
        println(("$letra"))
    }
    
    // percorrendo um intervalo de inteiros de em 3
    for (i in 1..10 step 3){
    println("$i ")
    }
    print(("\n"))
    
    for (i in 1..20 step 2){
    println("$i ")
    }
    print(("\n")) 
    
     for (i in 3..20 step 3){
    println("$i ")
    }
    print(("\n")) 
    
     for (i in 20 downTo 0 step 3){
    println("$i ")
    }
    print(("\n")) 
    
    var name: String? = null
    
    name = "uepa - bes"
    println(name)
    println(name?.length)
    println(name!!.length)
    
}


/*fun sum(a: Int , b: Int): Int{
    return a+b
}

fun printSum(a: Int, b: Int): Unit {
println("Sum of $a and $b is ${a + b}")
}

fun sum2(a: Int , b: Int )= a + b

fun main() {
    val r = sum2(2,3)
    println(r)
}*/

fun helloWorld(nome: String): String {
return "ola, $nome!"
}
