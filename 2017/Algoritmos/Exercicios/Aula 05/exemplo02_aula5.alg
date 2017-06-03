algoritmo "tira carteira"
// Função : recebe a idade e se estiver entre 18 e 65 permite tirar carteira
// Autor : Tiago Valério
// Data : 17/04/2017
// Seção de Declarações 
var
idade : Inteiro
inicio
// Seção de Comandos 

Escreva("Informe a sua idade: ")
Leia(idade)

se ( (idade < 18) ou (idade > 65) ) entao
   Escreva("Idade de ", idade, " recebe incentivo municipal!!")
   Escreva("OK")
fimse

fimalgoritmo
