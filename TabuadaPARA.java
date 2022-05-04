// Algoritmo mostra o laços de repetição para descobri qual a tabuada de um numero interio;

package JAVA;
import javax.swing.JOptionPane; // biblioteca;
public class TabuadaPARA {
    public static void main(String args[]) {
       
        int numero, i; // variável o tipo inteira;
        String mensagem = ""; // variável o tipo alfanumerico;
        
    numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero")); // Definição do numero que excute a tabuada;
        for(i=1;i <= 9;i=i+1)
        mensagem = mensagem + "\n"+numero + " x "+i+" = " +(numero * i);// abreviação da varival;
        System.out.println(mensagem); // mostra no terminal;
        JOptionPane.showMessageDialog(null, mensagem);// saída para a caixa de texto;
        



      
        




    }  
}
