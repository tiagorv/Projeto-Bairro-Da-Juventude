algoritmo "Convers�o de Dolar para Real"
// Fun��o : Receber uma quantia em dolar e a cota��o da data atual
// e vai demonstrar o valores convertido em reais
// Autor : Tiago Val�rio
// Data : 12/04/2017
// Se��o de Declara��es 
var
qtdeDolar : Inteiro
cotacaoDolar, valorEmReais : Numerico
inicio
// Se��o de Comandos 

Escreva("Este programa foi desenvolvido para receber um valor em dolar($)")
Escreval(" e a cota��o do dolar na data atual.")
Escreval("Gerando o valor em reais convertidos na data atual.")


//Demonstra mensagem na tela
Escreva("Informe a sua quantia em dolares $:")

//Faz o algortimo aguardar a informa��o do usu�rio e armazena a informa��o
//na variavel qtdeDolar
Leia(qtdeDolar)

//Demonstra a informa��o na tela
Escreva("Informe a cota��o do dolar na data atual: ")

//Faz o algortimo aguardar a informa��o do usu�rio e armazena a informa��o
//na variavel cotacaoDolar
Leia(cotacaoDolar)

//variavel valorEmReais vai receber o nosso processamento que ser�
//a multiplica��o de qtdeDolar pela variavel cotacaoDolar
valorEmReais <- qtdeDolar * cotacaoDolar

//Demonstrando o resultado do meu algoritmo ao usu�rio
Escreva("$: ", qtdeDolar, " com a cota��o de hoje de R$: ", cotacaoDolar, " gerando R$: ", valorEmReais)

fimalgoritmo
