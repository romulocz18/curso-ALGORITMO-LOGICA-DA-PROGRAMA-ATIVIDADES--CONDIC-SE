// O algoritmo mostra qual a ordem crescente de A, B, e C; 
#include <stdio.h>
main() // metodo principal;
{
      int a, b, c;
   printf("\n qual o valor de A: "); // definição de A;   
   scanf("%d",&a);
   printf("\n qual o valor de B: "); // definição de B;  
   scanf("%d",&b);
   printf("\n qual o valor de C: "); // definição de C;  
   scanf("%d",&c);

   if ((a <= b) && (a <= c )) // teste para saber A  e maior que os outros valores;
     if ((b <= c))
     printf("A ordem crecente............: %d - %d - %d",a,b,c); // oredem crecente conforme as condições;
     else 
     printf("A ordem crecente............: %d - %d - %d",a,c,b);// oredem crecente conforme as condições;
    else if (( b <= a) && (b <= c))// teste para saber B  e maior que os outros valores;
    if (a <= c)
    printf("A ordem crecente............: %d - %d - %d",b,a,c);// oredem crecente conforme as condições;
    else
    printf("A ordem crecente............: %d - %d - %d",b,c,a); // oredem crecente conforme as condições;
    else if (a <= b)// teste para saber C  e maior que os outros valores;
    printf("A ordem crecente............: %d - %d - %d",c,a,b);// oredem crecente conforme as condições;
    else 
    printf("A ordem crecente............: %d - %d - %d",c,b,a);

    printf("\n\n>>>>>>>>>>>>>>>>>>>>>FIM de Sistema<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ");
   
}