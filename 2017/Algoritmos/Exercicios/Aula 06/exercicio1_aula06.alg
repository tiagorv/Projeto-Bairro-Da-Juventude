algoritmo "calcula_ir"
// Fun��o : Recebe o salario e calcula o imposto de renda
// Autor : Tiago Val�rio
// Data : 24/04/2017
// Se��o de Declara��es 
var
salario, salarioLiquido, impostoRenda : Numerico
inicio

// Se��o de Comandos 
Escreva("Informe o sal�rio do trabalhador R$: ")
Leia(salario)

se (salario > 3000) entao
   impostoRenda <- salario * 0.15
senao
   impostoRenda <- salario * 0.02
fimse

salarioLiquido <- salario - impostoRenda

Escreval("Sal�rio Bruto R$: ", salario)
Escreval("Imposto de Renda R$: ", impostoRenda)
Escreva("Sal�rio L�quido R$: ", salarioLiquido)



fimalgoritmo
