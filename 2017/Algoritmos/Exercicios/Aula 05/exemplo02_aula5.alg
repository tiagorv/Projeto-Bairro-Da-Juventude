algoritmo "tira carteira"
// Fun��o : recebe a idade e se estiver entre 18 e 65 permite tirar carteira
// Autor : Tiago Val�rio
// Data : 17/04/2017
// Se��o de Declara��es 
var
idade : Inteiro
inicio
// Se��o de Comandos 

Escreva("Informe a sua idade: ")
Leia(idade)

se ( (idade < 18) ou (idade > 65) ) entao
   Escreva("Idade de ", idade, " recebe incentivo municipal!!")
   Escreva("OK")
fimse

fimalgoritmo
