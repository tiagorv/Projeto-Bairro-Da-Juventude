algoritmo "verifica_triangulo"
// Fun��o : Recebe os lados de um triangula e demonstra o seu tipo
// Autor : Tiago Val�rio
// Data : 24/04/2017
// Se��o de Declara��es 
var
lado1, lado2, lado3 : Inteiro
inicio

// Se��o de Comandos 
Escreva("Informe o tamanho do lado 1 do tri�ngulo: ")
Leia(lado1)

Escreva("Informe o tamanho do lado 2 do tri�ngulo: ")
Leia(lado2)

Escreva("Informe o tamanho do lado 3 do tri�ngulo: ")
Leia(lado3)

se ((lado1 = lado2) e (lado2 = lado3)) entao
   Escreva("(", lado1, ", ", lado2, ",", lado3, ") = Tri�ngulo Equilatero")
senao
     se ((lado1 = lado2) ou (lado2 = lado3) ou (lado1 = lado3)) entao
        Escreva("(", lado1, ", ", lado2, ",", lado3, ") = Tri�ngulo Isosceles")
     senao
        Escreva("(", lado1, ", ", lado2, ",", lado3, ") = Tri�ngulo Escaleno")
     fimse
fimse




fimalgoritmo
