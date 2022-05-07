// Esse Algoritmo mostra a quantidade de numeros pares e IMPARES ou PARES;
/// -Com uma frase mostrando numero incorreto toda as vezes que o usuario colocar um numero menor final do o inicial;


package JAVA;
import javax.swing.JOptionPane; // biblioteca para caixa de texto;
public class PARouIMPARCONTAII {
    public static void main(String args[]){ 
  int numeroIncial, numeroFinal, numerosPares,numerosImpares,i; // as variáveis do tipo interio;
  
  numeroIncial = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de inicio : ")); // definição do numero inicial;
  numerosPares = 0; // numeros pares;
  numerosImpares = 0; // numeos impares;
  i = numeroIncial; // laço de repetição;
  do
  {
     numeroFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero Final: ")); //definição do numero final; 
     if(numeroFinal < numeroIncial)
     JOptionPane.showMessageDialog(null,"Numero final invaido, tem que ser maior do que "+numeroIncial); // essa mesagem vai aparecer quando o valor digitado pelo usuario não respita a REGRA
  }
  while(numeroFinal < numeroFinal); // para o loço de  repetição; 

  while(i <= numeroFinal)
  {
      if(i % 2 == 0) // condição para a repetição;
        numerosPares++;
      else
         numerosImpares++;
        i++; // ritmo da repetição;
  }
  JOptionPane.showMessageDialog(null,"Entre o numero: " +numeroIncial+ // saída na caixa de texto;
                                                   "\n o numero: " +numeroFinal+ 
                                                   "\n existem pares: " +numerosPares+ 
                                                   "\n e  impares: "+numerosImpares);

  System.out.println("Entre o numero: " +numeroIncial+ // saida no terminal;
  "\n o numero: " +numeroFinal+ 
  "\n existem pares: " +numerosPares+ 
  "\n e  impares: "+numerosImpares);
  }
}      