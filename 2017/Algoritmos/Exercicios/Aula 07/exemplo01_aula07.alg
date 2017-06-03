algoritmo "pesoideal_comcaso"
// Função : Recebe altura e sexo e calcula peso ideal
// Autor : Tiago Valério
// Data : 24/04/2017
// Seção de Declarações 
var
altura, pesoIdeal : Numerico
sexo : Caracter

inicio
// Seção de Comandos 

Escreva("Informe a altura: ")
Leia(altura)

Escreva("Informe (H) Homem e (M) Mulher: ")
Leia(sexo)

escolha(sexo)
   caso "H", "h", "Homem", "HOMEM", "homem"
        pesoIdeal <- 72.7 * altura - 58
        Escreva("Peso Ideal: ", pesoIdeal)
   caso "M", "m", "Mulher", "mulher", "mulê"
        pesoIdeal <- 62.1 * altura - 44.7
        Escreva("Peso Ideal: ", pesoIdeal)
   outroCaso
        Escreva("Sem calculo para o sexo informado!!")
fimescolha

fimalgoritmo
