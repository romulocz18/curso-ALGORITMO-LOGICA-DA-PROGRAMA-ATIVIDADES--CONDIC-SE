//Algoritmo mostra os alunos que ficaram acima da media;

#include <stdio.h>
main()
{
    float n1,n2,n3,n4,n5,calcMedia,somaNota;// definição das variáveis do tipo Real
    int contador = 0;//definição das variáveis do Inteiro;
    printf("Digite a nota 1: "); // definição da n1 
    scanf("%f",&n1);
    printf("Digite a nota 2: ");// definição da n2;
    scanf("%f",&n2);
    printf("Digite a nota 3: ");// definição da n3;
    scanf("%f",&n3);
    printf("Digite a nota 4: ");// definição da n4;
    scanf("%f",&n4);
    printf("Digite a nota 5: ");// definição da n5;
    scanf("%f",&n5);

    somaNota = n1+n2+n3+n4+n5;// processamento;
    calcMedia = somaNota / 5;// processamento;

    if ( n1 > calcMedia) // condição para ser acima da media;
    contador = contador + 1; 
    if ( n2 > calcMedia) // condição para ser acima da media;
    contador = contador + 1; 
    if ( n2 > calcMedia)// condição para ser acima da media;
    contador = contador + 1; 
    if ( n3 > calcMedia)// condição para ser acima da media;
    contador = contador + 1; 
    if ( n4 > calcMedia)// condição para ser acima da media;
    contador = contador + 1; 
    if ( n5 > calcMedia)// condição para ser acima da media;
    contador = contador + 1; 

    printf("\n a media geral foi.: %f",calcMedia);// saídas 
    printf("\n alunos ficaram com a nota acima da media",contador);// saídas

    printf("\n\n\\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>Fim de Sistema<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
}