algoritmo "calcula_hora_aula"
// Função : Recebe a quantidade de horas e o tipo de professor e calcula o salario
// Autor : Tiago Valerio
// Data : 26/04/2017
// Seção de Declarações 
var

horasAula, tipoProfessor : Inteiro
salarioProfessor : Numerico

inicio
// Seção de Comandos 
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
Escreva("Salário R$: ", salarioProfessor)



fimalgoritmo
