algoritmo "joao papo"
// Função : Recebe quantidade de peixes e calcula multa por kg excedente
// Autor : Tiago Valério
// Data : 19/04/2017
// Seção de Declarações 
var
pesoPeixe, pesoExcedido, valorMulta : Numerico

inicio
// Seção de Comandos
Escreva("Informe o peso da pesca realizada em Kg: ")
Leia(pesoPeixe)

se (pesoPeixe > 50) entao

   //Calculamos quantos kg foi excedida a pesca
   pesoExcedido <- pesoPeixe - 50
   
   //Calculamos o valor da multa com base da quantidade excedente de pesca (> 50)
   valorMulta <- pesoExcedido * 4
   
   Escreval("Seu João você pescou : ", pesoPeixe, " Kg")
   Escreval("Ultrapassando o limite de 50 Kg em ", pesoExcedido)
   Escreva("Gerando uma multa de R$: ", valorMulta)

fimse;


fimalgoritmo
