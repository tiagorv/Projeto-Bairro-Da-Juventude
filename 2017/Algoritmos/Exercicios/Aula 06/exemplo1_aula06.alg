algoritmo "verifica_media"
// Fun��o : Recebe 3 notas e verifica se aluno foi aprovado
// Autor : Tiago Val�rio
// Data : 19/04/2017
// Se��o de Declara��es 
var
Nota1, Nota2, Nota3, Media : Numerico

inicio
// Se��o de Comandos 
Escreva("Informe a nota 1 do aluno: ")
Leia(Nota1)

Escreva("Informe a nota 2 do aluno: ")
Leia(Nota2)

Escreva("Informe a nota 3 do aluno: ")
Leia(Nota3)

Media <- (Nota1 + Nota2 + Nota3) / 3

se (media >= 7) entao
     Escreva("Aluno aprovado com nota : ", media)
senao
     //Aqui teremos os alunos com media menor que 7
     se (media >= 5) entao
          Escreva("Aluno com direito a prov�o com nota : ", media)
     senao
          Escreva("Aluno Reprovado com nota : ", media)
     fimse
fimse


fimalgoritmo
