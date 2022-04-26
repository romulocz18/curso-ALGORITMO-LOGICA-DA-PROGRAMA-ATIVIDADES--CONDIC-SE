// O algoritmo encontra  o valor maior e também o menor entre as variáveis N1, N2, N3;
//////////// forma de encontra - ALGORITMO 1;


#include <stdio.h>
int main () //metodo principal;
{
    int n1, n2, n3; // as varáveis do tipo inteiro;
    
    printf("\n Digite o valor de n1 = "); // Definição da variáveal N1;
    scanf("%d",&n1);
    
    printf ("\n Digite o valor de n2 = "); // Definação da variável N2;
    scanf("%d",&n2);

    printf("\n Digite o valor de n3 = "); // Definição da variável N3;
    scanf("%d",&n3);

    if ((n1 >= n2) && (n1 >= n3)) // Condição se para saber se MAIOR E MENOR;
     printf("\n o maior e o .: %d",n1);
    else if ((n2 >= n1) & (n2 >= n3))
      printf("\n o maior e o .: %d",n2);
    else
       printf("\n o maior e o.: %d",n3);
    if 
      ((n1 <= n2) && (n1 <= n2)) // // Condição se para saber se MAIOR E MENOR;
        printf("\n o menor numero e o = %d",n1);
    else if ((n2 <= n1) && (n2 <= n3))
        printf("\n o menor numero e o = %d",n2);
    else 
        printf("\n o nenor nuemro e o = %d",n3);

 printf("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>fim de sistema<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
          

    
}