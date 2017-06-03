algoritmo "Calculador de Comissao"
// Função : Calcular a comissao do vendedor utilizando para isso as informações de vendas
// Autor : Tiago Valério
// Data : 12/04/2017
// Seção de Declarações 
var

nomeVendedor, descricaoPeca: Caracter
qtdeVendida, valorUnitario, valorVenda, valorComissao, ValorLiquido : Numerico

inicio
// Seção de Comandos 

//Demonstra mensagem para nosso usuário
Escreva("Informe o nome do vendedor: ")

//Faz o algoritmo aguardar o usuario informar o nome e vai armazenar
//esta informação na variavel nomeVendedor
Leia(nomeVendedor)

//Demonstra mensagem ao nosso usuário
Escreva("Informe a descrição da peça vendida: ")

//Faz o algoritmo aguardar o usuario informar a descrição da peça e vai armazenar
//esta informação na variavel descricaoPeca
Leia(descricaoPeca)

//Demonstra mensagem ao nosso usuário
Escreva("Informe a quantidade vendida: ")

//Faz o algoritmo aguardar o usuario informar a quantidade vendida e vai armazenar
//esta informação na variavel qtdeVendida
Leia(qtdeVendida)

//Demonstra mensagem ao nosso usuário
Escreva("Informe o valor unitário da peça R$: ")

//Faz o algoritmo aguardar o usuario informar o valor unitário da peça e vai armazenar
//esta informação na variavel valorUnitario
Leia(valorUnitario)

//variavel valorVenda vai receber o calcula do conteudo da variavel qtdeVendida
// * o conteudo da variavel precoUnitario
valorVenda <- qtdeVendida * valorUnitario

//variavel valorComissao vai receber o conteudo da variavel valorVenda *
//0.05 que corresponde a 5% de comissao ou se preferir (5/100)
valorComissao <- valorVenda * 0.05

ValorLiquido <- valorVenda - valorComissao

Escreval("---Relatório de Comissão de Vendas---")
Escreval("Nome do Vendedor: ", nomeVendedor)
Escreval("Descrição da Peça: ", descricaoPeca)
Escreval("Valor da Venda R$: ", valorVenda)
Escreval("Valor da Comissão R$: ", valorComissao)
Escreval("Valor Líquido R$: ", valorLiquido)


fimalgoritmo
