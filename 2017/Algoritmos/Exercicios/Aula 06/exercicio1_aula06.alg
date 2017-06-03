algoritmo "calcula_ir"
// Função : Recebe o salario e calcula o imposto de renda
// Autor : Tiago Valério
// Data : 24/04/2017
// Seção de Declarações 
var
salario, salarioLiquido, impostoRenda : Numerico
inicio

// Seção de Comandos 
Escreva("Informe o salário do trabalhador R$: ")
Leia(salario)

se (salario > 3000) entao
   impostoRenda <- salario * 0.15
senao
   impostoRenda <- salario * 0.02
fimse

salarioLiquido <- salario - impostoRenda

Escreval("Salário Bruto R$: ", salario)
Escreval("Imposto de Renda R$: ", impostoRenda)
Escreva("Salário Líquido R$: ", salarioLiquido)



fimalgoritmo
