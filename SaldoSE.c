// O algoritmo mostra o valor descontado de um cheque em uma conta, dependendo do saldo da conta e 
// tambem do valor do cheque, caso os valores sejam compativeis a operação será relizada e mostrando
// o saldo final. caso o contratio mostra que saldo é insuficiente e cheque não sera descontado.


#include <stdio.h>
main() // metodo pricipal;
{
    float SaldoInicial, ValorCheque;// as váriaveis do tipo float
     
    printf("\n Digite o saldo da conta: "); // entradas
    scanf("%f",&SaldoInicial);
    
    printf("\n Digite o valor do cheque: "); //entradas 
    scanf("%f",&ValorCheque);

    if (ValorCheque <= SaldoInicial) // condições para ser realizar as entradas;
    {
      SaldoInicial = SaldoInicial - ValorCheque;
      printf ("\n O seu nova saldo........: %f",SaldoInicial); // saídas;
    }
    else 
    {
        printf("\n atenção, este cheque não pode descontado.: ");// saídas;
        printf("\n O seu novo saldo...........: %f",SaldoInicial);

    }
    
    printf("\n >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>fim de sistem<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");   
        return 0;
}