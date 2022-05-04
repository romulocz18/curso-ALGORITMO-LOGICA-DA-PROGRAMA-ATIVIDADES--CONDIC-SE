// O algoritmo mostra a tabuada de qualquer numero interio, utilizando o loço de repetição DO WHILE;

#include <stdio.h>
main(){ // metodo principal;

    int numero,i; // definição das variáveis;
    
    printf("Didite um numero.: "); // escolha do numero para a varivel.
    scanf("%d",&numero); 
    i = 1;
    do
    {
        printf("\n %d x %d = %d",numero,i,(numero * i)); // mostras a execução da tabuada;
        i++;
    }

    while ( i <= 9); // condição para a repetição; 

    printf("\n >>>>>>>>>>>>>>>>>>>>>>>>fim de Sistema<<<<<<<<<<<<<<<<<<<<<<<<<");
}