algoritmo "soma_numeros"
// Fun��o : Receber numeros at� informado o valor 0 e vai apresentar a soma destes numeros
// Autor : Tiago Val�rio
// Data : 03/05/2017
// Se��o de Declara��es 
var
numero, soma : Inteiro
inicio
// Se��o de Comandos 
soma <- 0
repita
      Escreva("Informe um n�mero qualquer: ")
      Leia(numero)
      soma <- soma + numero
ate numero = 0
Escreva("Soma dos n�meros: ", soma)

fimalgoritmo
