#include <stdio.h>
main()
{
int numeroIncial, numeroFinal, numerosPares, numerosImpares,i;

numerosPares = 0;
numerosImpares = 0;

printf("\n Digite um numero: ");
scanf("%d",&numeroIncial);
printf("\n Digite um numero: ");
scanf("%d",&numeroFinal);

i = (numeroIncial);
while(i <= numeroFinal)
{
  if(i % 2 == 0)
    numerosPares++;// igual a numerosPares = numerosPares + 1;
 else
    numerosImpares++;// igual a numerosImpares = nuemrosIMpares + 1;
    i++;

}
printf("\n Entre o numero %d e o numero %d exixtem %d pares e %d impares",numeroIncial,numeroFinal,numerosPares,numerosImpares);
printf("\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>fim de sistema<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

}