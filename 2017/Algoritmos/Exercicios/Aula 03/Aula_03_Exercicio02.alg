algoritmo "semnome"
// Função : Realizar a soma dos quadrados de quatro numeros informados pelo usuário
// Autor : Tiago Valério
// Data : 12/04/2017
// Seção de Declarações 
var
N1, N2, N3, N4 : Inteiro
Q1, Q2, Q3, Q4 : Inteiro
Soma : Inteiro

inicio

// Seção de Comandos 
//Demonstra a mensagem para o usuario
Escreva("Informe um número: ")

//Faz o algoritmo aguardar o usuário informar o numero e armazena na variavel N1
Leia(N1)

//Demonstra a mensagem para o usuario
Escreva("Informe um número: ")

//Faz o algoritmo aguardar o usuário informar o numero e armazena na variavel N1
Leia(N2)

//Demonstra a mensagem para o usuario
Escreva("Informe um número: ")

//Faz o algoritmo aguardar o usuário informar o numero e armazena na variavel N1
Leia(N3)

//Demonstra a mensagem para o usuario
Escreva("Informe um número: ")

//Faz o algoritmo aguardar o usuário informar o numero e armazena na variavel N1
Leia(N4)

//Efetua calculo do quadrado de N1 e armazena na variavel Q1
Q1 <- N1 * N1

//Efetua calculo do quadrado de N2 e armazena na variavel Q2
Q2 <- N2 * N2

//Efetua calculo do quadrado de N3 e armazena na variavel Q3
Q3 <- N3 * N3

//Efetua calculo do quadrado de N4 e armazena na variavel Q4
Q4 <- N4 * N4

//Efetua a soma dos quadrados dos numeros e armazena na variavel soma
Soma <- Q1 + Q2 + Q3 + Q4

Escreval("Numero: ", N1, " - Quadrado = ", Q1)
Escreval("Numero: ", N2, " - Quadrado = ", Q2)
Escreval("Numero: ", N3, " - Quadrado = ", Q3)
Escreval("Numero: ", N4, " - Quadrado = ", Q4)

Escreva("Soma dos Quadrados (", Q1, " + ", Q2, " + ", Q3, " + ", Q4, ") = ", Soma)

fimalgoritmo
