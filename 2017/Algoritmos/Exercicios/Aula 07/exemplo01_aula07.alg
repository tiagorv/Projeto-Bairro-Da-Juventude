algoritmo "pesoideal_comcaso"
// Fun��o : Recebe altura e sexo e calcula peso ideal
// Autor : Tiago Val�rio
// Data : 24/04/2017
// Se��o de Declara��es 
var
altura, pesoIdeal : Numerico
sexo : Caracter

inicio
// Se��o de Comandos 

Escreva("Informe a altura: ")
Leia(altura)

Escreva("Informe (H) Homem e (M) Mulher: ")
Leia(sexo)

escolha(sexo)
   caso "H", "h", "Homem", "HOMEM", "homem"
        pesoIdeal <- 72.7 * altura - 58
        Escreva("Peso Ideal: ", pesoIdeal)
   caso "M", "m", "Mulher", "mulher", "mul�"
        pesoIdeal <- 62.1 * altura - 44.7
        Escreva("Peso Ideal: ", pesoIdeal)
   outroCaso
        Escreva("Sem calculo para o sexo informado!!")
fimescolha

fimalgoritmo
