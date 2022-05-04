// Esse algoritmo mostra a tabuada de qualquer numero inteiro usando o laço de repetição ENQUANTO;

#include <stdio.h>
int main() // metodo principal;
{
    int numero,i; // as variáveis

    printf("\n Digite um numero: "); // digite a o numero para ser mostra atabuada;
    scanf("%d",&numero);
     i = 1; // Definição de i
    while( i <= 9) // condição para o enquanto;
    {
        printf("\n%d x %d = %d",numero,i,(numero * i )); // saída;
        i++; // incrementação para a repetição // isso pode ser igual i=i+1;

    }
    printf("\n>>>>>>>>>>>>>>>>>>>>>>>fim de sistema<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
}
