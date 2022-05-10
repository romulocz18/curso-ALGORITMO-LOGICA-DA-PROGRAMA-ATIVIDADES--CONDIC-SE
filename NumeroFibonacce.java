//O algoritmo indetifica o  numero fibonacce de um laço de repetição de 1 á 10;


package JAVA;
import javax.swing.JOptionPane;// biblioteca para caixa de texto;
public class NumeroFibonacce {
   public static void main(String args []){
       int i,numeroAnterior, numeroAtual, novoNumero; // as variáveis 
       
       numeroAnterior = 0;
       numeroAtual = 1;
       String mensagem = "o 1.numero fibonacce e 1\n";
       for (i=2;i<10;i++)
       {
           novoNumero = numeroAtual + numeroAnterior; // processamento dos dados;
           numeroAnterior = numeroAtual;
           numeroAtual = novoNumero;
           mensagem = mensagem + "o "+i+"numero fibonacci é"+novoNumero+ "/n";// laço de repetição;
       }
       JOptionPane.showMessageDialog(null,"mensagem"); // saídas respostas;
   }


   
    
}
