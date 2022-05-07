// Esse Algoritmo mostra a quantidade de numeros pares e IMPARES ou PARES;

package JAVA;
import javax.swing.JOptionPane; // bibliotece para caixar de texto; 
public class PARESouIMPARESCONTA { 
    public static void main(String args[]){ 
  int numeroIncial, numeroFinal, numerosPares,numerosImpares,i; // as variáveis do tipo inteiro;
  
  numeroIncial = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de inicio : "));// definição do numero inicial; 
  numeroFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de final : "));// definição de numero final;
  numerosPares = 0; // sequencia de numeros pares;
  numerosImpares = 0; // sequencia de numeros inpares;
  i = numeroIncial; // definição para o laço de repetição;

  while(i <= numeroFinal) // laço de repetição 
  {
      if(i % 2 == 0)// condição para a repetição; % : caso a divisão dos numeros;
        numerosPares++;
      else// caso as variáveis não respeite as condições do IF.
         numerosImpares++;
        i++;
  }
  JOptionPane.showMessageDialog(null,"Entre o numero: " +numeroIncial+ // caso eu quera visualizar minhas saídas com a caixa de testo;
                                                   "\n o numero: " +numeroFinal+ 
                                                   "\n existem pares: " +numerosPares+ 
                                                   "\n e  impares: "+numerosImpares);

  System.out.println("Entre o numero: " +numeroIncial+ //verificar esse opção no terminal;
  "\n o numero: " +numeroFinal+ 
  "\n existem pares: " +numerosPares+ 
  "\n e  impares: "+numerosImpares);                                               
}
    
}
