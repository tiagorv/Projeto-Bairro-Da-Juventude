algoritmo "Receitas do Meu Aviário"
// Função : Calcula o valor da venda, utilizando quantidade de ovos * preço unitário
// Autor : Tiago Valério
// Data : 10/04/2017
// Seção de Declarações 
var
qtdOvos : Inteiro
valorUnidade, valorVenda : Numerico

inicio
// Seção de Comandos
//Comando para demonstrar mensagem na tela para o usuário
Escreva("Informe a quantidade de ovos: ")
Leia(qtdOvos)
Escreva("Informe o valor de cada ovo R$: ")
Leia(valorUnidade)

valorVenda <- qtdOvos * valorUnidade

Escreva("Valor da Venda R$: ", valorVenda)

fimalgoritmo
