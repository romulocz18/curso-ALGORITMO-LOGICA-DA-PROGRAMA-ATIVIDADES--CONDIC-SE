// esse algoritmo mostra a media da turma de quantidade de alunos que ficaram acima da media;
///Utilizando variáveis com vetores///
//// Usando laços de repetição//


#include <stdio.h>
main()// metodo principla;
{
float notas[5]; // estrutura para colocar uma variável usando os vetores; nome da varivel nome e quantidade que eu quero usar;
float CalcMedia, SomaNotas; // variável do tipo Real;
int i,contador; // variável do tipo inteiro;

contador = 0;
SomaNotas = 0;
for(i=0;i<=4;i++) // laço de repetição com a variável de vetor;
 {
 printf("\ndigite a nota %d : ",i+1); // estrura para a repetição estrura; o texto que vem nas variáveis;
 scanf("%f",&notas[i]);
 SomaNotas = SomaNotas + notas[i]; // soma da variável de vetores; 
 }
 CalcMedia = SomaNotas / 5; // soma da media;
  for(i=0;i<=4;i++)
      if(notas[i] >= CalcMedia)// condição para ficar acima da media;
       contador = contador + 1;
  
 
 printf("\nA media da turma e %f",CalcMedia); // saidas; 
 printf("\ne ficaram acima da media %i alunos",contador); // saídas; 
 printf("\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>fim de sistema<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"); // saidas;
 
 }

