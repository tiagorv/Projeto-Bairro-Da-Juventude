algoritmo "par_impar_positivo_negativo"
// Função : Recebe um numero qualquer e demonstra se é positivo, negativo, par ou impar
// Autor : Tiago Valério
// Data : 24/04/2017
// Seção de Declarações 
var
numero, restoDivisao2 : Inteiro

inicio
// Seção de Comandos 

Escreva("Informe um número qualquer: ")
Leia(numero)

se (numero >= 0) entao
   Escreva(numero, " é positivo!")
senao
   Escreva(numero, " é negativo!")
fimse

restoDivisao2 <- numero % 2

se (restoDivisao2 = 0) entao
   Escreva(numero, " é par!")
senao
   Escreva(numero, " é impar!")
fimse

fimalgoritmo
