algoritmo "soma_numeros"
// Função : Receber numeros até informado o valor 0 e vai apresentar a soma destes numeros
// Autor : Tiago Valério
// Data : 03/05/2017
// Seção de Declarações 
var
numero, soma : Inteiro
inicio
// Seção de Comandos 
soma <- 0
repita
      Escreva("Informe um número qualquer: ")
      Leia(numero)
      soma <- soma + numero
ate numero = 0
Escreva("Soma dos números: ", soma)

fimalgoritmo
