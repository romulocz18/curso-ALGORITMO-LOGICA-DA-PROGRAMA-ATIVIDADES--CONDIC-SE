// Algoritmo mostra se um numero é primo;


package JAVA;
import javax.swing.JOptionPane; // biblioteca para caixa de texto 
public class NumerosPRIMOS {
   public static void main(String args[]){ //metodo princial;

    int numero, contador,i;// as variáveis o tipo interios;
    contador = 0;
    i = 2;

    numero = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero: ")); // definição dos numero;
    while (i < numero);
    {
        if (numero % i == 0)
           contador = contador + 1;
       i = i+1;    
    }

    if (contador > 0)
        JOptionPane.showMessageDialog(null,"O numero"+numero+"não é primo"); // saída caso o não seja primo;  
    else 
        JOptionPane.showMessageDialog(null,"O numero"+numero+ "é primo"); // saída caso o numero seja primo;    
   
  }  
}
