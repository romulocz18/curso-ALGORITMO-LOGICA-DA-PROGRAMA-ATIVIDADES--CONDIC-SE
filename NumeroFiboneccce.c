//O algoritmo indetifica o  numero fibonacce de um laço de repetição de 1 á 10;


#include <stdio.h>
main() // metodo principal
{
    int i, numeroAnterio, numeroAtual, numeroNovo; // definição das variáveis;
    numeroAnterio = 0;
    numeroAtual = 1;
    printf("o 1. numero fibonacce e 1\n ");
    for ( i=2;i<=10;i++) // laço de repetição;
    {
        numeroNovo = numeroAtual + numeroAnterio; // padrao para descobrir o numero fibonacce;
        numeroAnterio = numeroAtual;
        numeroAtual = numeroNovo;
        printf("O %d numero fiboneccci e %d\n",i,numeroNovo); // mostra quais os numeros fibonacce;
    }
printf("\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>Fim de Sistema<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
}