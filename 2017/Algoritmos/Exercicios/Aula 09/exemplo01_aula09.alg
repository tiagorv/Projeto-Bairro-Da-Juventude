algoritmo "ateque_exemplo1"
// Fun��o : Demonstrar funcionamento da estrutura ate que
// Autor : Tiago Val�rio
// Data : 03/05/2017
// Se��o de Declara��es 
var
numero, maior : Inteiro

inicio
// Se��o de Comandos 
maior <- 0
repita
      Escreva("Informe um n�mero qualquer: ")
      Leia(numero)
      
      se (maior < numero) entao
         maior <- numero
      fimse
      
      se (numero >= 0) entao
         Escreval(numero, " � positivo!!!")
      senao
         Escreval(numero, " � negativo!!!")
      fimse
      
      se (numero%2 = 0) entao
         Escreval(numero, " � par!!!")
      senao
         Escreval(numero, " � impar!!!")
      fimse
      
ate numero = 0

Escreva("Maior n�mero informado: ", maior)

fimalgoritmo
