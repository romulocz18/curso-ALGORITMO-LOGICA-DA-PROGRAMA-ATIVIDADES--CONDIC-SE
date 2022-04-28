// O algoritmo mostras as testa as condições necessaria para ser um triangulo, um vez que os lados respeita a propriedades 
// O sistema também mostra se é um triangulo equilatero, isosceles, escaleno;
#include <stdio.h>
main() // metodo principal;
{
float l1 ,l2, l3;
printf("\n Digite o lado l1: "); // definiação do primiero l1;
scanf("%f",&l1);

printf("\n Digite o lado l2: ");// definiação do primiero l2;
scanf("%f",&l2);

printf("\n Digite o lado l3: ");//// definiação do primiero l3;
scanf("%f",&l3);

if ((l1 < (l2 + l3)) && (l2 <(l1 + l3)) && (l3 < (l2 + l3))) // condições necessaria para ser um triangulo;
    if ((l1 = l2) && (l2 = l3))
  printf("O triangulo equilatero");// saídas;
    else if((l1 == l2) || (l2 == l3) || (l3 == l1))
    printf ("O tringulo isosceles");// saídas;
    else
    printf("O triangulo escaleno");// saídas;

else 
   printf("Nao e um triangulo");

}