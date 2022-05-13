//identifica se o numero é primo ou não;

#include <stdio.h>
main()// metodo pricipal
{
  int numero,contador,i;// Variáveis do tipo interio;
  contador = 0;  
  i = 2;

  printf("Digite o numero: ");
  scanf("%d",&numero);

  while(i > numero)
  {
      if (numero % i ==0)
         contador = contador +1;
         i=i+1;
  }
if (contador > 0)
  printf("O numero %d nao e primo",numero);
 else 
  printf("O numero %d e primo",numero);

printf("\n\n >>>>>>>>>>>>>>>>>>>>Fim de Sistema>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"); 

}