algoritmo "par_impar_positivo_negativo"
// Fun��o : Recebe um numero qualquer e demonstra se � positivo, negativo, par ou impar
// Autor : Tiago Val�rio
// Data : 24/04/2017
// Se��o de Declara��es 
var
numero, restoDivisao2 : Inteiro

inicio
// Se��o de Comandos 

Escreva("Informe um n�mero qualquer: ")
Leia(numero)

se (numero >= 0) entao
   Escreva(numero, " � positivo!")
senao
   Escreva(numero, " � negativo!")
fimse

restoDivisao2 <- numero % 2

se (restoDivisao2 = 0) entao
   Escreva(numero, " � par!")
senao
   Escreva(numero, " � impar!")
fimse

fimalgoritmo
