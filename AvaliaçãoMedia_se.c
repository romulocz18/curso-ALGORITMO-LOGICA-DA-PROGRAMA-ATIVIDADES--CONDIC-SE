// O algoritmo faz o calculo da media com a nota da tres provas e também me dar 
// um retorno para saber se o auluno foi aprovada ou reprovado.

#include <stdio.h>
main () // metodo principal;
{
    float prova1, prova2, prova3, media; // a definição das variáveis do tipo (real);

    printf("Digite a nota da prova 1: "); //  incerindo nota da prova1;
    scanf("%f",&prova1);
    
    printf("Digite a nota da prova 2: "); // incerindo nota da prova2;
    scanf("%f",&prova2);

    printf("Digite a nota da prova 3: "); // incerindo nota da prova3;
    scanf("%f",&prova3);

    prova1 = prova1 * 2 / 10; // calculando o peso das notas 
    prova2 = prova2 * 3 / 10;
    prova3 = prova3 * 5 / 10;

    media = (prova1 + prova2 + prova3); //calculando a media das provas;
    
    if (media >=6) // processamento se obteve a media 
             printf("Aprovado com meida: %f",media); // caso aluno seja aprovado esse sera meu retorno;
    else 
             printf("Reprovado com a media: %f",media); // caso o aluno seja reprovado esse sera meu retorno;

 return 0; // mostra o resultado no terminal;

}