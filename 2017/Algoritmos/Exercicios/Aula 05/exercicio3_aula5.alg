algoritmo "joao papo"
// Fun��o : Recebe quantidade de peixes e calcula multa por kg excedente
// Autor : Tiago Val�rio
// Data : 19/04/2017
// Se��o de Declara��es 
var
pesoPeixe, pesoExcedido, valorMulta : Numerico

inicio
// Se��o de Comandos
Escreva("Informe o peso da pesca realizada em Kg: ")
Leia(pesoPeixe)

se (pesoPeixe > 50) entao

   //Calculamos quantos kg foi excedida a pesca
   pesoExcedido <- pesoPeixe - 50
   
   //Calculamos o valor da multa com base da quantidade excedente de pesca (> 50)
   valorMulta <- pesoExcedido * 4
   
   Escreval("Seu Jo�o voc� pescou : ", pesoPeixe, " Kg")
   Escreval("Ultrapassando o limite de 50 Kg em ", pesoExcedido)
   Escreva("Gerando uma multa de R$: ", valorMulta)

fimse;


fimalgoritmo
