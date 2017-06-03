algoritmo "classifica_nadador"
// Função : Recebe a idade do atleta e classifica
// Autor : Tiago Valério
// Data : 26/04/2017
// Seção de Declarações 
var

idade : Inteiro
mensagemNadador : Caracter

inicio

// Seção de Comandos 
Escreva("Informe a idade do nadador: ")
Leia(idade)

escolha(idade)
              caso 5, 6, 7
                   mensagemNadador <- "Nadador classificado como infantil A"
              caso 8, 9, 10, 11
                   mensagemNadador <- "Nadador classificado como infantil B"
              caso 12, 13
                   mensagemNadador <- "Nadador classificado como juvenil A"
              caso 14, 15, 16, 17
                   mensagemNadador <- "Nadador classificado como juvenil B"
              caso 0, 1, 2, 3, 4
                   mensagemNadador <- "Não tem idade para ser atleta de natação"
              outrocaso
                   mensagemNadador <- "Nadador maior de 18 anos (adulto)"
fimescolha

Escreva(idade, " ano(s). ", mensagemNadador)

fimalgoritmo
