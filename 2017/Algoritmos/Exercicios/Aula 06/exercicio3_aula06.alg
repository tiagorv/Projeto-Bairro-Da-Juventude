algoritmo "maior_menor"
// Função : Recebe 4 numeros e demonstra o maior e menor valor
// Autor : Tiago Valério
// Data : 24/04/2017
// Seção de Declarações 
var

N1, N2, N3, N4 : Inteiro
MAIOR, MENOR : Inteiro

inicio
// Seção de Comandos 

Escreva("Informe um número qualquer (Opção 1): ")
Leia(N1)

Escreva("Informe um número qualquer (Opção 2): ")
Leia(N2)

Escreva("Informe um número qualquer (Opção 3): ")
Leia(N3)

Escreva("Informe um número qualquer (Opção 4): ")
Leia(N4)

MAIOR <- N1
MENOR <- N1

se (N2 > MAIOR) entao
   MAIOR <- N2
fimse

se (N3 > MAIOR) entao
   MAIOR <- N3
fimse

se (N4 > MAIOR) entao
   MAIOR <- N4
fimse

se (N2 < MENOR) entao
   MENOR <- N2
fimse

se (N3 < MENOR) entao
   MENOR <- N3
fimse

se (N4 < MENOR) entao
   MENOR <- N4
fimse

Escreval("Foi informado os números (", N1, ",", N2, ",", N3, ",", N4, ")")
Escreval("Maior Número: ", MAIOR)
Escreval("Menor Número: ", MENOR)

fimalgoritmo
