algoritmo "compra celular"
// Função : Recebe o preço do celular e verifica se pode comprar (< 500)
// Autor : Tiago Valério
// Data : 17/04/2017
// Seção de Declarações 
var
precoCelular : Numerico

inicio
// Seção de Comandos 
Escreva("Informe o preço do celular R$: ")
Leia(precoCelular)

se (precoCelular < 500) entao
   Escreva("Compra liberada, celular de R$: ", precoCelular)
fimse

fimalgoritmo
