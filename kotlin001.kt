// kotlinc main.kt -include-runtime -d test.jar java -jar test.jar

fun main() {
	var valor1 = 10
	var valor2 = 20
	println(++valor1)
	println(valor1++)
	println(--valor1)
	println(valor1--)

	println(valor1 == valor2) // valorl é igual a valor2
	println(valor1 < valor2) // valorl é menor a valor2 
	println(valor1 > valor2) // valorl é maior a valor2 
	println(valor1 <= valor2) // valorl é menor ou igual a valor2
	println(valor1>= valor2) // valorl é maior ou igual a valor2
	println(valor1 != valor2) // valorl é diferente de valor2

	println(valor2 == 20 && valor2 == 20 && valor1 < valor2)

	var idade = 3
	// Definindo uma condigéo
	if (idade <= 4){
	println("Bebê")
	// Definindo outra condigéo
	} else if (idade <= 12){
	println("Crianca")
	// Definindo outra condicéo
	} else if (idade <= 17){
	println("Adolescente")
	} else {
	println("Adulto")
	}

	var listacompras = arrayOf("arroz", "feijão", "picanha", 115, 3.14)
	var listaInteiros = arrayOf(1,2,3,4,5,6)
	var listaDecimal = arrayOf(2.3,4.5,6.7)

	println(listacompras[0])
	println(listacompras[2])
	println(listaInteiros[0])
	println(listaDecimal[0])

	println(listacompras.size)
	println(listaInteiros.size)
	println(listaDecimal.size)
}
