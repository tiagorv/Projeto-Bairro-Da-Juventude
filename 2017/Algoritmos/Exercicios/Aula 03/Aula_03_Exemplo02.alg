algoritmo "Calcula Desconto"
// Fun��o : Calcular o desconto, conforme o valor de venda e percentual de desconto
// Autor : Tiago Val�rio
// Data : 10/04/2017
// Se��o de Declara��es 
var
percentualDesconto : Inteiro
valorVenda, valorDesconto, valorFinalVenda : Numerico
inicio
// Se��o de Comandos 

//Adiciona uma mensagen ao meu usu�rio
Escreva("Informe o valor total da venda R$: ")

//Este comando aguarda o usu�rio informar o valor e armazena na
//variavel informada dentro do comando leia
Leia(valorVenda)

//Este comando adiciona uma mensagem na tela para o usu�rio
Escreva("Informe o percentual de desconto, informar entre 1 e 100: ")

//Este comando aguarda o usu�rio informar o valor e armazena na
//variavel informada dentro do comando leia - percentualDesconto
Leia(percentualDesconto)

//Efetua processamento do algoritmo
//variavel valorDesconto vai receber
//conteudo da variavel valorVenda * conteudo da variavel percentualDesconto
valorDesconto <- valorVenda * (percentualDesconto / 100)

//Variavel valorFinalVenda vai receber
//conteudo da variavel valorVenda - conteudo da variavel valorDesconto
valorFinalVenda <- valorVenda - valorDesconto

//Mostrando uma mensagem ao usu�rio com uma informa��o fixa "Valor de Desconto R$: "
//concatenando com o conteudo da variavel valorDesconto
Escreval("Valor Venda R$: ", valorVenda, "  ANTES DO CALCULO")
Escreval("Valor de Desconto R$: ", valorDesconto)
Escreva("Valor Final da Venda R$:", valorFinalVenda)

fimalgoritmo
