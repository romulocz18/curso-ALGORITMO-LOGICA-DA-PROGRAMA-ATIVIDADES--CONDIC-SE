//Algoritmo mostra a media de 10 notas, na condição dessa notas sempre apenas de numeros entre 0 a 10,
// caso essa não tenha não aceito;


#include <stdio.h>
int main(){ // metodo principal;
    float nota, CalcMedia, SomaNota; // as variáveis do tipo Real;
    int i; // varável do tipo Inteira;

    for(i=1;i<=10;i++) // Condição para a repetição FOR;
    {
      printf("Digete a %d. das 10 notas: ",i);// definição para a escolha;
      scanf("%f",&nota);
      if ((nota >= 0) && (nota <= 10)) // condição para ser incerido as notas;
      SomaNota = SomaNota + nota; // soma das notas;
      else // definição coso não seja respitado o padrao de notas;
      {
         printf ("\n nota invalida, digite apenas notas de 0 a 10\n");// mensagem caso o usuario não respeite o padrao que seja colocado as notas;
         i--;// menos um para que o usuario coloque a nota certa caso digite a nota fora do padrao;
      }
      
    }

    CalcMedia = SomaNota / 10;// calculo da media;
     printf("A mdeia da turma e %f",CalcMedia); // mostra media das notas;
     printf("\n\n >>>>>>>>>>>>>>>>>>>>>>>>>>fim de sistema>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

} 