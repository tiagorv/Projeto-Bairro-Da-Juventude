algoritmo "Receitas do Meu Avi�rio"
// Fun��o : Calcula o valor da venda, utilizando quantidade de ovos * pre�o unit�rio
// Autor : Tiago Val�rio
// Data : 10/04/2017
// Se��o de Declara��es 
var
qtdOvos : Inteiro
valorUnidade, valorVenda : Numerico

inicio
// Se��o de Comandos
//Comando para demonstrar mensagem na tela para o usu�rio
Escreva("Informe a quantidade de ovos: ")
Leia(qtdOvos)
Escreva("Informe o valor de cada ovo R$: ")
Leia(valorUnidade)

valorVenda <- qtdOvos * valorUnidade

Escreva("Valor da Venda R$: ", valorVenda)

fimalgoritmo
