//O algoritmo mostra qual ordem cresente vai ser estabalecida entre as variáveis A e B; 

#include <stdio.h>
main() // Correspode ao metedo principal;
{
int a,b; //as variáveis 
printf("\n Digite o valor de a: "); // Mostra qual o valor a ser escolhido por variável A;
scanf("%d",&a);

printf("\n Digite o valor de b: "); // Mostra qual o valor a ser escolhido pela a varável B;
scanf("%d",&b);

if (a > b) // Teste para saber qual a vai a ordem crecende conforme os numeros foram colocados; 
    
    printf("\n Em ordem crescente B= %d - A=%d",b,a); // caso o valor de A seja maior que B, o algoritmo ira me retorna essa enuciado;

else// senao
   printf("\n Em ordem crescente A= %d - B= %d",a,b);// caso o valor de B seja maior que A, o algoritmo ira me retorna esse enuciado;

   printf("\n\n<<<<<<<<<<<<<<<<<<<<<<<<fim de sistema>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
   return 0; //mostra isso no terminal;
   
}