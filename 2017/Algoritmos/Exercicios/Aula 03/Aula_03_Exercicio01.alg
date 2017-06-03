algoritmo "Conversão de Dolar para Real"
// Função : Receber uma quantia em dolar e a cotação da data atual
// e vai demonstrar o valores convertido em reais
// Autor : Tiago Valério
// Data : 12/04/2017
// Seção de Declarações 
var
qtdeDolar : Inteiro
cotacaoDolar, valorEmReais : Numerico
inicio
// Seção de Comandos 

Escreva("Este programa foi desenvolvido para receber um valor em dolar($)")
Escreval(" e a cotação do dolar na data atual.")
Escreval("Gerando o valor em reais convertidos na data atual.")


//Demonstra mensagem na tela
Escreva("Informe a sua quantia em dolares $:")

//Faz o algortimo aguardar a informação do usuário e armazena a informação
//na variavel qtdeDolar
Leia(qtdeDolar)

//Demonstra a informação na tela
Escreva("Informe a cotação do dolar na data atual: ")

//Faz o algortimo aguardar a informação do usuário e armazena a informação
//na variavel cotacaoDolar
Leia(cotacaoDolar)

//variavel valorEmReais vai receber o nosso processamento que será
//a multiplicação de qtdeDolar pela variavel cotacaoDolar
valorEmReais <- qtdeDolar * cotacaoDolar

//Demonstrando o resultado do meu algoritmo ao usuário
Escreva("$: ", qtdeDolar, " com a cotação de hoje de R$: ", cotacaoDolar, " gerando R$: ", valorEmReais)

fimalgoritmo
