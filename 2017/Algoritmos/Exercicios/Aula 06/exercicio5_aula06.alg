algoritmo "verifica_triangulo"
// Função : Recebe os lados de um triangula e demonstra o seu tipo
// Autor : Tiago Valério
// Data : 24/04/2017
// Seção de Declarações 
var
lado1, lado2, lado3 : Inteiro
inicio

// Seção de Comandos 
Escreva("Informe o tamanho do lado 1 do triângulo: ")
Leia(lado1)

Escreva("Informe o tamanho do lado 2 do triângulo: ")
Leia(lado2)

Escreva("Informe o tamanho do lado 3 do triângulo: ")
Leia(lado3)

se ((lado1 = lado2) e (lado2 = lado3)) entao
   Escreva("(", lado1, ", ", lado2, ",", lado3, ") = Triângulo Equilatero")
senao
     se ((lado1 = lado2) ou (lado2 = lado3) ou (lado1 = lado3)) entao
        Escreva("(", lado1, ", ", lado2, ",", lado3, ") = Triângulo Isosceles")
     senao
        Escreva("(", lado1, ", ", lado2, ",", lado3, ") = Triângulo Escaleno")
     fimse
fimse




fimalgoritmo
