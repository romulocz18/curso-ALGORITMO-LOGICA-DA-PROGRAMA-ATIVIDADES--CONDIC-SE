// O algoritmo mostra os numero pares e impares de um determinado intervalo;
/// -Com uma frase mostrando numero incorreto toda as vezes que o usuario colocar um numero menor final do o inicial;



#include <stdio.h>
main()
{
int numeroIncial, numeroFinal, numerosPares, numerosImpares,i; // variáveis do tipo interio;

numerosPares = 0;
numerosImpares = 0;

printf("\n Digite um numero: "); // definição do numero inicial;
scanf("%d",&numeroIncial);
i = numeroIncial;
do
{
    printf("Digite o numero final maior do que %d :",numeroIncial);
    scanf("%d",&numeroFinal);
    if(numeroFinal < numeroIncial)
    printf("Numero final invalido, deve ser maior do que o inicial"); //  caso o usuário mostra digite um valor final menor do que o inicial;
}

while(numeroFinal < numeroIncial);

while(i <= numeroFinal) // laço de repetição;
{
  if(i % 2 == 0)
    numerosPares++;// igual a numerosPares = numerosPares + 1;
 else
    numerosImpares++;// igual a numerosImpares = nuemrosIMpares + 1;
    i++;

}
printf("\n Entre o numero %d e o numero %d exixtem %d pares e %d impares",numeroIncial,numeroFinal,numerosPares,numerosImpares);// saídas;
printf("\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>fim de sistema<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

}
