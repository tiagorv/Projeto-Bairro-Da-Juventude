algoritmo "calcula_peso_ideal"
// Fun��o : Recebe altura e sexo e calcula peso ideal
// Autor : Tiago Val�rio
// Data : 24/04/2017
// Se��o de Declara��es 
var
altura, pesoIdeal : Numerico
sexo : Caracter

inicio
// Se��o de Comandos 
Escreva("Informe a sua altura: ")

Leia(altura)

Escreva("Informe (H) Homem e (M) Mulher: ")
Leia(sexo)

se ((sexo = "H") ou (sexo = "h")) entao
   pesoIdeal <- 72.7 * altura - 58
senao
   pesoIdeal <- 62.1 * altura - 44.7
fimse

Escreva("A altura: ", altura, " para o sexo: ", sexo, " tem peso ideal: ", pesoIdeal)

fimalgoritmo
