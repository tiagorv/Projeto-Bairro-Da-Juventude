algoritmo "contaHomensEMulheres"
// Fun��o : Recebe 6 pessoas e indique quantidade de homens e mulheres
// Autor : Tiago Val�rio
// Data : 03/05/2017
// Se��o de Declara��es 
var
contador : Inteiro
nome, sexo : Caracter
quantidadeDeMulher, quantidadeDeHomem : Inteiro
inicio
// Se��o de Comandos 
para contador de 1 ate 6 faca
       Escreval("Contador: ", contador)
       Escreva("Informe o seu nome: ")
       Leia(nome)
       Escreva("Informe (M) Mulher e (H) Homem: ")
       Leia(sexo)
       
       escolha(sexo)
                    caso "m", "M", "mulher", "Mulher", "MULHER"
                         Escreval(nome, " voc� � mulher!")
                         quantidadeDeMulher <- quantidadeDeMulher + 1
                    caso "h", "H", "homem", "Homem", "HOMEM"
                         Escreval(nome, " voc� � homem!")
                         quantidadeDeHomem <- quantidadeDeHomem + 1
                    outrocaso
                         Escreval(nome, " informa��o inv�lida!")
       fimescolha
fimpara

Escreval("Quantidade de Mulhere(s): ", quantidadeDeMulher)
Escreva("Quantidade de Homem(s): ", quantidadeDeHomem)

fimalgoritmo
