algoritmo "Calculador de Comissao"
// Fun��o : Calcular a comissao do vendedor utilizando para isso as informa��es de vendas
// Autor : Tiago Val�rio
// Data : 12/04/2017
// Se��o de Declara��es 
var

nomeVendedor, descricaoPeca: Caracter
qtdeVendida, valorUnitario, valorVenda, valorComissao, ValorLiquido : Numerico

inicio
// Se��o de Comandos 

//Demonstra mensagem para nosso usu�rio
Escreva("Informe o nome do vendedor: ")

//Faz o algoritmo aguardar o usuario informar o nome e vai armazenar
//esta informa��o na variavel nomeVendedor
Leia(nomeVendedor)

//Demonstra mensagem ao nosso usu�rio
Escreva("Informe a descri��o da pe�a vendida: ")

//Faz o algoritmo aguardar o usuario informar a descri��o da pe�a e vai armazenar
//esta informa��o na variavel descricaoPeca
Leia(descricaoPeca)

//Demonstra mensagem ao nosso usu�rio
Escreva("Informe a quantidade vendida: ")

//Faz o algoritmo aguardar o usuario informar a quantidade vendida e vai armazenar
//esta informa��o na variavel qtdeVendida
Leia(qtdeVendida)

//Demonstra mensagem ao nosso usu�rio
Escreva("Informe o valor unit�rio da pe�a R$: ")

//Faz o algoritmo aguardar o usuario informar o valor unit�rio da pe�a e vai armazenar
//esta informa��o na variavel valorUnitario
Leia(valorUnitario)

//variavel valorVenda vai receber o calcula do conteudo da variavel qtdeVendida
// * o conteudo da variavel precoUnitario
valorVenda <- qtdeVendida * valorUnitario

//variavel valorComissao vai receber o conteudo da variavel valorVenda *
//0.05 que corresponde a 5% de comissao ou se preferir (5/100)
valorComissao <- valorVenda * 0.05

ValorLiquido <- valorVenda - valorComissao

Escreval("---Relat�rio de Comiss�o de Vendas---")
Escreval("Nome do Vendedor: ", nomeVendedor)
Escreval("Descri��o da Pe�a: ", descricaoPeca)
Escreval("Valor da Venda R$: ", valorVenda)
Escreval("Valor da Comiss�o R$: ", valorComissao)
Escreval("Valor L�quido R$: ", valorLiquido)


fimalgoritmo
