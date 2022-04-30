#include <stdio.h>
main() // metodo principal;
{
    int numero;
    printf("\n Qual o numero para se indentificado em PAR ou IMPAR: "); // denição do numero par se escolido;
    scanf("%d",&numero);
     
    if ( numero % 2 == 0)// condição;
    printf("esse numero %d e Par",numero);
    else
     printf ("esse numero %d e Impar",numero);

printf("\n\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Fim de sistema>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

}