algoritmo "testa_enquanto"
// Fun��o : Testar a estrutura enquanto
// Autor : Tiago Val�rio
// Data : 26/04/2017
// Se��o de Declara��es 
var

numero, horasAula, tipoProfessor : Inteiro
salarioProfessor : Numerico

inicio
// Se��o de Comandos numer

numero <- 0

enquanto (numero < 3) faca

         numero <- numero + 1

         Escreva("Informe a quantidade de horas/aula: ")
         Leia(horasAula)

         Escreval("Informe o tipo do professor")
         Escreval("1 - Professor de N�vel I")
         Escreval("2 - Professor de N�vel II")
         Escreval("3 - Professor de N�vel III")
         Escreva("Op��o: ")
         Leia(tipoProfessor)

         escolha(tipoProfessor)
           caso 1
                salarioProfessor <- horasAula * 12.00
           caso 2
                salarioProfessor <- horasAula * 17.00
           caso 3
                salarioProfessor <- horasAula * 25.00
         fimescolha

         Escreval("Professor de n�vel ", tipoProfessor)
         Escreval("Hora(s) Trabalhada(s): ", horasAula)
         Escreval("Sal�rio R$: ", salarioProfessor)
         Escreval("---------------------------------")
fimenquanto


fimalgoritmo
