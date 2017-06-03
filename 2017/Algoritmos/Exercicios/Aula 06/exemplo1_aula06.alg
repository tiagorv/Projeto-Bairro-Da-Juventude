algoritmo "verifica_media"
// Função : Recebe 3 notas e verifica se aluno foi aprovado
// Autor : Tiago Valério
// Data : 19/04/2017
// Seção de Declarações 
var
Nota1, Nota2, Nota3, Media : Numerico

inicio
// Seção de Comandos 
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
          Escreva("Aluno com direito a provão com nota : ", media)
     senao
          Escreva("Aluno Reprovado com nota : ", media)
     fimse
fimse


fimalgoritmo
