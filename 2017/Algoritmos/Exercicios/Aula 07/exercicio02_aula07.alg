algoritmo "calcula_energia"
// Função : Recebe a quantidade de energia e calcula o valor da fatura
// Autor : Tiago Valério
// Data : 26/04/2017
// Seção de Declarações 
var

consumoEnergia, tipoUtilizacaoImovel : Inteiro
valorEnergia : Numerico

inicio
// Seção de Comandos 
Escreva("Informe a quantidade de energia consumida (KW/h): ")
Leia(consumoEnergia)

Escreval("Informe a finalidade da utilização da energia")
Escreval("1 - Residência")
Escreval("2 - Comércio ")
Escreval("3 - Industria ")
Escreva("Opção: ")
Leia(tipoUtilizacaoImovel)

escolha(tipoUtilizacaoImovel)
    caso 1
         valorEnergia <- consumoEnergia * 0.60
    caso 2
         valorEnergia <- consumoEnergia * 0.48
    caso 3
         valorEnergia <- consumoEnergia * 1.29
    outrocaso
         Escreva("Calculo informado indevidamente!!!")
fimescolha

se (valorEnergia > 0) entao
   Escreva("Valor de Energia R$: ", valorEnergia)
fimse






fimalgoritmo
