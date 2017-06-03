algoritmo "calcula_peso_ideal"
// Função : Recebe altura e sexo e calcula peso ideal
// Autor : Tiago Valério
// Data : 24/04/2017
// Seção de Declarações 
var
altura, pesoIdeal : Numerico
sexo : Caracter

inicio
// Seção de Comandos 
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
