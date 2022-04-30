// Esse algoritmo mostra  como descobrimos o meses do ano refente ao numero;
//Para fazer esse algoritmo usamos a  funcionalidade do CASE;
  
#include <stdio.h>
  main()
  {
      int mes;
    printf("\n Digite numero para para serber o mes correspondente: "); // qual o numero do mes
    scanf("%d",&mes);

    switch (mes)// ref ao numero do mês;
    {
        case 1: printf("O mes = Janeiro");break; 
        case 2: printf("O mes = Fevereiro");break;
        case 3: printf("O mes = Março");break;
        case 4: printf("O mes = Abril");break;
        case 5: printf("O mes = Maio");break;
        case 6: printf("O mes = Junho");break;
        case 7: printf("O mes = Julho");break;
        case 8: printf("O mes = Agosto");break;
        case 9: printf("O mes = Setembro");break;
        case 10: printf("O mes = Outubro");break;
        case 11: printf("O mes = Novembro");break;
        case 12: printf("O mes = Dezembro");break;
        default: printf(" Esse numero noa corresponde oa meses do ano");
    }
  }