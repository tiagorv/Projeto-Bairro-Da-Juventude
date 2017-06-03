algoritmo "ateque_exemplo1"
// Função : Demonstrar funcionamento da estrutura ate que
// Autor : Tiago Valério
// Data : 03/05/2017
// Seção de Declarações 
var
numero, maior : Inteiro

inicio
// Seção de Comandos 
maior <- 0
repita
      Escreva("Informe um número qualquer: ")
      Leia(numero)
      
      se (maior < numero) entao
         maior <- numero
      fimse
      
      se (numero >= 0) entao
         Escreval(numero, " é positivo!!!")
      senao
         Escreval(numero, " é negativo!!!")
      fimse
      
      se (numero%2 = 0) entao
         Escreval(numero, " é par!!!")
      senao
         Escreval(numero, " é impar!!!")
      fimse
      
ate numero = 0

Escreva("Maior número informado: ", maior)

fimalgoritmo
