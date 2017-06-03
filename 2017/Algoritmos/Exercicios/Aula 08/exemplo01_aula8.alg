algoritmo "testa_enquanto"
// Função : Testar a estrutura enquanto
// Autor : Tiago Valério
// Data : 26/04/2017
// Seção de Declarações 
var

numero, horasAula, tipoProfessor : Inteiro
salarioProfessor : Numerico

inicio
// Seção de Comandos numer

numero <- 0

enquanto (numero < 3) faca

         numero <- numero + 1

         Escreva("Informe a quantidade de horas/aula: ")
         Leia(horasAula)

         Escreval("Informe o tipo do professor")
         Escreval("1 - Professor de Nível I")
         Escreval("2 - Professor de Nível II")
         Escreval("3 - Professor de Nível III")
         Escreva("Opção: ")
         Leia(tipoProfessor)

         escolha(tipoProfessor)
           caso 1
                salarioProfessor <- horasAula * 12.00
           caso 2
                salarioProfessor <- horasAula * 17.00
           caso 3
                salarioProfessor <- horasAula * 25.00
         fimescolha

         Escreval("Professor de nível ", tipoProfessor)
         Escreval("Hora(s) Trabalhada(s): ", horasAula)
         Escreval("Salário R$: ", salarioProfessor)
         Escreval("---------------------------------")
fimenquanto


fimalgoritmo
