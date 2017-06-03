algoritmo "contaHomensEMulheres"
// Função : Recebe 6 pessoas e indique quantidade de homens e mulheres
// Autor : Tiago Valério
// Data : 03/05/2017
// Seção de Declarações 
var
contador : Inteiro
nome, sexo : Caracter
quantidadeDeMulher, quantidadeDeHomem : Inteiro
inicio
// Seção de Comandos 
para contador de 1 ate 6 faca
       Escreval("Contador: ", contador)
       Escreva("Informe o seu nome: ")
       Leia(nome)
       Escreva("Informe (M) Mulher e (H) Homem: ")
       Leia(sexo)
       
       escolha(sexo)
                    caso "m", "M", "mulher", "Mulher", "MULHER"
                         Escreval(nome, " você é mulher!")
                         quantidadeDeMulher <- quantidadeDeMulher + 1
                    caso "h", "H", "homem", "Homem", "HOMEM"
                         Escreval(nome, " você é homem!")
                         quantidadeDeHomem <- quantidadeDeHomem + 1
                    outrocaso
                         Escreval(nome, " informação inválida!")
       fimescolha
fimpara

Escreval("Quantidade de Mulhere(s): ", quantidadeDeMulher)
Escreva("Quantidade de Homem(s): ", quantidadeDeHomem)

fimalgoritmo
