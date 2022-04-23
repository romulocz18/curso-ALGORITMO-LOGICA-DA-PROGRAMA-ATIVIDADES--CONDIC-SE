// O algoritmo tira a media das 3 notas e depois analisa se o aluno foi APROVADO,
// RECUPERAÇÃO ou entao REPROVADO;

#include <stdio.h> 
main() // Corresponde ao metodo principal 
{
    float prova1, prova2, prova3, media; // Difinição das variáveis;

    printf("\n Qual a nota da primira prova: "); // colocando a nota da prova1;
    scanf("%f",&prova1);

    printf("\n Qual a nota da segunda prova: "); // colocando a nota da prova2;  
    scanf("%f",&prova2);

    printf("\n Qual a nota da terceira prova: "); // colocando a nota da prova3;
    scanf("%f",&prova3);

    prova1 = prova1 * 2 /10;
    prova2 = prova2 * 3 /10;  // processado as notas;
    prova3 = prova3 * 5 /10;

    media = prova1 + prova2 + prova3; // retirando a media;

    if (media >= 6) // a base da condições para as saídas 
                  printf("\n O aluno esta APROVADO com media: %f",media); // caso minha media >=7; esse sera meu retorno.
    else if ( media >= 4)
                  printf("\n O aluno esta de RECUPERACAO com meida: %f",media); // caso minha media >=4; esse sera meu retorno.
    else 
         printf("\n O aluno esta REPROVADO com a media: %f",media);// caso minha media seja menor do <=4; esse sera meu retorno.
   
     printf("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>fim de sistema<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
   
    return 0;// mostra o resltado no treminal;


}