// O algoritmo mostra a media da turma e também quais foram os alunos que ficaram acima da media;
// utilizando variáveis com VETORES;
#include <stdio.h>
main() //  metodo princial;
{
float notas[5];// variável do tipo real com VETORES;
float CalcMedia, SomaMedia; // variável do tipo real;
int contador; // variável do tipo interio;
contador = 0;
printf("Digite o valor da nota  1: "); //definição da n1
scanf("%f",&notas[1]);
printf("Digite o valor da nota  2: "); //definição da n2
scanf("%f",&notas[2]);
printf("Digite o valor da nota  3: "); //definição da n3
scanf("%f",&notas[3]);
printf("Digite o valor da nota  4: "); // definição da n2
scanf("%f",&notas[4]);
printf("Digite o valor da nota  5: "); //definição da n3
scanf("%f",&notas[5]);

SomaMedia = notas[1] + notas[2] + notas[3] + notas[4] + notas[5]; // calculo da soma das notas;
CalcMedia = SomaMedia / 5; // media da turma;

if ( notas[1] >= CalcMedia)//condição para ficar acima da media;
        contador++;
if ( notas[2] >= CalcMedia)// condiçãos para ficar aciama da media;
        contador++;
if ( notas[3] >= CalcMedia)//condiçãos para ficar aciama da media;
        contador++;
if ( notas[4] >= CalcMedia)//condiçãos para ficar aciama da media;
        contador++;
if ( notas[5] >= CalcMedia)// condiçãos para ficar aciama da media;
        contador++;        
printf("a media da turma e %f",CalcMedia); // saidas;
printf("e ficaram acima da media %d",contador);// saidas;
printf("\n\n>>>>>>>>>>>>>>>>>>>>>>>fim de Sistema<<<<<<<<<<<<<<<<<<<<<<<<<<");
}