algoritmo "calcula_energia"
// Fun��o : Recebe a quantidade de energia e calcula o valor da fatura
// Autor : Tiago Val�rio
// Data : 26/04/2017
// Se��o de Declara��es 
var

consumoEnergia, tipoUtilizacaoImovel : Inteiro
valorEnergia : Numerico

inicio
// Se��o de Comandos 
Escreva("Informe a quantidade de energia consumida (KW/h): ")
Leia(consumoEnergia)

Escreval("Informe a finalidade da utiliza��o da energia")
Escreval("1 - Resid�ncia")
Escreval("2 - Com�rcio ")
Escreval("3 - Industria ")
Escreva("Op��o: ")
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
