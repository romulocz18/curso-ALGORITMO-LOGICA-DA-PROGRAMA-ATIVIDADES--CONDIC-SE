// esse Algoritmo utilizar laços de repetição para mostra a tabuada de um determinado numero inteiro;


#include <stdio.h>
 main() // metodo principal;
{
    int numero, i;
    
    printf("\n Digite um numero.: "); // definição do numero; 
    scanf("%d",&numero);
    
   for( i=1;i <= 9;i=i+1)// definição das alternancias;

   printf("\n %d x %d = %d",numero,i,(numero * i )); // Saída com a tabuada do numero escolhido;

printf("\n\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<fim de sistema >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


}