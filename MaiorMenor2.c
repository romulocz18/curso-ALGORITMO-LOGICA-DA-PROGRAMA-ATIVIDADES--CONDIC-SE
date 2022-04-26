// O algoritmo encontra  o valor maior e também o menor entre as variáveis N1, N2, N3;
//////////// forma de encontra - POR CADEIA- ALGORITMO 2;


#include <stdio.h>
main () // medoto principal 
{
    int n1, n2, n3; // As variáveis do tipo INTERIOS;
    
    printf("Digite o valor de n1 = "); // Definição da variával N1;
    scanf("%d",&n1);
    
    printf("Digite o valor de n2 = "); // Definição da varável N2;
    scanf("%d",&n2);

    printf("Digite o valor de n3 = "); // Definição da varável N3;
    scanf("%d",&n3);
    
    if ((n1 >= n2) && (n1 >= n3)) // Condição se para saber se MAIOR E MENOR; 
    {
           printf("\n maior numero : %d",n1);
        if (n2 <= n3)
           printf("\n menor numero : %d",n2);
        else 
            printf("\n menor numero : %d",n3);
    }        
     else if ((n2 >= n1) && (n2 >= n1)) // Condição se para saber se MAIOR E MENOR;
    {
    printf("\n maior e o : %d",n2);
    if (n1 <= n3)
    printf("\n menor e o : %d",n1);
    else
     printf("\n menor e o: %d",n3);
    }
    else 
    {
        printf("\n o maior e o : %d",n3); // Condição se para saber se MAIOR E MENOR REF N3;
        if (n2 <= n1)
        printf("\n o menor e o : %d",n2);
        else 
        printf("\n o menor e o : %d",n1);
    }

  printf("\n <<<<<<<<<<<<<<<<<<<<<<<<fim>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
  
}
