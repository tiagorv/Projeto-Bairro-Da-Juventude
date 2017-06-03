algoritmo "Calcula Desconto"
// Função : Calcular o desconto, conforme o valor de venda e percentual de desconto
// Autor : Tiago Valério
// Data : 10/04/2017
// Seção de Declarações 
var
percentualDesconto : Inteiro
valorVenda, valorDesconto, valorFinalVenda : Numerico
inicio
// Seção de Comandos 

//Adiciona uma mensagen ao meu usuário
Escreva("Informe o valor total da venda R$: ")

//Este comando aguarda o usuário informar o valor e armazena na
//variavel informada dentro do comando leia
Leia(valorVenda)

//Este comando adiciona uma mensagem na tela para o usuário
Escreva("Informe o percentual de desconto, informar entre 1 e 100: ")

//Este comando aguarda o usuário informar o valor e armazena na
//variavel informada dentro do comando leia - percentualDesconto
Leia(percentualDesconto)

//Efetua processamento do algoritmo
//variavel valorDesconto vai receber
//conteudo da variavel valorVenda * conteudo da variavel percentualDesconto
valorDesconto <- valorVenda * (percentualDesconto / 100)

//Variavel valorFinalVenda vai receber
//conteudo da variavel valorVenda - conteudo da variavel valorDesconto
valorFinalVenda <- valorVenda - valorDesconto

//Mostrando uma mensagem ao usuário com uma informação fixa "Valor de Desconto R$: "
//concatenando com o conteudo da variavel valorDesconto
Escreval("Valor Venda R$: ", valorVenda, "  ANTES DO CALCULO")
Escreval("Valor de Desconto R$: ", valorDesconto)
Escreva("Valor Final da Venda R$:", valorFinalVenda)

fimalgoritmo
