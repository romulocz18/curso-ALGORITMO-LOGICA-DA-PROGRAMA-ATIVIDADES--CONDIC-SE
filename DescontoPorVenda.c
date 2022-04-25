// O algortimo mostra qual o desconto que vai de dado dependendo do valor da compra, com as condiçoes de ser 10%,15%,20%;

#include <stdio.h>
main() // medoto principal;
{
    float ValorCompra, ValorDesconto, ValorPagar; // são as variáveis do tipo float = real;
    int desconto;// variável do tipo int = interio;
    char nome[30];// varivel do tipo caracter ou alfanumerico = char;

printf ("\n Digite o nome do cliente: ");// entradas;
scanf("%s",nome);// qual a varivel que faz referencia;

printf("\n Digite o valor da compra:");// entradas 
scanf("%f",&ValorCompra);// qual a varivel que faz referencia;

if (ValorCompra <= 200) // condição para o saber se compra tera o valor de 10%;
     desconto = 10;
else if (ValorCompra >= 500) // condição para o saber se compra tera o valor de 15%;
     desconto = 15;
else 
    desconto = 20; // condição para o saber se compra tera o valor de 20%;

ValorDesconto = (ValorCompra * desconto) / 100; // Calculando o desconto;
ValorPagar = ValorCompra - ValorDesconto;// Calculando o valor da ser pago;

printf("\n O nome do cliente:  %s",nome);
printf("\n Valor da compra: %f",ValorCompra);
printf("\n percentual de desconto: %d",desconto);          // saídas;
printf("\n O valor do desconto: %f",ValorDesconto);
printf("\n O valor a ser pago: %f",ValorPagar);

printf("\n\n<<<<<<<<<<<<<<<<<<<<<<<<<<fim de sistema>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

}